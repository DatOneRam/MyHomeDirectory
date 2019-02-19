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
      //little string to hold if at a certain point the user enters in something mean
      String response = "griwwed cheese, if you pwease";
      //temporary objects just so the list is at the top
      Rectangle rect;
      Triangle tri;
      Circle circ;
      
      //intro
      System.out.println(">v0 - Hey, me again!");
      prompt.nextLine();
      System.out.println("0v0 - I heard you need some more areas calcuated?");
      prompt.nextLine();
      System.out.println("^v^ - I got you, don't worry!");
      prompt.nextLine();
      
      //get the radius with a validation loop
      do
      {
         System.out.println("0v0 - Ok, so what's the radius of the new circle?");
         System.out.print("( 0v0) ");
         radius = prompt.nextDouble();
         
         //make a circle
         circ = Area.makeCircle(radius);
         
         //afterward message
         if (!circ.verify(circ.getRadius()))
         {
            prompt.nextLine();
            count++;
            System.out.println("0-0 - thats not valid");
            prompt.nextLine();
            System.out.println("0-0 - I'll need a nice long defragmentation after this");
            prompt.nextLine();
         }
         else
         {
            prompt.nextLine();
            System.out.println("0v< - Coolio!");
         }
      }
      while (radius <= 0);
       
      //get width of rectangle and check to make sure it is a valid rectangle
      do
      {
         prompt.nextLine();
         System.out.println("0v0 - Ok, what should the width of the rectangle be?");
         System.out.print("( 0v0) ");
         width = prompt.nextDouble();
      
         //afterward message
         if (width <= 0)
         {
            prompt.nextLine();
            count++;
            System.out.println("0-0 - thats not valid");
            prompt.nextLine();
            System.out.println("0-0 - You have no idea how much I want to scream right now");
         }
         else
         {
            prompt.nextLine();
            System.out.println(">v< - Sick!");
         }
      }
      while (width <= 0);
      
      //get legnth of rectangle and validate it
      do
      {
         prompt.nextLine();
         System.out.println("0v0 - And the length?");
         System.out.print("( 0v0) ");
         length = prompt.nextDouble();
         
         //make a new rectangel with the desired length and width
         rect = Area.makeRectangle(width, length);
         
         //afterward message
         if (length <= 0)
         {
            prompt.nextLine();
            count++;
            System.out.println("0-0 - that is not valid, oh my");
            prompt.nextLine();
            System.out.println("0-0 - That goes against my religion, philosophy, and culture, but for you I'll let it pass");
            prompt.nextLine();
         }
         else
         {
            prompt.nextLine();
            System.out.println("0u< - Coolio Squared!");
         }
      }
      while (length <= 0);
      
      //triangle validation loop
      do
      {
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
            System.out.println("0-0 - not valid");
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
            System.out.println("0-0 - it. aint. valid");
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
            System.out.println("0-0 - its not valid");
            response = prompt.nextLine();
            System.out.println("ono - you hate me, after all i've done for you");
         }
         else
         {
            prompt.nextLine();
            System.out.println("0u0 - Super epic!");
         }
         
         //make the triangle with the sides
         tri = Area.makeTriangle(one, two, three);
      }
      while (!tri.verify(tri.getSide1(), tri.getSide2(), tri.getSide3()));
      //display the informations
      System.out.printf("CIRCLE AREA: %.2f" , Area.getArea(circ));
      System.out.printf("CIRCLE CIRCUMFERENCE: %.2f", Area.getCircumference(circ));
      System.out.printf("RECTANGLE AREA: %.2f", Area.getArea(rect));
      System.out.printf("RECTANGLE PERIMETER: %.2f", Area.getPerimeter(rect));
      System.out.printf("TRIANGLE AREA: %.2f", Area.getArea(tri));
      System.out.printf("TRIANGLE PERIEMTER: %.2f", Area.getArea(tri));
      
      //endings if the user was mean or nice
      if (response.equals("xor") && radius == 456789)
      {
         prompt.nextLine();
         System.out.println("0n0 - im going to be honest");
         prompt.nextLine();
         System.out.println("0n0 - at this point there was supposed to be an easter egg if you entered in invalid values all the way through");
         prompt.nextLine();
         System.out.println("0n0 - but then the CPU decided that it didnt want to do that and made it not work");
         prompt.nextLine();
         System.out.println("0o0 - hey, hes the boss, i cant argue!");
         prompt.nextLine();
         System.out.println("0n0 - so now you're stuck with this lame easter egg i had to make on the spot with no meaning or significange at all");
         prompt.nextLine();
         System.out.println("0n0 - oh well");
         prompt.nextLine();
         System.out.println("0n0 - ...");
         prompt.nextLine();
         System.out.println("0n0 - well, to pass the time, heres the first cante of the Divine Comedy");
         prompt.nextLine();
         System.out.println("uou - Midway upon the journey of our life  I found myself within a forest dark,  For the straightforward pathway had been lost.Ah me! how hard a thing it is to say  What was this forest savage, rough, and stern,  Which in the very thought renews the fear.So bitter is it, death is little more;  But of the good to treat, which there I found,  Speak will I of the other things I saw there.I cannot well repeat how there I entered,  So full was I of slumber at the moment  In which I had abandoned the true way.But after I had reached a mountain’s foot,  At that point where the valley terminated,  Which had with consternation pierced my heart,Upward I looked, and I beheld its shoulders,  Vested already with that planet’s rays  Which leadeth others right by every road.Then was the fear a little quieted  That in my heart’s lake had endured throughout  The night, which I had passed so piteously.And even as he, who, with distressful breath,  Forth issued from the sea upon the shore,  Turns to the water perilous and gazes;So did my soul, that still was fleeing onward,  Turn itself back to re-behold the pass  Which never yet a living person left.After my weary body I had rested,  The way resumed I on the desert slope,  So that the firm foot ever was the lower.And lo! almost where the ascent began,  A panther light and swift exceedingly,  Which with a spotted skin was covered o’er!And never moved she from before my face,  Nay, rather did impede so much my way,  That many times I to return had turned.The time was the beginning of the morning,  And up the sun was mounting with those stars  That with him were, what time the Love DivineAt first in motion set those beauteous things;  So were to me occasion of good hope,  The variegated skin of that wild beast,The hour of time, and the delicious season;  But not so much, that did not give me fear  A lion’s aspect which appeared to me.He seemed as if against me he were coming  With head uplifted, and with ravenous hunger,  So that it seemed the air was afraid of him;And a she-wolf, that with all hungerings  Seemed to be laden in her meagreness,  And many folk has caused to live forlorn!She brought upon me so much heaviness,  With the affright that from her aspect came,  That I the hope relinquished of the height.And as he is who willingly acquires,  And the time comes that causes him to lose,  Who weeps in all his thoughts and is despondent,E’en such made me that beast withouten peace,  Which, coming on against me by degrees  Thrust me back thither where the sun is silent.While I was rushing downward to the lowland,  Before mine eyes did one present himself,  Who seemed from long-continued silence hoarse.When I beheld him in the desert vast,  “Have pity on me,\" unto him I cried,  “Whiche’er thou art, or shade or real man!”He answered me: “Not man; man once I was,  And both my parents were of Lombardy,  And Mantuans by country both of them.‘Sub Julio’ was I born, though it was late,  And lived at Rome under the good Augustus,  During the time of false and lying gods.A poet was I, and I sang that just  Son of Anchises, who came forth from Troy,  After that Ilion the superb was burned.But thou, why goest thou back to such annoyance?  Why climb’st thou not the Mount Delectable,  Which is the source and cause of every joy?”“Now, art thou that Virgilius and that fountain  Which spreads abroad so wide a river of speech?”  I made response to him with bashful forehead.“O, of the other poets honour and light,  Avail me the long study and great love  That have impelled me to explore thy volume!Thou art my master, and my author thou,  Thou art alone the one from whom I took  The beautiful style that has done honour to me.Behold the beast, for which I have turned back;  Do thou protect me from her, famous Sage,  For she doth make my veins and pulses tremble.”“Thee it behoves to take another road,\"  Responded he, when he beheld me weeping,  “If from this savage place thou wouldst escape;Because this beast, at which thou criest out,  Suffers not any one to pass her way,  But so doth harass him, that she destroys him;And has a nature so malign and ruthless,  That never doth she glut her greedy will,  And after food is hungrier than before.Many the animals with whom she weds,  And more they shall be still, until the Greyhound  Comes, who shall make her perish in her pain.He shall not feed on either earth or pelf,  But upon wisdom, and on love and virtue;  ‘Twixt Feltro and Feltro shall his nation be;Of that low Italy shall he be the saviour,  On whose account the maid Camilla died,  Euryalus, Turnus, Nisus, of their wounds;Through every city shall he hunt her down,  Until he shall have driven her back to Hell,  There from whence envy first did let her loose.Therefore I think and judge it for thy best  Thou follow me, and I will be thy guide,  And lead thee hence through the eternal place,Where thou shalt hear the desperate lamentations,  Shalt see the ancient spirits disconsolate,  Who cry out each one for the second death;And thou shalt see those who contented are  Within the fire, because they hope to come,  Whene’er it may be, to the blessed people;To whom, then, if thou wishest to ascend,  A soul shall be for that than I more worthy;  With her at my departure I will leave thee;Because that Emperor, who reigns above,  In that I was rebellious to his law,  Wills that through me none come into his city.He governs everywhere, and there he reigns;  There is his city and his lofty throne;  O happy he whom thereto he elects!”And I to him: “Poet, I thee entreat,  By that same God whom thou didst never know,  So that I may escape this woe and worse,Thou wouldst conduct me there where thou hast said,  That I may see the portal of Saint Peter,  And those thou makest so disconsolate.”Then he moved on, and I behind him followed.");
         prompt.nextLine();
         System.out.println("0n0");
         prompt.nextLine();
         System.out.println("0n0 - the book was published a long time ago, it cant still be copyrighted, dont worry");
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