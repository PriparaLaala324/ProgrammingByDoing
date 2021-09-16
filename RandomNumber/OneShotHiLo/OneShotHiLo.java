import java.util.Scanner;

import java.util.Random;

public class OneShotHiLo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int choice;
    int x = r.nextInt(100);
    System.out.println("I'm thinking of a number between 1~100. Try to guess it.");
    System.out.print("> ");
    choice = keyboard.nextInt();

    if (choice == x)
      System.out.println("You guessed it! What are the odds?");
    else if (choice < x)
      System.out.println("Sorry, you are too low. I was thinking of " + x + ".");
    else if (choice > x)
      System.out.println("Sorry, you are too high. I was thinking of " + x + ".");
  }
}
