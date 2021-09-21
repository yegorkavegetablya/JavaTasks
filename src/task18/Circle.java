package task18;

public class Circle {
    private double radius;
    private double x_coordinate;
    private double y_coordinate;

    public Circle(double radius, double x_coordinate, double y_coordinate) {
        this.radius = radius;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public double getRadius() {
        return radius;
    }
    public double getX_coordinate() {
        return x_coordinate;
    }
    public double getY_coordinate() {
        return y_coordinate;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setX_coordinate(double x_coordinate) {
        this.x_coordinate = x_coordinate;
    }
    public void setY_coordinate(double y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public void moveBy(double x_distance, double y_distance) {
        setX_coordinate(getX_coordinate() + x_distance);
        setY_coordinate(getY_coordinate() + y_distance);
    }

    public void changeBy(double multiplier) {
        setRadius(getRadius() * multiplier);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                '}';
    }
}
