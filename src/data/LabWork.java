package data;

import managment.Collections;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class LabWork implements Comparable<LabWork>, Serializable {

    private long id=0; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double minimalPoint; //Значение поля должно быть больше 0
    private Difficulty difficulty; //Поле не может быть null
    private Person author; //Поле не может быть null
    public LabWork() {
        this.name="Default";
        this.coordinates=new Coordinates();
        this.minimalPoint=0;
        this.difficulty=Difficulty.IMPOSSIBLE;
        this.author=new Person();
    }
    public void setId() {
        UUID uuid = UUID.randomUUID();
        long unique_id = uuid.getMostSignificantBits() & Long.MAX_VALUE;
        this.id = unique_id;
        Collections.addId(unique_id);
        System.out.println("Поле ID сгенерировано успешно");
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setCoordinates(double x, long y) {
        Coordinates coords = new Coordinates();
        coords.setCoords(x, y);
        this.coordinates = coords;
    }
    public void setCreationDate() {
        this.creationDate = LocalDateTime.now();
    }
    public void setMinimalPoint(double minimalPoint) {
        this.minimalPoint=minimalPoint;
    }
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty=difficulty;
    }

    public void setAuthor(Person author) {
        this.author = author;
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

    public Color getColor() {
        return this.getAuthor().getEyeColor();
    }

    public Location getLocation() {
        return this.getAuthor().getLocation();
    }
    @Override
    public int compareTo(LabWork o) {
        return Long.compare(this.id, o.getId());
    }
}
