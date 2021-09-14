import java.util.Scanner;

import java.util.Random;

public class NumberGuess
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int choice;
    int x = r.nextInt(10);

    System.out.println("I'm thinking of a number from 1 to 10.");
    System.out.print("Your guess: ");
    choice = keyboard.nextInt();

    System.out.println();
    if (choice == x)
    {
      System.out.println("That's right! My secret number was " + x + "!");
    }
    else if (choice != x)
    {
      System.out.println("Sorry, but I was thinking of " + x + ".");
    }
  }
}
