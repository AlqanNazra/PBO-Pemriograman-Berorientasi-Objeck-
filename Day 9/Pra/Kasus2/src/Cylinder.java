class Cylinder extends Shape {
    private Double radius;
    private Double height;

    public Cylinder(Double h, Double r) {
        super("Cylinder");
        height = h;
        radius = r;
    }

    @Override
    public double area() {
        return 2 * Math.PI * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return super.toString() + " of Radius" + radius + " of height"  + height;

    }
}
