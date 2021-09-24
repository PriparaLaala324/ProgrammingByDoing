import java.util.Scanner;

public class AddingValuesInLoop
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    int number;
    int total = 0;

    System.out.println("I will add up the numbers you give me.");
    System.out.print("Number: ");
    number = keyboard.nextInt();
    total = number + total;
    System.out.println("The total so far is " + total + ".");

    while (number != 0)
    {
      System.out.print("Number: ");
      number = keyboard.nextInt();
      total = number + total;
      System.out.println("The total so far is " + total + ".");
    }
    if (number == 0)
    {
      System.out.println("\nThe total is " + total + ".");
    }
  }
}
