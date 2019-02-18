/*
Made by Ramsey Alsheikh
Last Modfied: 2/10/19
Objective: make a class to represent a triangle, holding the lengths of all three sids
*/

public class Triangle
{
   //doube variabli to hold the sides
   private double side1, side2, side3;
   
   //default constructor
   //void parameters
   //sets each side to one
   public Triangle()
   {
      side1 = 1;
      side2 = 1;
      side3 = 1;
   }
   
   //defined constructor
   //three double parameters to hold what each side should be set to
   //sets each side to respective argument
   public Triangle(double o, double t, double tr)
   {
      side1 = o;
      side2 = t;
      side3 = tr;
   }
   
   //getter to get first side
   //double return
   //void parameters
   public double getSide1()
   {
      return side1;
   }
   
   //getter to get second side
   //double return
   //void parameters
   public double getSide2()
   {
      return side2;
   }
   
   //getter to get third side
   //double return
   //void parameters
   public double getSide3()
   {
      return side3;
   }
 
   
   //setter to set first side
   //void return
   //one double parameter to hold what to set side to
   public void setSide1(double b)
   {
      side1 = b;
   }
   
   //setter to set second side
   //void return
   //one double parameter to hold what to set side to
   public void setSide2(double h)
   {
      side2 = h;
   }
   
   //setter to set third side
   //void return
   //one double parameter to hold what to set side to
   public void setSide3(double m)
   {
      side3 = m;
   }
   
   //void paramters
   //method to print the data fields as strings
   //returns string
   public String toString()
   {
      String str;
      str = "Side 1: " + side1 + "\nSide 2: " + side2 + "\nSide 3: " + side3;
      return str;
   }
   
   //method to determine whether another triangle is equal to another
   //returns boolean
   //one Triangle parameter to hold the triangle to compare to
   public boolean equals(Triangle tri)
   {
      if (side1 == tri.getSide1() && side2 == tri.getSide2() && side3 == tri.getSide3())
         return true;
      else
         return false;
   }
}