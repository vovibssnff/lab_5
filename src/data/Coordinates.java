package data;

import java.io.Serializable;

public class Coordinates implements Serializable {
    private double x; //Максимальное значение поля: 775
    private Long y; //Поле не может быть null

    public void setCoords(double x, Long y) {
        this.x=x;
        this.y=y;
    }
    public double getX() {
        return x;
    }
    public Long getY() {
        return y;
    }
}
