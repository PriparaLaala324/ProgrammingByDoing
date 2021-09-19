import java.util.Random;

import java.util.Scanner;

public class HiLoWithLimitedTries
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int tries = 0;
    int x = 1 + r.nextInt(100);
    int number;

    System.out.println("I'm thinking of a number between 1~100. You have 7 tries.");
    System.out.print("First guess: ");
    number = keyboard.nextInt();

    while (x!= number && tries <= 7)
    {
      System.out.print("Guess #" + (tries++) + ": ");
      number = keyboard.nextInt();

      if (number == x)
      {
        System.out.println("You guessed it!!! What are the odds?!");
        break;
      }
      else if (number < x && tries < 7)
      {
        System.out.println("Sorry, you are too low.");
      }
      else if (number > x && tries < 7)
      {
        System.out.println("Sorry, that guess is too high.");
      }
    else if (number != x && tries <= 7)
    {
      System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
    }
    }
  }
}
