import java.util.Scanner;

import java.util.Random;

public class ThreeCardMonte
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int card;
    int x = 1 + r.nextInt(3);
    System.out.println("You fell into a hole where you can't get out on your own.");
    System.out.println("A witch showed up and he promise that he will get you out of here if you win the game.");
    System.out.println("Or else you will die in this hole.");
    System.out.println();
    System.out.println("Choice a card with ace");
    System.out.println();
    System.out.println("      ##    ##    ##");
    System.out.println("      ##    ##    ##");
    System.out.println("      1     2     3 ");
    System.out.println();
    System.out.print("> ");
    card = keyboard.nextInt();
    System.out.println();

    if (card != x)
    {
      System.out.println("The witch wins!");
      System.out.println("Witch: Prepare to death!");
      if (x == 1)
      {
        System.out.println("      AA    ##    ##");
        System.out.println("      AA    ##    ##");
        System.out.println("      1     2     3 ");
      }
      else if (x == 2)
      {
        System.out.println("      ##    AA    ##");
        System.out.println("      ##    AA    ##");
        System.out.println("      1     2     3 ");
      }
      else if (x == 3)
      {
        System.out.println("      ##    ##    AA");
        System.out.println("      ##    ##    AA");
        System.out.println("      1     2     3 ");
      }
    }
    else if (card == x)
    {
      System.out.println("Witch: Damn it! You win!");
      System.out.println("The witch used his magic to let you get out of the hole.");
      if (x == 1)
      {
        System.out.println("      AA    ##    ##");
        System.out.println("      AA    ##    ##");
        System.out.println("      1     2     3 ");
      }
      else if (x == 2)
      {
        System.out.println("      ##    AA    ##");
        System.out.println("      ##    AA    ##");
        System.out.println("      1     2     3 ");
      }
      else if (x == 3)
      {
        System.out.println("      ##    ##    AA");
        System.out.println("      ##    ##    AA");
        System.out.println("      1     2     3 ");
      }
    }
  }
}
