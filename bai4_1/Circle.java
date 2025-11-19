package bai4_1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double ruadius) {
        this.radius = ruadius;
        this.color = "red";
    }

    public Circle(double ruadius, String color) {
        this.radius = ruadius;
        this.color = color;
    }

    public double getRudius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "ruadius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
