public class bai12 {
      private double radius;

    // Default constructor sets radius to 1.0
    public bai12() {
        this.radius = 1.0;
    }

    // Constructor with specified radius
    public bai12(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculates area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculates circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // toString override
    @Override
    public String toString() {
        return "Circle12[radius=" + radius + "]";
    }
}
