public class Circle extends Shape{
    private Double radius;

    public Circle()
    {
        super();
        this.radius = 1.0;
    }

    public Circle (double radius)
    {
        super();
        this.radius = radius;
    }
    public Circle(Double radius, String Color, Boolean Filled) {
        super(Color, Filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius * radius* Math.PI;
    }

    public double getPerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", getFilled()=" + getFilled() + "]";
    }
}
