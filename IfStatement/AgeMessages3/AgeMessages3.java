import java.util.Scanner;

public class AgeMessages3
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age1;

    System.out.println( "Your name: " );
    name = keyboard.next();
    System.out.println( "Your age: " );
    age1 = keyboard.nextInt();
    if ( age1 > 16 )
    {
      System.out.println( "You can't drive, " + name + ".");
    }
    else if ( age1 > 16 && age1 < 17 )
    {
      System.out.println( "You can drive but not vote, " + name + "." );
    }
    else if ( age1 > 18 && age1 < 24 )
    {
      System.out.println( "You can vote but not rent a car, " + name + ".");
    }
    else if ( age1 >= 25 )
    {
      System.out.println( "You can do pretty much anything, " + name + "." );
    }
  }
}
