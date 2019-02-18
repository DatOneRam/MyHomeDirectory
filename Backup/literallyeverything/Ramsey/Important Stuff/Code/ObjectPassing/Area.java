/*
Made by Ramsey Alsheikh
Last Modified: 2/10/19
Objective: make a class with overloaded methods to caluate the area of a circle/cylinder
           and the perimeter of a rectangle/triangle when given the object of it
*/

public class Area
{

   //overloaded method to calcuate the area of a circle
   //returns a double (the area)
   //one Circle paramter for the circle we are calcuating the area of
   public static double getArea(Circle circ)
   {
      return Math.PI * (Math.pow(circ.getRadius(), 2));
   }
   
   //overloaded method to calcuate the area of a triangle
   //returns a double (the area
   //one triangle parameter
   public static double getArea(Triangle tri)
   {
      double p = (tri.getSide1() + tri.getSide2() + tri.getSide3())/2;
      double a = tri.getSide1();
      double b = tri.getSide2();
      double c = tri.getSide3();
      return Math.sqrt(p * (p-a) * (p-b) * (p-c));
   }
   
   //overloaded method to cacluate the area of a rectangle
   //returns a double, the area
   //one rectangle
   public static double getArea(Rectangle rect)
   {
      return (rect.getWidth() * rect.getLength());
   }
   
   //overloaded method to calcuate the perimeter of a triangle
   //returns a double (the perimeter)
   //one Triangle parameter to hold the triangle we are cacluating the perimeter of
   public static double getPerimeter(Triangle tri)
   {
      return tri.getSide1() + tri.getSide2() + tri.getSide3();
   }
   
   //overloaded method to calcuate the perimeter of a rectangle
   //returns a double (the perimeter)
   //one Rectangle parameter rect to hold the rectangle we are calcuating the perimeter of
   public static double getPerimeter(Rectangle rect)
   {
      return 2 * (rect.getWidth() + rect.getLength());
   }
   
   //method to get circumference
   //retursn double, the circumference
   //one circle parameter
   public static double getCircumference(Circle circ)
   {
      return circ.getRadius() * 2 * Math.PI;
   }
   
   //method to make a circle
   //returns a circle
   //double paramter to hold the radius
   public static Circle makeCircle(double r)
   {
      Circle circ = new Circle(r);
      return circ;
   }
   
   //method to make a rectangle
   //returs a rectangle
   //double parameter to hold width and lenght
   public static Rectangle makeRectangle(double w, double l)
   {
      Rectangle rect = new Rectangle(w, l);
      return rect;
   }
   
   //method to make a triangle
   //returns a Triangle
   //double parametrs for side1, side2, side3
   public static Triangle makeTriangle(double one, double two, double three)
   {
      Triangle tri = new Triangle(one, two, three);
      return tri;
   }
}