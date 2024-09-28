public class App { //05.05
    public static void main(final String[] args) throws Exception {
        Shape c1 = new Shape();
        System.err.println("Shape Warna =" + c1.getColor() +
        "\nFilled = " + c1.getFilled());
        System.err.println(c1);

        Circle c2 = new Circle(20);
        System.out.println("\nCircle Warna =" + c2.getColor() + 
        "\nRadius = " + c2.getRadius() + 
        "\nArea = "+ c2.getArea() +
        "\nParameter = " + c2.getPerimeter(5));
        c2.setRadius(10.0);
        System.err.println("\nNew Area=" + c2.getArea() +
        "\n New Parameter =" + c2.getPerimeter(10));
        System.err.println(c2);

        Rectangle c3 = new Rectangle(10, 4);
        System.out.println("\nPersegi panjang" + 
        "\n Warna Persegi panjang = " + c3.getColor() +
        "\n length = " + c3.getLength() +
        "\n Width =" + c3.getWidth() +
        "\nAREA = " + c3.area(10, 4) + 
        "\nParameter = " + c3.Parameter(10, 4));
        System.err.println(c3);

        Square c4 = new Square(5, 5, "BLUE", false);
        System.out.println("\nSquare" + "\nWarna Persegi" + c4.getColor() +
        "\nSiSI = " + c4.getSide());
        System.err.println(c4);
    }
}
