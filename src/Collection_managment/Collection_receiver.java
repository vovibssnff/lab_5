package Collection_managment;
import Data.*;
import io.*;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Collection_receiver {
    public void help() {
        System.out.println("help : вывести справку по доступным командам\n" +
            "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
            "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
            "add : добавить новый элемент в коллекцию\n" +
            "update {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
            "remove_by_id id : удалить элемент из коллекции по его id\n" +
            "clear : очистить коллекцию\n" +
            "save : сохранить коллекцию в файл\n" +
            "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
            "exit : завершить программу (без сохранения в файл)\n" +
            "head : вывести первый элемент коллекции\n" +
            "remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный\n" +
            "history : вывести последние 12 команд (без их аргументов)\n" +
            "count_less_than_minimal_point minimalPoint : вывести количество элементов, значение поля minimalPoint которых меньше заданного\n" +
            "print_unique_author : вывести уникальные значения поля author всех элементов в коллекции\n" +
            "print_field_descending_minimal_point : вывести значения поля minimalPoint всех элементов в порядке убывания");
    }
    public String info() {return null;}
    public void sout_collection() {
        Iterator<LabWork> iter = Collections.getCollection().iterator();
        while (iter.hasNext()) {
            LabWork elem = iter.next();
            System.out.println(Collections.printCollection(elem));
        }
    }
    public void add_elem() {
        Scanner sc = new Scanner(System.in);
        LabWork elem = new LabWork(null, null, 0, null, null);
        String name;
        double coordinatesX;
        long coordinatesY;
        double minimalPoint;
        String difficultyStr = "";
        Difficulty difficulty = null;
        String authorName;
        String passportId;
        String colorStr = "";
        Color eyeColor=null;
        float locationX;
        double locationY;
        float locationZ;

        elem.setId();

        Output_engine.insertName();
        do {
            Output_engine.prompt();
            name = sc.nextLine().trim();
        } while(!Validator.checkName(name));
        elem.setName(name);

//        do {
//            while(!sc.hasNextDouble()) {
//                Output_engine.insertCoordinatesX();
//                Output_engine.prompt();
//                sc.next();
//            }
//            coordinatesX = sc.nextDouble();
//            while(!sc.hasNextLong()) {
//                Output_engine.insertCoordinatesY();
//                Output_engine.prompt();
//                sc.next();
//            }
//            coordinatesY = sc.nextLong();
//        } while (!Validator.checkCoordinates(coordinatesX));

        do {
            System.out.println(Locale.getDefault().getDisplayName());
            Output_engine.insertCoordinatesX();
            Output_engine.prompt();
            coordinatesX = sc.nextDouble();
            Output_engine.insertCoordinatesY();
            Output_engine.prompt();
            coordinatesY = sc.nextLong();
        } while (!Validator.checkCoordinates(coordinatesX));
        elem.setCoordinates(coordinatesX, coordinatesY);

        elem.setCreationDate();

        Output_engine.insertMinimalPoint();
        do {
            Output_engine.prompt();
            minimalPoint = sc.nextDouble();
        } while (!Validator.checkMinimalPoint(minimalPoint));
        elem.setMinimalPoint(minimalPoint);

        Output_engine.insertDifficulty();
        do {
            try {
                Output_engine.prompt();
                difficultyStr = sc.nextLine().trim();
                difficulty = Difficulty.valueOf(difficultyStr.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!Validator.checkDifficulty(difficulty));
        elem.setDifficulty(difficulty);

        Output_engine.insertAuthorName();
        do {
            Output_engine.prompt();
            authorName = sc.nextLine().trim();
        } while(!Validator.checkAuthorName(authorName));
        elem.setAuthorName(authorName);

        elem.setPassportId();

        Output_engine.insertColor();
        do {
            try{
                Output_engine.prompt();
                colorStr = sc.nextLine().trim();
                eyeColor = Color.valueOf(colorStr.toUpperCase());
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while(!Validator.checkColor(eyeColor));
        elem.setColor(eyeColor);

        Output_engine.insertLocationX();
        Output_engine.prompt();
        float x = sc.nextInt();
        Output_engine.insertLocationY();
        Output_engine.prompt();
        double y = sc.nextDouble();
        Output_engine.insertLocationZ();
        Output_engine.prompt();
        float z = sc.nextFloat();
        elem.setLocation(x, y, z);
        elem.setAuthor();
        Collections.addElem(elem);
    }
    public void update(int id) {}
    public void remove_by_id(int id) {}
    public void clear() {}
    public void save() {}
    public void execute_script(String filename) {}
    public void exit() {
        System.exit(0);
    }
    public void head() {}
    public void remove_lower(int id) {}
    public void history() {
        for (int i=-1; i>=-11; i--) {
            System.out.println(Collections.getCommand(i));
        }
    }
    public void count_less_than_minimal_point(double minimal_point) {}
    public void print_unique_author() {}
    public void print_field_descending_minimal_point(double minimal_point) {}
}
