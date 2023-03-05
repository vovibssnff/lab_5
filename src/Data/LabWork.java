package Data;

import Collection_managment.Collections;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.UUID;

public class LabWork {

    private long id=0; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double minimalPoint; //Значение поля должно быть больше 0
    private Difficulty difficulty; //Поле не может быть null
    private Person author; //Поле не может быть null
    private String authorName;
    private String passportId;
    private Color color;
    private Location location;
    public LabWork(String name, Coordinates coordinates, double minimalPoint,
                   Difficulty difficulty, Person author) {
        this.name=name;
        this.coordinates=coordinates;
        this.minimalPoint=minimalPoint;
        this.difficulty=difficulty;
        this.author=author;
    }
    public void setId() {
        UUID uuid = UUID.randomUUID();
        long unique_id = uuid.getMostSignificantBits() & Long.MAX_VALUE;
        this.id = unique_id;
        Collections.addId(unique_id);
        System.out.println("Поле ID сгенерировано успешно");
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setCoordinates(double x, long y) {
        this.coordinates = new Coordinates();
        this.coordinates.setCoords(x, y);
    }
    public void setCreationDate() {
        this.creationDate = LocalDateTime.now();
        System.out.println(this.creationDate);
    }
    public void setMinimalPoint(double minimalPoint) {
        this.minimalPoint=minimalPoint;
    }
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty=difficulty;
    }
    public void setAuthorName(String authorName) {
        if (!authorName.equals("")) {
            this.authorName=authorName;
            System.out.println("Поле authorName задано успешно");
        } else {
            System.out.println("Поле authorName не должно быть пустой строкой, введите корректное значение");
        }
    }
    public void setPassportId() {
        UUID uuid = UUID.randomUUID();
        this.passportId = uuid.toString();
        System.out.println("Значение PassportID сгенерировано успешно");
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setLocation(float x, double y, float z) {
        this.location = new Location(x, y, z);
        System.out.println("Поле Location задано успешно");
    }
    public void setAuthor() {
        this.author = new Person(this.authorName, this.passportId, this.color, this.location);
        System.out.println("Поле Author задано успешно");
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public LocalDateTime getCreationDate() {
        return this.creationDate;
    }

    public double getMinimalPoint() {
        return this.minimalPoint;
    }

    public Difficulty getDifficulty() {
        return this.difficulty;
    }

    public Person getAuthor() {
        return this.author;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getPassportId() {
        return this.passportId;
    }

    public Color getColor() {
        return this.color;
    }

    public Location getLocation() {
        return this.location;
    }
}
