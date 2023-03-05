package Data;
import java.util.random.*;
public class Person {
    private static String generator;
    private String name; //Поле не может быть null, Строка не может быть пустой
    private String passportID; //Значение этого поля должно быть уникальным, Строка не может быть пустой, Поле может быть null
    private Color eyeColor; //Поле может быть null
    private Location location; //Поле может быть null
    public Person(String name, String passportID, Color eyeColor, Location location) {
        this.name=name;
        this.passportID=passportID;
        this.eyeColor=eyeColor;
        this.location=location;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setPassportID(String passportID) {
        this.passportID=passportID;
    }
    public void setEyeColor(Color eyeColor) {
        this.eyeColor=eyeColor;
    }
    public void setLocation(Location location) {
        this.location=location;
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
