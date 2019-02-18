/*
Made by Ramsey Alsheikh
Objective: make a class to represent a circle, holding its radius
Last Modified: 2/10/19
*/

public class Circle
{

   //the radius of the circle
   private double radius;
   
   
   //default constructor
   //sets radius to one
   //void parameters
   public Circle()
   {
      radius = 1;
   }
   
   //defined constructor
   //sets radius to given value
   //one double parameter to hold what to set it to
   public Circle(double rad)
   {
      radius = rad;
   }
   
   //method to return the radius
   //returns a double (the radius)
   //void parameters
   public double getRadius()
   {
      return radius;
   }
   
   //method to set the radius to a given value
   //void return
   //one double parameter to hold what to set the radius to
   public void setRadius(double r)
   {
      radius = r;
   }
   
   //string return (the data fields
   //method to print out data fields
   public String toString()
   {
      String str;
      str = "Radius: " + radius;
      return str;
   }
   
   //method to determine whether another circle is equal to another
   //returns boolean
   //one Circle parameter to hold the circle to compare to
   public boolean equals(Circle circ)
   {
      if (radius == circ.getRadius())
         return true;
      else
         return false;
   }
}