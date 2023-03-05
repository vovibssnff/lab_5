package Collection_managment;

import Commands.*;
import Data.*;

import java.util.*;

public class Collections {
    private static final List<Command> commandList = new ArrayList<>(); //журнал истории команд
    private static final Map<String, Command> commandMap = new HashMap<>(); //коллекция для идентификации введенных команд
    private static final HashSet<Long> idSet = new HashSet<Long>(); //множество значений id класса LabWork
    private static final HashSet<String> passportIdSet = new HashSet<>(); //множество значений passportId класса Person
    private static ArrayDeque<LabWork> collection = new ArrayDeque<LabWork>(); //основная коллекция объектов LabWork
    public static void addCommand(Command command) {
        commandList.add(command);
    }
    public static Command getCommand(int i) {
        return commandList.get(commandList.size()-i);
    }
    public static void addElemToCommandMap(String key, Command value) {
        commandMap.put(key, value);
    }
    public static String getCommandMap() {
        return commandMap.toString();
    }
    public static Command searchCommand(String command) {
        Command cmd = null;
        for (Map.Entry<String, Command> entry : commandMap.entrySet()) {
            String key = entry.getKey();
            if (key.equals(command)) {
                cmd = entry.getValue();
                return cmd;
                //System.out.println(key+"____"+value);
            }
        }
        return cmd;
    }
    public static void addId(long i) {
        idSet.add(i);
    }
    public static boolean containsId(long i) {
        return idSet.contains(i);
    }
    public static void addPassportId(String i) {passportIdSet.add(i);}
    public static boolean containsPassportId(String i) {return passportIdSet.contains(i);}
    public static void addElem(LabWork elem) {
        collection.add(elem);
        System.out.println("Новый элемент добавлен в коллекцию успешно");
    }
    public static void addElemsFromList(ArrayList<LabWork> labWorkArrayList) {
        collection.addAll(labWorkArrayList);
        System.out.println("Новые элементы добавлены в коллекцию успешно");
    }
    public static ArrayDeque<LabWork> getCollection() {
        return collection;
    }
    public static String printCollection(LabWork elem) {
        return("_________________________________" +
                "\nid: " + elem.getId() +
                "\nname: " + elem.getName() +
                "\ncoordinates: " + elem.getCoordinates().getX() + " " + elem.getCoordinates().getY() +
                "\ncreationDate: " + elem.getCreationDate() +
                "\nminimalPoint: " + elem.getMinimalPoint() +
                "\ndifficulty: " + elem.getDifficulty() +
                "\nauthor: " + "\n=============" + elem.getAuthor().toString() + "\n=============" +
                "\n#################################");}
}
