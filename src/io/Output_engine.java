package io;

import Data.LabWork;

import java.util.Locale;
import java.util.ResourceBundle;

public class Output_engine {
    public static final ResourceBundle messages = ResourceBundle.getBundle("messages");
    public static void greeting_msg() {
        System.out.println(Locale.getDefault());
        System.out.println("Добро пожаловать в менеджер коллекции! Ознакомиться со списком доступных команд возможно с " +
                           "помощью help. Параметры команд вводятся после активации самой команды (ввод команды + enter)");
    }
    public static void prompt() {
        System.out.print(messages.getString("prompt"));
    }

    public static void insertName() {
        System.out.println(messages.getString("insertName"));
    }

    public static void insertCoordinatesX() {
        System.out.println(messages.getString("insertCoordinatesX"));
    }

    public static void insertCoordinatesY() {
        System.out.println(messages.getString("insertCoordinatesY"));
    }

    public static void insertMinimalPoint() {
        System.out.println(messages.getString("insertMinimalPoint"));
    }

    public static void insertDifficulty() {
        System.out.println(messages.getString("insertDifficulty"));
    }

    public static void insertAuthorName() {
        System.out.println(messages.getString("insertAuthorName"));
    }

    public static void insertColor() {
        System.out.println(messages.getString("insertColor"));
    }

    public static void insertLocationX() {
        System.out.println(messages.getString("insertLocationX"));
    }

    public static void insertLocationY() {
        System.out.println(messages.getString("insertLocationY"));
    }

    public static void insertLocationZ() {
        System.out.println(messages.getString("insertLocationZ"));
    }
//    public static void importSuccess() {System.out.println("success");}
//    public static void prompt() {
//        System.out.print(">");
//    }
//    public static void insertName() {System.out.println("Пожалуйста, введите значение поля name. Поле не должно быть пустой строкой, ввод обязателен");}
//    public static void insertCoordinatesX() {System.out.println("Введите значение X. Поле должно быть меньше или равно 775");}
//    public static void insertCoordinatesY() {
//        System.out.println("Введите значение Y");
//    }
//    public static void insertMinimalPoint() {System.out.println("Введите значение MinimalPoint. Оно должно быть больше 0");}
//    public static void insertDifficulty() {System.out.println("Введите значение Difficulty. Оно может быть very_easy, very_hard, impossible");}
//    public static void insertAuthorName() {System.out.println("Введите значение AuthorName");}
//    public static void insertColor() {System.out.println("Введите значение Color. Оно может быть green, black, brown");}
//    public static void insertLocationX() {System.out.println("Введите значение X");}
//    public static void insertLocationY() {System.out.println("Введите значение Y");}
//    public static void insertLocationZ() {System.out.println("Введите значение Z");}


}
