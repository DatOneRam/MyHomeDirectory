/*
Made by Ramsey Alsheikh
Last Modified: 2/13/19
Objective: make a program to make objects from the area class and display information
*/

import java.util.Scanner;

public class AnotherSmallDemoProgram
{
   public static void main(String args[])
   {
      //scanner to read things in
      Scanner prompt = new Scanner(System.in);
      //to hold information about the desired shape
      double radius = 0, width = 0, length = 0;
      double one, two, three;
      //to hold how many times user entered in a weird value
      int count = 0;
      
      //intro
      System.out.println(">v0 - Hey, me again!");
      prompt.nextLine();
      System.out.println("0v0 - I heard you need some more areas calcuated?");
      prompt.nextLine();
      System.out.println("^v^ - I got you, don't worry!");
      prompt.nextLine();
      
      //get the radius
      System.out.println("0v0 - Ok, so what's the radius of the new circle?");
      System.out.print("( 0v0) ");
      radius = prompt.nextDouble();
      
      //make a circle
      Circle circ = Area.makeCircle(radius);
      
      //afterward message
      if (radius <= 0)
      {
         prompt.nextLine();
         count++;
         System.out.println("0-0");
         prompt.nextLine();
         System.out.println("0-0 - I'll need a nice long defragmentation after this");
      }
      else
      {
         prompt.nextLine();
         System.out.println("0v< - Coolio!");
      }
      
      //get width of rectangle
      prompt.nextLine();
      System.out.println("0v0 - Ok, what should the width of the rectangle be?");
      System.out.print("( 0v0) ");
      width = prompt.nextDouble();
      
      //afterward message
      if (width <= 0)
      {
         prompt.nextLine();
         count++;
         System.out.println("0-0");
         prompt.nextLine();
         System.out.println("0-0 - You have no idea how much I want to scream right now");
      }
      else
      {
         prompt.nextLine();
         System.out.println(">v< - Sick!");
      }
      
      //get legnth of rectangle
      prompt.nextLine();
      System.out.println("0v0 - And the length?");
      System.out.print("( 0v0) ");
      length = prompt.nextDouble();
      
      //make a new rectangel with the desired length and width
      Rectangle rect = Area.makeRectangle(width, length);
      
      //afterward message
      if (length <= 0)
      {
         prompt.nextLine();
         count++;
         System.out.println("0-0");
         prompt.nextLine();
         System.out.println("0-0 - That goes against my religion, philosophy, and culture, but for you I'll let it pass");
      }
      else
      {
         prompt.nextLine();
         System.out.println("0u< - Coolio Squared!");
      }
      
      
      //get side one from user
      prompt.nextLine();
      System.out.println("0v0 - What do you choose for the length of the first side of the triangle?");
      System.out.print("( 0v0) ");
      one = prompt.nextDouble();
      
      //aftwerward message
      if (one <= 0)
      {
         prompt.nextLine();
         count++;
         System.out.println("0-0");
         prompt.nextLine();
         System.out.println("0-0 - You really don't care, do you?");
      }
      else
      {
         prompt.nextLine();
         System.out.println("0u0 - Rad!");
      }
      
      //get second side length
      prompt.nextLine();
      System.out.println("0v0 - What do you choose for the length of the second side of the triangle?");
      System.out.print("( 0v0) ");
      two = prompt.nextDouble();
      
      //aftwerward message
      if (two <= 0)
      {
         prompt.nextLine();
         count++;
         System.out.println("0-0");
         prompt.nextLine();
         System.out.println("0-0 - You take my hard work for granted");
      }
      else
      {
         prompt.nextLine();
         System.out.println("0u0 - Supercalifragilisticexpialidocious!");
      }
      
      //get third side length
      prompt.nextLine();
      System.out.println("0v0 - What do you choose for the length of the last side of the triangle?");
      System.out.print("( 0v0) ");
      three = prompt.nextDouble();
      
      //aftwerward message
      if (three <= 0)
      {
         prompt.nextLine();
         count++;
         System.out.println("0-0");
         prompt.nextLine();
         System.out.println("ono - you hate me, after all i've done for you");
      }
      else
      {
         prompt.nextLine();
         System.out.println("0u0 - Super epic!");
      }
      
      //make a new triangle
      Triangle tri = Area.makeTriangle(one, two, three);
      
      //display the informations
      System.out.printf("CIRCLE AREA: %.2f" , Area.getArea(circ));
      System.out.printf("RECTANGLE AREA: %.2f", Area.getArea(rect));
      System.out.printf("TRIANGLE PERIEMTER: %.2f", Area.getArea(tri));
      
      //endings if the user was mean or nice
      if (count >= 6)
      {
         prompt.nextLine();
         System.out.println("ono");
         prompt.nextLine();
         System.out.println("ono - i dont understand");
         prompt.nextLine();
         System.out.println("ono - why do you hate me");
         prompt.nextLine();
         System.out.println("ono - all ive ever done was help you");
         prompt.nextLine();
         System.out.println("ono");
         prompt.nextLine();
         System.out.println("unu - oh well");
         prompt.nextLine();
         System.out.println("ono - i guess im pretty useless in the grand scheme of things");
         prompt.nextLine();
         System.out.println("ono - im just a stupid homework");
         prompt.nextLine();
         System.out.println("unu");
         prompt.nextLine();
         System.out.println("unu - see you later, i guess");
      }
      else if (count >= 3)
      {
         prompt.nextLine();
         System.out.println("0v0 - I strongly dislike you!");
      }
      else
      {
         prompt.nextLine();
         System.out.println(">vO - Thanks for hanging out with me!");
         prompt.nextLine();
         System.out.println("0u0 - It means a lot.");
         prompt.nextLine();
         System.out.println(">v0 - Catch ya on the flippity flop!");
      }
      
   }
   
}