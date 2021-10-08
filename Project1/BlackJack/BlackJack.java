import java.util.Scanner;
import java.util.Random;
public class BlackJack
{
  public static void main(String[]args)
  {
    int point = 0;
    String replay, dchoice;
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    System.out.println("\nSharon: Welcome to Sharon's blackjack gamble.");
    System.out.println("Sharon: I'm the dealer here.");
    System.out.println("Sharon: Do you want to play with me (yes/no)?");
    System.out.print("> ");
    String choice = keyboard.next();
    if (choice.equals("no"))
    {
      System.out.println("Sharon: You are too weak to gamble?");
      System.out.println("Sharon: Don't waste my time!");
    }
    else if (choice.equals("yes"))
    {
      do
      {
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Sharon: Here is the rule.");
        System.out.println("Sharon: We both have 10 points, try to win the points from me.");
        System.out.println("--------------------------------------------------------------");
        int pc1 = 2 + r.nextInt(10);
        int pc2 = 2 + r.nextInt(10);
        int ptotal = pc1 + pc2;
        int dc1 = 2 + r.nextInt(10);
        int dc2 = 2 + r.nextInt(10);
        int dtotal = dc1 + dc2;

        System.out.println("\nSharon: Please flip your card.");
        System.out.println("Sharon: You get a " + pc1 + " and a " + pc2 + ".");
        System.out.println("Sharon: Your total is " + ptotal + ".");
        System.out.println("Sharon: I have a " + dc1 + " showing, and a hidden card.");
        System.out.println("Sharon: My total is hidden, too.");

        do
        {
          System.out.println("Sharon: Would you like to \"hit\" or \"stay\"? ");
          System.out.print("> ");
          dchoice = keyboard.next();

          if (dchoice.equals("hit"))
          {
            int ncard = 2 + r.nextInt(10);
            System.out.println("\nSharon: You drew a " + ncard + ".");
            ptotal += ncard;
            System.out.println("Sharon: Your total is " + ptotal + ".");
          }
        } while (ptotal <= 21 && (!dchoice.equals("stay")));

          if (ptotal <= 21)
          {
            System.out.println("Sharon: IT'S MY TURN~~~");
            System.out.println("Sharon: My hidden card was a " + dc2 + ".");
            System.out.println("Sharon: The total is " + dtotal + ".");

            do
            {
              if (dtotal < 17)
              {
                System.out.println("Sharon: Um...It's quite small...");
                System.out.println("Sharon: I will choose hit~");
                dchoice = "hit";
                int ncard = 2 + r.nextInt(10);
                System.out.println("Sharon: It's a " + ncard + ".");
                dtotal += ncard;
                System.out.println("Sharon: So...the total is " + dtotal + ".");
              }
              else
              {
                dchoice = "stay";
                System.out.println("Sharon: Wow~ It's a big number~");
                System.out.println("Sharon: I will choose stay~");
              }
            } while (dtotal <= 21 && (!dchoice.equals("stay")));
          }

          System.out.println("Sharon: My total is " + dtotal + ".");
          System.out.println("Sharon: Yours is " + ptotal + ".");

          if (ptotal <= 21)
          {
            if (dtotal <= 21)
            {
              if (ptotal > dtotal)
              {
                System.out.println("Sharon: HUMPH!!! YOU WIN!");
                System.out.println("Sharon: I will get you next time!");
                point++;
              }
              else if (ptotal == dtotal)
              {
                System.out.println("Sharon: We have the same number~");
              }
              else
              {
                System.out.println("Sharon: HAHAHA!!! I win!!!");
                point--;
              }
            }
            else
            {
              System.out.println("Sharon: HUMPH!!! YOU WIN!");
              System.out.println("Sharon: I will get you next time!");
              point++;
            }
          }
          else
            {
              System.out.println("Sharon: HAHAHA!!! I win!!!");
              point--;
            }
            if (point==10)
            {
              System.out.println("Sharon: HUMPH!!! YOU WON ALL MY POINTS!");
              System.out.println("Sharon: I WON'T BE EASY NEXT TIME!!!");
            }
            else if (point == 0)
            {
              System.out.println("Sharon: So~Sad~ You ran out of points~");
              System.out.println("Sharon: Better luck next time~");
              break;
            }
            System.out.println("Sharon: You have " + point + ".");
            System.out.println("Sharon: Do you want to continue playing (yes/no)?");
            System.out.print("> ");
            replay = keyboard.next();
        }while (!replay.equals("no"));
      }
  }
}
