class Rectangle extends Shape {
    private  double width;
    private double height;

    public Rectangle(double h, double w) {
        super("Rectangle");
        height = h;
        width = w;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + " of height" + height + " of Width"  + width;

    }

}
