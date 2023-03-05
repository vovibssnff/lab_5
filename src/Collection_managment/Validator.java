package Collection_managment;

import Data.Color;
import Data.Coordinates;
import Data.Difficulty;
import Data.LabWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean checkId(long id) {
        if (Collections.containsId(id)) {
            System.out.println("Значение id не уникально");
            return false;
        } else {
            System.out.println("Поле id задано успешно");
            Collections.addId(id);
            return true;
        }
    }
    public static boolean checkName(String name) {
        if ("".equals(name)||name==null) {
            System.out.println("Поле name не может быть пустой строкой или null");
            return false;
        } else {
            System.out.println("Поле name задано успешно");
            return true;
        }
    }
    public static boolean checkCoordinates(double x) {
        if (x>=775) {
            System.out.println("Поле x не может быть больше 775, введите корректное значение");
            return false;
        } else {
            System.out.println("Поле Coordinates задано успешно");
            return true;
        }
    }
    public static boolean checkMinimalPoint(double minimalPoint) {
        if (minimalPoint<=0) {
            System.out.println("Поле MinimalPoint должно быть больше нуля, введите корректное значение");
            return false;
        } else {
            System.out.println("Поле MinimalPoint задано успешно");
            return true;
        }
    }
    public static boolean checkCreationDate(String creationDate) {;
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(creationDate);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkDifficulty(Difficulty difficulty) {
        if (Difficulty.VERY_HARD.equals(difficulty)||Difficulty.VERY_EASY.equals(difficulty)||
                Difficulty.IMPOSSIBLE.equals(difficulty)) {
            System.out.println("Поле Difficulty задано успешно.");
            return true;
        } else {
            System.out.println("Введено некорректное значение. Допускаются только very_easy, very_hard, impossible");
            return false;
        }
    }
    public static boolean checkAuthorName(String name) {
        if ("".equals(name)||name==null) {
            System.out.println("Поле name не может быть пустой строкой или null");
            return false;
        } else {
            System.out.println("Поле name задано успешно");
            return true;
        }
    }
    public static boolean checkPassportId(String passportID) {
        if (Collections.containsPassportId(passportID)) {
            System.out.println("Значение passportId не уникально");
            return false;
        } else {
            System.out.println("Поле passportId задано успешно");
            Collections.addPassportId(passportID);
            return true;
        }
    }
    public static boolean checkColor(Color eyeColor) {
        if (Color.GREEN.equals(eyeColor)||Color.BROWN.equals(eyeColor)||Color.BLACK.equals(eyeColor)) {
            System.out.println("Поле eyeColor задано успешно");
            return true;
        } else {
            System.out.println("Введено некорректное значение eyeColor. Допускаются только GREEN, BROWN, BLACK");
            return false;
        }
    }
    public static boolean checkLocation(Float x, Double y) {
        if (x==null||y==null) {
            System.out.println("Поле Location задано успешно");
            return false;
        } else {
            System.out.println("Отсутствует значение Location");
            return true;
        }
    }
}
