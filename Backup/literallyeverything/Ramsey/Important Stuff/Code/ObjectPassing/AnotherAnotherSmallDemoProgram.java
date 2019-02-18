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
      //get the first radius of a circle
      System.out.println("PLEASE ENTER IN A RADIUS FOR ME TO MAKE A CIRCLE!");
      System.out.print("⎲⎲⎲ ");
      radius1 = prompt.nextDouble();
      //get the second radius of a circle
      System.out.println("ANOTHER ONE, PLEASE!");
      System.out.print("⎲⎲⎲ ");
      radius2 = prompt.nextDouble();
      
      prompt.nextLine();
      System.out.println("FANTASTIC!!!!");
      prompt.nextLine();
      //get the first length and width of the first triangle
      System.out.println("\nNOW PLEASE ENTER IN A LENGTH AND WIDTH (in that order) FOR A RECTANGLE MY FRIEND!!!");
      System.out.print("⎲⎲⎲ ");
      length1 = prompt.nextDouble();
      System.out.print("⎲⎲⎲ ");
      width1 = prompt.nextDouble();
      //get the length and width of the second triangle
      System.out.println("SUPERB! MAY I HAVE ANOTHER PAIR SIR/MA'AM/NON-BINARY?");
      System.out.print("⎲⎲⎲ ");
      length2 = prompt.nextDouble();
      System.out.print("⎲⎲⎲ ");
      width2= prompt.nextDouble();
      
      prompt.nextLine();
      System.out.println("ABSOLUTLEY UNBELIVABLE!!!");
      prompt.nextLine();
      //get the 3 side lengths of the first triangle
      System.out.println("WOULD YOU CARE TO ENTER IN THREE SIDE LENGTHS FOR ME TO MAKE A THREE ANGLED POLYGON????????");
      System.out.print("⎲⎲⎲ ");
      side1one = prompt.nextDouble();
      System.out.print("⎲⎲⎲ ");
      side2one = prompt.nextDouble();
      System.out.print("⎲⎲⎲ ");
      side3one = prompt.nextDouble();
      
      //get the 3 side lengths of the second triangle
      prompt.nextLine();
      System.out.println("ETHERALLY RADICAL!!!!!");
      prompt.nextLine();
      System.out.println("COULD YOU DO IT AGAIN SO I HAVE TWO TO COMPARE????????");
      System.out.print("⎲⎲⎲ ");
      side1two = prompt.nextDouble();
      System.out.print("⎲⎲⎲ ");
      side2two = prompt.nextDouble();
      System.out.print("⎲⎲⎲ ");
      side3two = prompt.nextDouble();
      
      //make all the shapes with their respective measurments
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
      System.out.println("OOO EE OO AAA TING TANG WALLA WALLA BING BANG!");
      System.out.println("BASTE PAVE CRAVE CRAMBULE HEY BRAY NEIGH SLEIGH K!");
      System.out.println("CHAMELEON VECTOR SHOE MOO PAD GAG OUT POUT NOUT SPROUT!");
      System.out.println("ACK SACK NACK LACK CACK RACK BRACK TACK EACK AACK UACK OACK!");
      System.out.println("AND NOW FOR THE FINAL MAGIC WORD...");
      prompt.nextLine();
      System.out.println("please");
      prompt.nextLine();
      System.out.println("IT WORKED! HERE ARE THE RESULTS!");
      
      //display whether or not the shapes were equal
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