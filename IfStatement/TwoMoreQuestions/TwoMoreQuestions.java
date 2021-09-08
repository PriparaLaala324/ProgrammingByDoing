import java.util.Scanner;

public class TwoMoreQuestions
{
  public static void main( String[] args )
  {
  Scanner keyboard = new Scanner(System.in);

  String a, place;

  System.out.println( "YEAH~~~~!");
  System.out.println( "TWO MORE QUESIONS~~~~~!" );
  System.out.println();
  System.out.println( "Think of something and I'll try to guess it (again...)" );
  System.out.println();
  System.out.println( "Q1. Does it stay inside or outside or both?" );
  System.out.print( "> " );
  place = keyboard.next();
  System.out.println( "Q2. Is it a living thing? (yes or no)" );
  System.out.print( "> " );
  a = keyboard.next();
  if ( place.equals("inside") && a.equals("yes") )
  {
    System.out.println( "I think is a houseplant" );
    System.out.println( "Maybe~" );
    System.out.println( "I don't care." );
  }
  else if ( place.equals("inside") && a.equals("no") )
  {
    System.out.println( "It's a shower curtain" );
    System.out.println( "Do you think so???" );
  }
  else if ( place.equals("outside") && a.equals("yes") )
  {
    System.out.println( "I wander if it is a bison!" );
    System.out.println( "OS: What's a bison?" );
  }
  else if ( place.equals("outside") && a.equals("no") )
  {
    System.out.println( "Um...Is it a billboard?" );
  }
  else if ( place.equals("both") && a.equals("yes") )
  {
    System.out.println( "DOGGY!!!!!!!");
  }
  else if ( place.equals("both") && a.equals("no") )
  {
    System.out.println( "HEY!!! Your cell phone is ringing!!!" );
  }
  }
}
