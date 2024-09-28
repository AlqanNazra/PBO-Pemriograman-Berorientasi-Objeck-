package com;
import java.awt.Color;
import javax.print.DocFlavor.STRING;

public class Cylinder extends Circle {  // Save as "Cylinder.java" 
   private double height;  // private variable 
    
   // Constructor with default color, radius and height 
   public Cylinder() { 
      super(1.0,"RED");        // call superclass no-arg constructor Circle() 
      this.height = 1.0; 
   } 

   // Constructor with default radius, color but given height 
   public Cylinder(double height) {
      super(4.0, "RED"); // Call the correct Circle constructor with radius and color
      this.height = height;    // Default height
  } 
   // Constructor with default color, but given radius, height 
   public Cylinder(double radius, double height) { 
      super(radius,"RED");  // call superclass constructor Circle(r) 
      this.height = height; 
   } 
    
   // A public method for retrieving the height 
   public double getHeight() { 
      return height;  
   } 
   
   // A public method for computing the volume of cylinder 
   //  use superclass method getArea() to get the base area 
   public double getVolume() {
      return super.getArea() * height; 
   }

   @Override
   public double getArea (){
      double radius = getRadius();
      return 2 * Math.PI * radius * height + 2 * super.getArea(); 
   }

   @Override
   public String toString() {
       return "Cylinder: subclass of " + super.toString()  // Call Circle's toString()
               + " height=" + height;
   }

//   @Override
//   public String toString() {
//       return "Cylinder[radius=" + getRadius() + ", height=" + height + ", color=" + gettercolor() + "]";
//   }
}