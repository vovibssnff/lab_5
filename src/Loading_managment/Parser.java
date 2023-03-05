package Loading_managment;
import Collection_managment.Validator;
import Data.LabWork;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parser {
    public static ArrayList<LabWork> parse() {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new LocalDateTime_deserializer()).create();
        ArrayList<LabWork> labWorkList = new ArrayList<>();
        try(JsonReader reader = new JsonReader(new FileReader("elements.json"))) {
            JsonParser parser = new JsonParser();
            reader.beginArray();
            while(reader.hasNext()) {
                JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
                LabWork lbwork = gson.fromJson(obj, LabWork.class);
                if (Validator.checkName(lbwork.getName())&&
                        Validator.checkId(lbwork.getId())&&
                        Validator.checkDifficulty(lbwork.getDifficulty())&&
                        Validator.checkMinimalPoint(lbwork.getMinimalPoint())&&
                        Validator.checkCreationDate(lbwork.getCreationDate().toString())&&
                        Validator.checkCoordinates(lbwork.getCoordinates().getX())&&
                        Validator.checkAuthorName(lbwork.getAuthor().getName())&&
                        Validator.checkPassportId(lbwork.getAuthor().getPassportID())&&
                        Validator.checkColor(lbwork.getColor())&&
                        Validator.checkLocation(lbwork.getLocation().getX(), lbwork.getLocation().getY())) {
                    labWorkList.add(lbwork);
                } else {
                    System.out.println("Объект имеет некорректные значения полей");
                }

            }
            reader.endArray();
            //Output_engine.importSuccess();
            return labWorkList;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка импорта из файла: ");
        }
        return null;
    }

}