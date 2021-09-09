import java.util.Scanner;

public class GenderGame
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    String gender, FN, LN, marriage;
    int age;

    System.out.println("What's your gender (M or F): ");
    gender = keyboard.next();
    System.out.println("First name: ");
    FN = keyboard.next();
    System.out.println("Last name: ");
    LN = keyboard.next();
    System.out.println("Age: ");
    age = keyboard.nextInt();
    System.out.println();

    if ( age < 20 )
    {
      System.out.println("Then I shall call you " + FN + " " + LN + ".");
    }
    else if ( age >= 20 )
    {
      System.out.println("Are you married, " + FN + "(y or n)? ");
      marriage = keyboard.next();
      System.out.println();
      if ( gender.equals("F") && marriage.equals("y") )
      {
        System.out.println("Then I shall call you Mrs. " + LN + ".");
      }
      else if ( gender.equals("F") && marriage.equals("n") )
      {
        System.out.println("Then I shall call you Ms. " + LN + ".");
      }
      else if ( gender.equals("M") && marriage.equals("y") )
      {
        System.out.println("Then I shall call you Mr. " + LN + ".");
      }
      else if ( gender.equals("M") && marriage.equals("n") )
      {
        System.out.println("Then I shall call you Mr. " + LN + ".");
      }
    }
  }
}
