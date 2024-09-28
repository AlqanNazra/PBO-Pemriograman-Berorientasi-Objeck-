public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String Color, Boolean Filled) {
        super(Color, Filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area (double width,double length)
    {
        return 2 * (width + length);
    }
    public double Parameter (double width,double length){
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + ", getColor()=" + getColor() + ", getFilled()="
                + getFilled() + "]";
    }

    

    
}
