package data;


import java.io.Serializable;
public class Location implements Serializable {
    private float x; //Поле не может быть null
    private double y;
    private float z;
    public Location(float x, double y, float z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public float getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
