public class Square extends Rectangle{
    private double side;

    public Square() {
        System.err.println("Nothing");
    }

    public Square(double length, double width) {
        super(length, width);
    }

    public Square(double length, double width, String Color, Boolean Filled) {
        super(length, width, Color, Filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area(double width){
        return width*4;
    }

    public double Parameter(double width){
        return width*width;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square [side=" + side + ", getWidth()=" + getWidth() + ", getLength()=" + getLength() + "]";
    }
    
}
