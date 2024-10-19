abstract class Shape {
    private String shapename;
    
    abstract double area();

    public Shape(String shapename) {
        this.shapename = shapename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shape{");
        sb.append("shapename=").append(shapename);
        sb.append('}');
        return sb.toString();
    }

    
}
