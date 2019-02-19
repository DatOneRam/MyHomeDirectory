/*
Made by Ramsey Alsheikh
Objective: make a class to see if two shapes are the same shape
Last Modified: 2/17/19
*/

import java.util.Scanner;

public class AnotherAnotherSmallDemoProgram
{
   public static void main(String[] args)
   {
      //make a scanner so we can read things in
      Scanner prompt = new Scanner(System.in);
      //all the data fields to hold the radi of two circles, the lengths and widthts of two rectangles,
      //and the 3 side lengths of 2 triangles
      double radius1, radius2, length1, width1, length2, width2, side1one, side2one, side3one, side1two, side2two, side3two;
      
      //do an over the top welcome
      System.out.println("M A R H A B A N !");
      prompt.nextLine();
      System.out.println("P R I V E T !");
      prompt.nextLine();
      System.out.println("H E L L O !");
      prompt.nextLine();
      System.out.println("IT IS I, THE GREAT JAVADINI!");
      prompt.nextLine();
      System.out.println("THE GREATEST MAGICIAN OF ALL TIME!");
      prompt.nextLine();
      System.out.println("I WILL TELL YOU IF TWO SHAPES ARE EQUAL!");
      prompt.nextLine();
      
      //get the first radius of a circle and check to make sure it is valid
      do
      {
         System.out.println("PLEASE ENTER IN A VALID RADIUS FOR ME TO MAKE A CIRCLE!");
         System.out.print("⎲⎲⎲ ");
         radius1 = prompt.nextDouble();
      }
      while (!Circle.verify(radius1));
      
      //get the second radius of a circle and check to make sure it is valid
      do
      {
         System.out.println("ANOTHER VALID ONE, PLEASE!");
         System.out.print("⎲⎲⎲ ");
         radius2 = prompt.nextDouble();
      }
      while (!Circle.verify(radius2));
      
      prompt.nextLine();
      System.out.println("FANTASTIC!!!!");
      prompt.nextLine();
      //get the first length and width of the first rectangle and check to make sure it is valid
      do
      {
         System.out.println("\nNOW PLEASE ENTER IN A VALID LENGTH AND WIDTH (in that order) FOR A RECTANGLE MY FRIEND!!!");
         System.out.print("⎲⎲⎲ ");
         length1 = prompt.nextDouble();
         System.out.print("⎲⎲⎲ ");
         width1 = prompt.nextDouble();
      }
      while (!Rectangle.verify(width1, length1));
      
      //get the length and width of the second rectangle and  check to make sure it is valid
      do
      {
         System.out.println("SUPERB! MAY I HAVE ANOTHER VALID PAIR SIR/MA'AM/NON-BINARY?");
         System.out.print("⎲⎲⎲ ");
         length2 = prompt.nextDouble();
         System.out.print("⎲⎲⎲ ");
         width2= prompt.nextDouble();
      }
      while (!Rectangle.verify(width2, length2));
      
      prompt.nextLine();
      System.out.println("ABSOLUTLEY UNBELIVABLE!!!");
      prompt.nextLine();
      //get the 3 side lengths of the first triangle and check to make sure it is valid
      do
      {
         System.out.println("WOULD YOU CARE TO ENTER IN THREE VALID SIDE LENGTHS FOR ME TO MAKE A THREE ANGLED POLYGON????????");
         System.out.print("⎲⎲⎲ ");
         side1one = prompt.nextDouble();
         System.out.print("⎲⎲⎲ ");
         side2one = prompt.nextDouble();
         System.out.print("⎲⎲⎲ ");
         side3one = prompt.nextDouble();
      }
      while (!Triangle.verify(side1one, side2one, side3one));
      
      //confirmation
      prompt.nextLine();
      System.out.println("ETHERALLY RADICAL!!!!!");
      prompt.nextLine();
      //get the 3 side lengths of the second triangle and check to make sure it is valid
      do
      {
         System.out.println("COULD YOU DO IT AGAIN IN A VALID WAY SO I HAVE TWO TO COMPARE????????");
         System.out.print("⎲⎲⎲ ");
         side1two = prompt.nextDouble();
         System.out.print("⎲⎲⎲ ");
         side2two = prompt.nextDouble();
         System.out.print("⎲⎲⎲ ");
         side3two = prompt.nextDouble();
      }
      while (!Triangle.verify(side1two, side2two, side3two));
      
      //make all the shapes with their respective measurments that we have verified are valid
      Circle circ1 = new Circle(radius1);
      Circle circ2 = new Circle(radius2);
      Rectangle rect1 = new Rectangle(width1, length1);
      Rectangle rect2 = new Rectangle(width2, length2);
      Triangle tri1 = new Triangle(side1one, side2one, side3one);
      Triangle tri2 = new Triangle(side1two, side2two, side3two);
      
      //do an over the top introduction
      prompt.nextLine();
      System.out.println("ONE THANK TO YOU MY APTLY-TYPING FRIEND!!!");
      prompt.nextLine();
      System.out.println("NOW FOR MY MAGIC!!!");
      prompt.nextLine();
      System.out.println("HOCUS POCUS PLEASEGIVEMEANA-US ALAKAZAM!!!!!!!\nWHOOOAAAA WOOSH CLANG BOOM POP BAM ZAP HERE IT IS!");
      System.out.println("SMOOTHER COOTHER YUUTHER WITH A SPICE BOOM POP TISSUE GRASS MACHINE CLOUD BAG!");
      System.out.println("OOO EE OO AA AA TING TANG WALLA WALLA BING BANG!");
      System.out.println("BASTE PAVE CRAVE CRAMBULE HEY BRAY NEIGH SLEIGH K!");
      System.out.println("CHAMELEON VECTOR SHOE MOO PAD GAG OUT POUT NOUT SPROUT!");
      System.out.println("ACK SACK NACK LACK CACK RACK BRACK TACK EACK AACK UACK OACK!");
      System.out.println("AND NOW FOR THE FINAL MAGIC WORD...");
      prompt.nextLine();
      System.out.println("please");
      prompt.nextLine();
      System.out.println("IT WORKED! HERE ARE THE RESULTS!");
      
      //display whether or not the shapes were equal
      //use the toString method of all the shapes to show their data fields
      System.out.printf("CIRCLE 1: %s\n", circ1.toString());
      System.out.printf("CIRCLE 2: %s\n", circ2.toString());
      System.out.printf("RECTANGLE 1: %s\n", rect1.toString());
      System.out.printf("RECTANGLE 2: %s\n", rect2.toString());
      System.out.printf("TRIANGLE 1: %s\n", tri1.toString());
      System.out.printf("TRIANGLE 2: %s\n", tri2.toString());
      System.out.printf("THE CIRCLES ARE THE SAME: %b\n", circ1.equals(circ2));
      System.out.printf("THE RECTANGLES ARE THE SAME: %b\n", rect1.equals(rect2));
      System.out.printf("THE TRIANGLES ARE THE SAME: %b\n", tri1.equals(tri2));
      
      //do an over the top outro
      prompt.nextLine();
      System.out.println("THERE YOU GO!");
      prompt.nextLine();
      System.out.println("ALL DONE!");
      prompt.nextLine();
      System.out.println("NOW IF YOU'LL EXCUSE ME, I MUST GO HOME TO MY MOM'S BASEMENT!");
      prompt.nextLine();
      System.out.println("A D I O S !");
      prompt.nextLine();
      System.out.println("B O N  V O Y A G E !");
      prompt.nextLine();
      System.out.println("G O O D B Y E !");
      prompt.nextLine();
   }
}