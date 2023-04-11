package data;

import java.io.Serializable;
import java.util.UUID;

public class Person implements Serializable {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private String passportID; //Значение этого поля должно быть уникальным, Строка не может быть пустой, Поле может быть null
    private Color eyeColor; //Поле может быть null
    private Location location; //Поле может быть null
    public Person() {
        this.name="default";
        this.passportID="00000XX";
        this.eyeColor=Color.GREEN;
        this.location=new Location(0, 0, 0);
    }
    public void setName(String name) {
        if (!name.equals("")) {
            this.name=name;

        } else {

        }
    }

    /**
     * Генерация уникального значения id при помощи UUID
     */
    public void setPassportID() {
        UUID uuid = UUID.randomUUID();
        this.passportID = uuid.toString();
    }
    public void setEyeColor(Color eyeColor) {
        this.eyeColor=eyeColor;
    }
    public void setLocation(float x, double y, float z) {
        this.location = new Location(x, y, z);

    }

    public String getName() {
        return name;
    }

    public String getPassportID() {
        return passportID;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return ("\nname: " + this.name +
                "\npassportID: " + this.passportID +
                "\neyeColor: " + this.eyeColor +
                "\nlocation: " + this.location.getX() + " " + this.location.getY() + " " + this.location.getZ());
    }
}
