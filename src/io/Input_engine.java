package io;
import Collection_managment.Collection_invoker;
import Collection_managment.Collections;
import Collection_managment.Collection_receiver;
import Commands.*;
import Loading_managment.Parser;

import java.util.*;

public class Input_engine {
    private static Collection_receiver receiver = new Collection_receiver();
    public static void executeCommand(Command command) {
        Collections.addCommand(command);
        command.execute();
    }
    public static void launcher() {
        Collections.addElemToCommandMap(Cmd_add_elem.getName(), new Cmd_add_elem(receiver));
        Collections.addElemToCommandMap(Cmd_help.getName(), new Cmd_help(receiver));
        Collections.addElemToCommandMap(Cmd_sout_collection.getName(), new Cmd_sout_collection(receiver));
        Collections.addElemToCommandMap(Cmd_history.getName(), new Cmd_history(receiver));
        Collections.addElemToCommandMap(Cmd_print_unique_author.getName(), new Cmd_print_unique_author(receiver));
        Collections.addElemToCommandMap(Cmd_clear.getName(), new Cmd_clear(receiver));
        Collections.addElemToCommandMap(Cmd_save.getName(), new Cmd_save(receiver));
        Collections.addElemToCommandMap(Cmd_head.getName(), new Cmd_head(receiver));
        Collections.addElemToCommandMap(Cmd_info.getName(), new Cmd_info(receiver));
        Collections.addElemToCommandMap(Cmd_exit.getName(), new Cmd_exit(receiver));
        Output_engine.greeting_msg();
        Collections.addElemsFromList(Parser.parse());
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                Output_engine.prompt();
                String response = sc.nextLine().trim();
//            sc.useDelimiter(" ");
//            String response = sc.next();
//            Integer id = sc.nextInt();
                Command currentCommand = Collections.searchCommand(response);
                executeCommand(currentCommand);
            } catch (NullPointerException e) {
                System.out.println("Введена некорректная команда. Со списком команд можно ознакомиться по команде help");
            }

        }
    }
}
