/*
Made by Ramsey Alsheikh
Last Modfied: 2/10/19
Objective: make a program to calcuate the area of a circle/cylinder and the perimeter of a rectangle/triangle using
           passing by reference
*/
import java.util.Scanner;

public class OneSmallDemoProgram
{
   public static void main(String args[])
   {  
      //scanner to read in things
      Scanner prompt = new Scanner(System.in);
      //rect to hold width/length of rectangle
      Rectangle rect = new Rectangle();
      //tri to hold base/height of triangle
      Triangle tri = new Triangle();
      //circ to hold radius of circle
      Circle circ = new Circle();
      //doubles to hold measurements before we set objects
      double width = 0, length = 0, s1 = 0, s2 = 0, s3 = 0, radius = 0;
      
      //intro
      System.out.println("Class to calcuate Area and Perimeter, this is.");
      System.out.println("Make a rectangle, we will now.");
      System.out.println("Ask again I will, if you enter in invalid values");
      
      //get width and length every time they enter in an invalid value
      do
      {
         System.out.println("Width please, enter in:");
         width = prompt.nextDouble();
         System.out.println("Length please, enter in:");
         length = prompt.nextDouble();
      
         //create a new rectangle with width and length as the arguemnts
         rect = new Rectangle(width, length);
      }
      while (!rect.verify(rect.getWidth(), rect.getLength()));
      
      //get all the sides lengths for the triangle
      do
      {
         System.out.println("Triangle, we now create.");
         System.out.println("Side one length, type in:");
         //(side length 1)
         s1 = prompt.nextDouble();
         System.out.println("Side two length, type in:");
         //(side length 2)
         s2 = prompt.nextDouble();
         System.out.println("Side three length, type in:");
         //(side length 3)
         s3 = prompt.nextDouble();
         
         //create a new triangle with the side lengths
         tri = new Triangle(s1, s2, s3);
      }
      while (!tri.verify(tri.getSide1(), tri.getSide2(), tri.getSide3()));
       
      do
      {
         //get radius of circle
         System.out.println("A circle, we now build.");
         System.out.println("Radius, I must have:");
         //read it new
         radius = prompt.nextDouble();
         
         //make a new circle with that radius
         circ = new Circle(radius);
      }
      while (!circ.verify(circ.getRadius()));
        
      //show the areas/perimeters
      System.out.println("Impressive, this is!\nThe stats, here are:");
      System.out.printf("RECTANGLE AREA: %.2f\n", Area.getArea(rect));
      System.out.printf("RECTANGLE PERIMETER: %.2f\n", Area.getPerimeter(rect));
      System.out.printf("TRIANGLE AREA: %.2f\n", Area.getArea(tri));
      System.out.printf("TRIANGLE PERIMETER: %.2f\n", Area.getPerimeter(tri));
      System.out.printf("CIRCLE AREA: %.2f\n", Area.getArea(circ));
      System.out.printf("CIRCLE CIRCUMFERENCE: %.2f\n", Area.getCircumference(circ));
      
      //make a reference to mrs.weitz's class not knowing who yoda is
      System.out.println("Welcome, you are.");
      System.out.println("Huh?");
      System.out.println("Know who I am, you don't?");
      System.out.println("Kidding, you must be.");
      System.out.println("Knows Yoda, everyone does!");
      System.out.println("These days, kids...");
   }
}