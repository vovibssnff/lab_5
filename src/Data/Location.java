package Data;
public class Location {
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
}
