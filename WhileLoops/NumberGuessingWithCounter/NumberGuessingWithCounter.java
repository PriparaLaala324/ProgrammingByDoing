import java.util.Scanner;

import java.util.Random;

public class NumberGuessingWithCounter
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int tries = 0;
    int choice;
    int x = 1 + r.nextInt(10);

    System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
    System.out.print("Your guess: ");
    choice = keyboard.nextInt();
    tries++;

    while (choice != x)
    {
      System.out.println("\n That is incorrect. Guess again.");
      System.out.print("Your guess: ");
      choice = keyboard.nextInt();
      tries++;
    }
    System.out.println("That's right! You're a good guesser.");
    System.out.println("It only took you " + tries + " tries.");
  }
}
