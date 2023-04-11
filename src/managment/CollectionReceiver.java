package managment;
import data.*;
import load.Serializer;
import io.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Класс, выполняющий команды
 */
public class CollectionReceiver {
    public int iterations=0;
    public void help() {
        System.out.println("help : вывести справку по доступным командам\n" +
            "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
            "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
            "add : добавить новый элемент в коллекцию\n" +
            "update {id} : обновить значение элемента коллекции, id которого равен заданному\n" +
            "remove_by_id {id} : удалить элемент из коллекции по его id\n" +
            "clear : очистить коллекцию\n" +
            "save : сохранить коллекцию в файл\n" +
            "execute_script {file_name} : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
            "exit : завершить программу (без сохранения в файл)\n" +
            "head : вывести первый элемент коллекции\n" +
            "remove_lower {id} : удалить из коллекции все элементы, меньшие, чем заданный\n" +
            "history : вывести последние 12 команд (без их аргументов)\n" +
            "cltmp {minimal_point}: вывести количество элементов, значение поля minimalPoint которых меньше заданного\n" +
            "print_unique_authors : вывести уникальные значения поля author всех элементов в коллекции\n" +
            "pfdmp : вывести значения поля minimalPoint всех элементов в порядке убывания");
    }
    public void info() {
        System.out.println(Output_engine.collectionName() + " collection");
        System.out.println(Output_engine.collectionType() + " " + Collections.getCollection().getClass().getSimpleName());
        System.out.println(Output_engine.collectionSize() + " " + Collections.getCollection().size());
    }
    public void sout_collection() {
        Collections.printCollection();
    }

    /**
     * Скрипт для ввода и валидации значений полей новых элементов основной коллекции
     * @param type - режим ввода
     * @param ID - id, используется в команде update
     * @return elem - новый элемент коллекции
     */
    private LabWork setElemScript(int type, long ID, Scanner sc, Mode mode) {
//        switch (mode) {
//            case DEFAULT -> {
//                Scanner doubleScanner = new Scanner(System.in);
//                Scanner longScanner = new Scanner(System.in);
//                Scanner sc = new Scanner(System.in);
//            }
//            case FILE -> {
//                Scanner doubleScanner = new Scanner(file);
//                Scanner longScanner = new Scanner(System.in);
//                Scanner sc = new Scanner(System.in);
//            }
//        }
//        if mode.equals(Mode.DEFAULT)
//        Scanner numeralScanner = new Scanner();
        LabWork elem = new LabWork();
        String name = null;
        Double coordinatesX = null;
        Long coordinatesY = null;
        Double minimalPoint = null;
        String difficultyStr;
        Difficulty difficulty = null;
        String authorName = null;
        String colorStr;
        Color eyeColor=null;
        Float locationX = null;
        Double locationY = null;
        Float locationZ = null;
        Person author = new Person();

        if (type==0) {
            elem.setId();
        }
        if (type==1) {
            elem.setId(ID);
        }
        System.out.println(Output_engine.insertName());
        do {
            try {
                System.out.print(Output_engine.prompt());
                name = sc.nextLine().trim();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while(!Validator.checkName(name));
        elem.setName(name);

        System.out.println(Output_engine.insertCoordinatesX());
        do {
            try {
                System.out.print(Output_engine.prompt());
                if (sc.hasNextDouble()) {
                    coordinatesX = sc.nextDouble();
                    sc.nextLine();
                    if (Validator.checkCoordinatesX(coordinatesX)) {
                        break;
                    } else {
                        System.out.println(Output_engine.incorrectCoordinatesX());
                    }
                } else {
                    System.out.println(Output_engine.incorrectCoordinatesX());
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.println(Output_engine.insertCoordinatesY());
        do {
            try {
                System.out.print(Output_engine.prompt());
                if (sc.hasNextLong()) {
                    coordinatesY = sc.nextLong();
                    sc.nextLine();
                    if (Validator.checkCoordinatesY(coordinatesY)) {
                        break;
                    } else {
                        System.out.println(Output_engine.incorrectCoordinatesY());
                    }
                } else {
                    System.out.println(Output_engine.incorrectCoordinatesY());
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        elem.setCoordinates(coordinatesX, coordinatesY);

        elem.setCreationDate();

        System.out.println(Output_engine.insertMinimalPoint());
        do {
            try {
                System.out.print(Output_engine.prompt());
                if (sc.hasNextDouble()) {
                    minimalPoint = sc.nextDouble();
                    sc.nextLine();
                    if (Validator.checkMinimalPoint(minimalPoint)) {
                        break;
                    } else {
                        System.out.println(Output_engine.incorrectMinimalPoint());
                    }
                } else {
                    System.out.println(Output_engine.incorrectMinimalPoint());
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } while (true);
        elem.setMinimalPoint(minimalPoint);

        System.out.println(Output_engine.insertDifficulty());
        do {
            try {
                System.out.print(Output_engine.prompt());
                difficultyStr = sc.nextLine().trim();
                difficulty = Difficulty.valueOf(difficultyStr.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!Validator.checkDifficulty(difficulty));
        elem.setDifficulty(difficulty);

        System.out.println(Output_engine.insertAuthorName());
        do {
            try {
                System.out.print(Output_engine.prompt());
                authorName = sc.nextLine().trim();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while(!Validator.checkAuthorName(authorName));
        author.setName(authorName);
        
        author.setPassportID();

        System.out.println(Output_engine.insertColor());
        do {
            try{
                System.out.print(Output_engine.prompt());
                colorStr = sc.nextLine().trim();
                eyeColor = Color.valueOf(colorStr.toUpperCase());
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while(!Validator.checkColor(eyeColor));
        author.setEyeColor(eyeColor);

        System.out.println(Output_engine.insertLocationX());
        do {
            try {
                System.out.print(Output_engine.prompt());
                if (sc.hasNextFloat()) {
                    locationX = sc.nextFloat();
                    sc.nextLine();
                    if (Validator.checkLocationX(locationX)) {
                        break;
                    } else {
                        System.out.println(Output_engine.incorrectLocationX());
                    }
                } else {
                    System.out.println(Output_engine.incorrectLocationX());
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } while (true);
        author.getLocation().setX(locationX);

        System.out.println(Output_engine.insertLocationY());
        do {
            try {
                System.out.print(Output_engine.prompt());
                if (sc.hasNextDouble()) {
                    locationY = sc.nextDouble();
                    sc.nextLine();
                    if (Validator.checkLocationY(locationY)) {
                        break;
                    } else {
                        System.out.println(Output_engine.incorrectLocationY());
                    }
                } else {
                    System.out.println(Output_engine.incorrectLocationY());
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } while (true);
        author.getLocation().setY(locationY);

        System.out.println(Output_engine.insertLocationZ());
        do {
            try {
                System.out.print(Output_engine.prompt());
                if (sc.hasNextFloat()) {
                    locationZ = sc.nextFloat();
                    sc.nextLine();
                    if (Validator.checkLocationZ(locationZ)) {
                        break;
                    } else {
                        System.out.println(Output_engine.incorrectLocationZ());
                    }
                } else {
                    System.out.println(Output_engine.incorrectLocationZ());
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } while (true);
        author.getLocation().setZ(locationZ);
        elem.setAuthor(author);
        return elem;
    }
    public void add_elem(Scanner scanner, Mode mode) {
        Collections.addElem(setElemScript( 0, 0, scanner, mode));
    }
    public void update(String arg, Scanner scanner, Mode mode) {
        Collections.update(Collections.searchInCollection(Long.parseLong(arg)), setElemScript(1, Long.parseLong(arg), scanner, mode));
    }
    public void remove_by_id(long id) {
        Collections.removeById(id);
    }
    public void clear() {
        if (!Collections.getCollection().isEmpty()) {
            Collections.clearCollection();
        } else {
            System.out.println(Output_engine.collectionEmpty());
        }
    }
    public void save() {
        Serializer.save(Collections.getCollection());
    }
    public void execute_script(String filename) {
        iterations++;
        if (iterations>499) {
            System.out.println(Output_engine.stackOverflowError());
            return;
        }
        InputEngine.launcher(null, Mode.FILE, null, filename);
    }
    public void exit() {
        if (Collections.saveCheck()) {
            System.exit(0);
        } else {
            Scanner scanner = new Scanner(System.in);
            String resp=null;
            Pattern pattern = Pattern.compile("^[yn]$");
            do {
                try {
                    System.out.println("В коллекции есть несохраненные изменения. Вы точно хотите выйти (y/n)");
                    System.out.print(Output_engine.prompt());
                    resp = scanner.nextLine().trim();

                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
            } while (!pattern.matcher(resp).matches());
            if (resp.equals("y")) {
                this.save();
                System.exit(0);
            } else {
                System.exit(0);
            }
        }
    }
    public void head() {
        Collections.printFirstElem();
    }
    public void remove_lower(long id) {
        Collections.removeLower(id);
    }
    public void history() {
        Collections.printHistory();
    }
    public void count_less_than_minimal_point(double minimal_point) {
        System.out.println(Collections.countLessThanMinimalPoint(minimal_point));
    }
    public void print_unique_author() {
        Collections.printUniqueAuthor();
    }
    public void print_field_descending_minimal_point() {
        Collections.printMinimalPoints();
    }
}
