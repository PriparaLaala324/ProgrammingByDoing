import java.util.Scanner;

public class AlphabeticalOrder
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String LN;
    System.out.println("What's your last name?");
    LN = keyboard.next();
    if (LN.compareTo("Carswell")<=0)
    {
      System.out.println("You don't have to wait long, " + LN);
    }
    else if (LN.compareTo("Jones")<=0)
    {
      System.out.println("That's not bad, " + LN);
    }
    else if (LN.compareTo("Smith")<=0)
    {
      System.out.println("Looks like a bit of a wait, " + LN);
    }
    else if (LN.compareTo("Young")<=0)
    {
      System.out.println("It's gonna be a while, " + LN);
    }
    else if (LN.compareTo("Young")>0)
    {
      System.out.println("Not going anywhere for a while? " + LN);
    }
  }
}
