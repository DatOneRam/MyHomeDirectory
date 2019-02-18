/*
Made by Ramsey Alsheikh
Last Modfied: 2/10/19
Objective: make a class to represent a rectangle, holding the length and width
*/

public class Rectangle
{
   //hold the length and width
   private double width, length;
   
   //default constructor
   //void parameters
   //sets width and length to one
   public Rectangle()
   {
      width = 1;
      length = 1;
   }
   
   //defined constructor
   //two double parameters wid to hold width,len to hold length to be set to\
   //sets width to wid and length to len
   public Rectangle(double wid, double len)
   {
      width = wid;
      length = len;
   }
   
   //method to retrieve the width
   //returns a double (width)
   //void parameters
   public double getWidth()
   {
      return width;
   }
   
   //method to retrieve the length
   //returns a double (length)
   //void parameters
   public double getLength()
   {
      return length;
   }
   
   //method to set the width
   //returns void
   //one double parameter to hold what to set the width to
   public void setWidth(double w)
   {
      width = w;
   }
   
   //method to set the length
   //returns void
   //one double parameter l to hold what to set the length to
   public void setLength(double l)
   {
      length = l;
   }  
   
   //void parameters
   //returns a string
   //method to print out the data fields
   public String toString()
   {
      String str;
      
      str = "Width: " + width + "\nLength: " + length;

      return str;
   }
   
   //method to determine whether another rectangle is equal to another
   //returns boolean
   //one Rectangle parameter to hold the rectangle to compare to
   public boolean equals(Rectangle rect)
   {
      if (length == rect.getLength() && width == rect.getWidth())
         return true;
      else
         return false;
   }
}
