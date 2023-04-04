package load;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.google.gson.*;

/**
 * Кастомный адаптер для успешной сериализации и десериализации полей LocalDateTime
 */
public class LocalDateTimeAdapter implements JsonDeserializer<LocalDateTime>, JsonSerializer<LocalDateTime> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    @Override
    public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        String datetimeString = json.getAsJsonPrimitive().getAsString();
        return LocalDateTime.parse(datetimeString, formatter);
    }
    @Override
    public JsonElement serialize(LocalDateTime localDateTime, Type type, JsonSerializationContext context) {
        String value = formatter.format(localDateTime);
        return context.serialize(value);
    }
}