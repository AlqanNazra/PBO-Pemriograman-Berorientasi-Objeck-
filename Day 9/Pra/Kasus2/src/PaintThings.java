//********************************************
// PaintThings.java
//
// Computes the amount of paint needed to paint various
// things. Uses the amount method of the paint class which
// takes any Shape as a parameter.
//********************************************
import java.text.DecimalFormat;

public class PaintThings {
    //---------------------------------------
    // Creates some shapes and a Paint object
    // and prints the amount of paint needed
    // to paint each shape.
    //---------------------------------------
    public static void main(String[] args) {
        final double COVERAGE = 350;  // coverage of the paint
        Paint paint = new Paint(COVERAGE);

        // Declare shape objects
        Shape deck = new Rectangle(20,35) ;
        Shape bigBall  = new Sphere(15);
        Shape tank = new Cylinder(30.0, 10.0);

        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);


        // Instantiate the three shapes to paint
        // (Implement these objects based on their constructors)
        
        // Compute the amount of paint needed for each shape
        
        // Print the amount of paint for each
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
