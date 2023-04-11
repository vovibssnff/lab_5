package io;

import java.util.ResourceBundle;

/**
 * Менеджмент выводимых сообщений
 */
public class Output_engine {
    public static final ResourceBundle messages = ResourceBundle.getBundle("messages_en");
    public static String greeting_msg() {return(messages.getString("greeting_msg"));}
    public static String prompt() {return messages.getString("prompt");}
    public static String importError() {return(messages.getString("importError"));}
    public static String accessError() {return(messages.getString("accessError"));}
    public static String idNotFoundError() {return(messages.getString("idNotFoundError"));}
    public static String stackOverflowError() {return(messages.getString("stackOverflowError"));}

    public static String insertName() {
        return(messages.getString("insertName"));
    }
    public static String insertCoordinatesX() {
        return(messages.getString("insertCoordinatesX"));
    }
    public static String insertCoordinatesY() {
        return(messages.getString("insertCoordinatesY"));
    }
    public static String insertMinimalPoint() {
        return(messages.getString("insertMinimalPoint"));
    }
    public static String insertDifficulty() {
        return(messages.getString("insertDifficulty"));
    }
    public static String insertAuthorName() {
        return(messages.getString("insertAuthorName"));
    }
    public static String insertColor() {
        return(messages.getString("insertColor"));
    }
    public static String insertLocationX() {
        return(messages.getString("insertLocationX"));
    }
    public static String insertLocationY() {
        return(messages.getString("insertLocationY"));
    }
    public static String insertLocationZ() {
        return(messages.getString("insertLocationZ"));
    }

    public static String incorrectCommand() {return(messages.getString("incorrectCommand"));}
    public static String incorrectObject() {return(messages.getString("incorrectObject"));}
    public static String incorrectId() {return(messages.getString("incorrectId"));}
    public static String incorrectName() {return(messages.getString("incorrectName"));}
    public static String incorrectCoordinatesX() {return(messages.getString("incorrectCoordinatesX"));}
    public static String incorrectCoordinatesY() {return(messages.getString("incorrectCoordinatesY"));}
    public static String incorrectMinimalPoint() {return(messages.getString("incorrectMinimalPoint"));}
    public static String incorrectCreationDate() {return(messages.getString("incorrectCreationDate"));}
    public static String incorrectAuthorName() {return(messages.getString("incorrectAuthorName"));}
    public static String incorrectDifficulty() {return(messages.getString("incorrectDifficulty"));}
    public static String incorrectPassportId() {return(messages.getString("incorrectPassportId"));}
    public static String incorrectEyeColor() {return(messages.getString("incorrectEyeColor"));}
    public static String incorrectLocationX()  {return(messages.getString("incorrectLocationX"));}
    public static String incorrectLocationY()  {return(messages.getString("incorrectLocationY"));}
    public static String incorrectLocationZ()  {return(messages.getString("incorrectLocationZ"));}
    public static String incorrectLongArg() {return(messages.getString("incorrectLongArg"));}
    public static String incorrectDoubleArg() {return(messages.getString("incorrectDoubleArg"));}

    public static String correctId() {return(messages.getString("correctId"));}
    public static String correctName() {return(messages.getString("correctName"));}
    public static String correctCoordinatesX() {return(messages.getString("correctCoordinatesX"));}
    public static String correctCoordinatesY() {return(messages.getString("correctCoordinatesY"));}
    public static String correctMinimalPoint() {return(messages.getString("correctMinimalPoint"));}
    public static String correctCreationDate() {return(messages.getString("correctCreationDate"));}
    public static String correctAuthorName() {return(messages.getString("correctAuthorName"));}
    public static String correctDifficulty() {return(messages.getString("correctDifficulty"));}
    public static String correctPassportId() {return(messages.getString("correctPassportId"));}
    public static String correctEyeColor() {return(messages.getString("correctEyeColor"));}
    public static String correctLocationX()  {return(messages.getString("correctLocationX"));}
    public static String correctLocationY()  {return(messages.getString("correctLocationY"));}
    public static String correctLocationZ()  {return(messages.getString("correctLocationZ"));}

    public static String successClear() {return(messages.getString("successClear"));}
    public static String successAddElem() {return(messages.getString("successAddElem"));}
    public static String successAddElems() {return(messages.getString("successAddElems"));}
    public static String successImport() {return(messages.getString("successImport"));}

    public static String collectionName() {return(messages.getString("collectionName"));}
    public static String collectionType() {return(messages.getString("collectionType"));}
    public static String collectionSize() {return(messages.getString("collectionSize"));}
    public static String collectionRestore() {return(messages.getString("collectionRestore"));}
    public static String collectionEmpty() {return(messages.getString("collectionEmpty"));}
}
