package io;
import managment.Collections;
import managment.CollectionReceiver;
import cmd.*;
import load.CollectionLoader;
import load.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Лончер, запускающий основной сканер, который считывает команды и аргументы в двух режимах: из файла и в формате обычного ввода через консоль
 */
public class InputEngine {
    private static final CollectionReceiver receiver = new CollectionReceiver();
    private static final File tmpFile = new File("unsaved.tmp");
    public static String resp = null;
    public static void executeCommand(Command command, String arg, Scanner scanner, Mode mode) {
        //Collections.addCommand(command);
        command.execute(arg, scanner, mode);
    }
    public static void init() {
        Collections.addElemToCommandMap(AddCmd.getName(), new AddCmd(receiver));
        Collections.addElemToCommandMap(HelpCmd.getName(), new HelpCmd(receiver));
        Collections.addElemToCommandMap(SoutCollectionCmd.getName(), new SoutCollectionCmd(receiver));
        Collections.addElemToCommandMap(HistoryCmd.getName(), new HistoryCmd(receiver));
        Collections.addElemToCommandMap(PrintUniqueAuthorCmd.getName(), new PrintUniqueAuthorCmd(receiver));
        Collections.addElemToCommandMap(ClearCmd.getName(), new ClearCmd(receiver));
        Collections.addElemToCommandMap(SaveCmd.getName(), new SaveCmd(receiver));
        Collections.addElemToCommandMap(HeadCmd.getName(), new HeadCmd(receiver));
        Collections.addElemToCommandMap(InfoCmd.getName(), new InfoCmd(receiver));
        Collections.addElemToCommandMap(ExitCmd.getName(), new ExitCmd(receiver));
        Collections.addElemToCommandMap(UpdateCmd.getName(), new UpdateCmd(receiver));
        Collections.addElemToCommandMap(PrintFieldDescendingMinimalPointCmd.getName(), new PrintFieldDescendingMinimalPointCmd(receiver));
        Collections.addElemToCommandMap(CountLessThanMinimalPointCmd.getName(), new CountLessThanMinimalPointCmd(receiver));
        Collections.addElemToCommandMap(RemoveLowerCmd.getName(), new RemoveLowerCmd(receiver));
        Collections.addElemToCommandMap(RemoveByIdCmd.getName(), new RemoveByIdCmd(receiver));
        Collections.addElemToCommandMap(ExecuteScriptCmd.getName(), new ExecuteScriptCmd(receiver));
        Collections.addElemsFromList(Parser.parse());
        Collections.sortCollection();
        System.out.println(Output_engine.greeting_msg());
        Scanner keyboardScanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^[yn]$");
        //Восстановление старых данных
        if (tmpFile.exists()&&tmpFile.length()!=0) {
            do {
                try {

                    System.out.println(Output_engine.collectionRestore());
                    System.out.print(Output_engine.prompt());
                    resp = keyboardScanner.nextLine().trim();
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
            } while (!pattern.matcher(resp).matches());
            if (resp.equals("y")) {
                CollectionLoader.load(tmpFile);
            }
        }
        launcher(keyboardScanner, Mode.DEFAULT, null, null);
    }
    public static void commandExecute(Scanner scanner, String[] tokens, Command currentCommand, File tmpFile, Mode mode) {
        String input = scanner.nextLine().trim();
        tokens = input.split(" ");
//        System.out.println("input: "+input+"tokens: "+ tokens[0]);
//        if (input.equals("")) {
//            scanner.nextLine();
//            input = scanner.nextLine().trim();
//        }
        //tokens = (String[]) scanner.useDelimiter(" ").tokens().toArray();
        currentCommand = Collections.searchCommand(tokens[0]);
        Collections.addCommand(currentCommand);
        if (tokens.length<2) {
            executeCommand(currentCommand, null, scanner, mode);
        } else {
            executeCommand(currentCommand, tokens[1], scanner, mode);
        }
        CollectionLoader.save(tmpFile);
    }
    public static void launcher(Scanner sc, Mode mode, Command currentCommand, String filename) {
        String[] tokens = new String[0];
        File file = null;
        try {
            file = new File(filename);
        } catch (NullPointerException e) {
            System.out.print(Output_engine.prompt());
        }
        switch (mode) {

            //Режим чтения команд с клавиатуры
            case DEFAULT -> {

                //Основной сканер
                while (true) {
                    try {
                        System.out.print(Output_engine.prompt());
                        commandExecute(sc, tokens, currentCommand, tmpFile, mode);
                    } catch (NullPointerException e) {
                        System.out.println(Output_engine.incorrectCommand());
                    }
                }
            }

            //Режим чтения команд из скрипта
            case FILE -> {

                Scanner fileScanner = null;
                try {
                    fileScanner = new Scanner(file);
                } catch (FileNotFoundException e) {
                    e.getStackTrace();
                }
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    System.out.println(Output_engine.accessError());
                    return;
                }
//                try {
//                    while (true) {
//                        assert fileScanner != null;
//                        if (!fileScanner.hasNextLine()) break;
//                        commandExecute(fileScanner, tokens, currentCommand, tmpFile);
//                    }
//                } catch (NullPointerException e) {
//                    System.out.println(e.getMessage());
//                    fileScanner.next();
//                }
                while (true) {
                    assert fileScanner != null;
                    if (!fileScanner.hasNextLine()) break;
                    commandExecute(fileScanner, tokens, currentCommand, tmpFile, mode);
                }
            }
        }
    }
}
