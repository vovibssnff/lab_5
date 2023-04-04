package managment;

import data.Color;
import data.Difficulty;
import io.Output_engine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс для валидации значений полей
 */
public class Validator {
    public static boolean checkId(long id) {
        if (Collections.containsId(id)) {
            System.out.println(Output_engine.incorrectId());
            return false;
        } else {
            System.out.println(Output_engine.correctId());
            Collections.addId(id);
            return true;
        }
    }
    public static boolean checkName(String name) {
        if ("".equals(name)||name==null) {
            System.out.println(Output_engine.incorrectName());
            return false;
        } else {
            System.out.println(Output_engine.correctName());
            return true;
        }
    }
    public static boolean checkCoordinatesX(Double x) {
        if ((x>=775)||x==null) {
            System.out.println(Output_engine.incorrectCoordinatesX());
            return false;
        } else {
            System.out.println(Output_engine.correctCoordinatesX());
            return true;
        }
    }
    public static boolean checkCoordinatesY(Long y) {
        if ((y>=775)||y==null) {
            System.out.println(Output_engine.incorrectCoordinatesY());
            return false;
        } else {
            System.out.println(Output_engine.correctCoordinatesY());
            return true;
        }
    }
    public static boolean checkMinimalPoint(Double minimalPoint) {
        if ((minimalPoint<=0)||(minimalPoint == null)) {
            System.out.println(Output_engine.incorrectMinimalPoint());
            return false;
        } else {
            System.out.println(Output_engine.correctMinimalPoint());
            return true;
        }
    }
    public static boolean checkCreationDate(String creationDate) {;
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(creationDate);
        if (matcher.matches()) {
            System.out.println(Output_engine.correctCreationDate());
            return true;
        } else {
            System.out.println(Output_engine.incorrectCreationDate());
            return false;
        }
    }
    public static boolean checkDifficulty(Difficulty difficulty) {
        if (Difficulty.VERY_HARD.equals(difficulty)||Difficulty.VERY_EASY.equals(difficulty)||
                Difficulty.IMPOSSIBLE.equals(difficulty)) {
            System.out.println(Output_engine.correctDifficulty());
            return true;
        } else {
            System.out.println(Output_engine.incorrectDifficulty());
            return false;
        }
    }
    public static boolean checkAuthorName(String name) {
        if ("".equals(name)||name==null) {
            System.out.println(Output_engine.incorrectAuthorName());
            return false;
        } else {
            System.out.println(Output_engine.correctAuthorName());
            return true;
        }
    }
    public static boolean checkPassportId(String passportID) {
        if (Collections.containsPassportId(passportID)) {
            System.out.println(Output_engine.incorrectPassportId());
            return false;
        } else {
            System.out.println(Output_engine.correctPassportId());
            Collections.addPassportId(passportID);
            return true;
        }
    }
    public static boolean checkColor(Color eyeColor) {
        if (Color.GREEN.equals(eyeColor)||Color.BROWN.equals(eyeColor)||Color.BLACK.equals(eyeColor)) {
            System.out.println(Output_engine.correctEyeColor());
            return true;
        } else {
            System.out.println(Output_engine.incorrectEyeColor());
            return false;
        }
    }
    public static boolean checkLocationX(Float x) {
        if (x==null) {
            System.out.println(Output_engine.incorrectLocationX());
            return false;
        } else {
            System.out.println(Output_engine.correctLocationX());
            return true;
        }
    }
    public static boolean checkLocationY(Double y) {
        if (y==null) {
            System.out.println(Output_engine.incorrectLocationY());
            return false;
        } else {
            System.out.println(Output_engine.correctLocationY());
            return true;
        }
    }
    public static boolean checkLocationZ(Float z) {
        if (z==null) {
            System.out.println(Output_engine.incorrectLocationZ());
            return false;
        } else {
            System.out.println(Output_engine.correctLocationZ());
            return true;
        }
    }
}
