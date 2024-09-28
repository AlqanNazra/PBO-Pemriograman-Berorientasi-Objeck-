public class Shape {
    private String Color;
    private Boolean Filled;

    public Shape()
    {
        this.Color = "Green";
        this.Filled = true;
    }

    public Shape(String Color, Boolean Filled) {
        this.Color = Color;
        this.Filled = Filled;
    }
    public String getColor() {
        return Color;
    }
    public Boolean getFilled() {
        return Filled;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setFilled(Boolean Filled) {
        this.Filled = Filled;
    }
    @Override
    public String toString() {
        return "Shape [Color=" + Color + ", Filled=" + Filled + "]";
    }
    

}
