package load;
import data.LabWork;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayDeque;

/**
 * Класс для сериализации объектов из коллекции для последующего сохранения в файл .json
 */
public class Serializer {
    public static void save(ArrayDeque<LabWork> collection) {

        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter()).setPrettyPrinting().create();

        try (PrintWriter out = new PrintWriter(new FileWriter("collection.json"))) {
            JsonWriter writer = gson.newJsonWriter(out);
            writer.setIndent("\t");
            writer.setSerializeNulls(true);
            writer.beginArray();
            for (LabWork elem : collection) {
                gson.toJson(elem, LabWork.class, writer);
            }
            writer.endArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
