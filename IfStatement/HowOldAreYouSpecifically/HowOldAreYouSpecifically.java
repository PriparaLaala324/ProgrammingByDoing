import java.util.Scanner;

public class HowOldAreYouSpecifically
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;

    System.out.println( "Hey, what's your name? (Sorry, I keep forgetting). " );
    name = keyboard.next();
    System.out.println( "Ok, " + name + ", how old are you? " );
    age = keyboard.nextInt();

    String result = "";
    if ( age < 16 )
    {
      result = "You can't drive.";
      System.out.println( "You can't drive, " + name + "." );
    }
    else if ( age == 16 )
    {
      result = "You can drive but not vote.";
      System.out.println( "You can drive but not vote, " + name + "." );
    }
    else if ( age == 17 )
    {
      result = "You can drive but not vote.";
      System.out.println( "You can drive but not vote, " + name + "." );
    }
    else if ( age == 18 )
    {
      result = "You can vote but not rent a car.";
      System.out.println( "You can vote but not rent a car, " + name + "." );
    }
    else if ( age == 19 )
    {
      result = "You can vote but not rent a car.";
      System.out.println( "You can vote but not rent a car, " + name + "." );
    }
    else if ( age == 20 )
    {
      result = "You can vote but not rent a car.";
      System.out.println( "You can vote but not rent a car, " + name + "." );
    }
    else if ( age == 21 )
    {
      result = "You can vote but not rent a car.";
      System.out.println( "You can vote but not rent a car, " + name + "." );
    }
    else if ( age == 22 )
    {
      result = "You can vote but not rent a car.";
      System.out.println( "You can vote but not rent a car, " + name + "." );
    }
    else if ( age == 23 )
    {
      result = "You can vote but not rent a car.";
      System.out.println( "You can vote but not rent a car, " + name + "." );
    }
    else if ( age == 24 )
    {
      result = "You can vote but not rent a car.";
      System.out.println( "You can vote but not rent a car, " + name + "." );
    }
    else if ( age >= 25 )
    {
      result = "You can do pretty much anything.";
      System.out.println( "You can do pretty much anything, " + name + "." );
    }
  }
}
