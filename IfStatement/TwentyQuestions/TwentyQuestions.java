import java.util.Scanner;

public class TwentyQuestions
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    String answer1, answer2;
    System.out.println( "TWO QUESTIONS!" );
    System.out.println( "Question 1) Is it animals, vegetables, or minerials?" );
    System.out.println( "> " );
    answer1 = keyboard.next();
    System.out.println( "Question 2) Is it bigger than a breadbox?" );
    System.out.println( "> " );
    answer2 = keyboard.next();
    if ( answer2.equals("yes") )
    {
      if ( answer1.equals("animals") )
      {
        System.out.println( "My guess is that you are thinking of a moose." );
        System.out.println( "I would ask you if I'm right, but I don't actually care." );
      }
      else if ( answer1.equals("vegetable") )
      {
        System.out.println( "My guess is that you are thinking of a watermelon." );
        System.out.println( "I would ask you if I'm right, but I don't actually care." );
      }
      else if ( answer1.equals("minerial") )
      {
        System.out.println( "My guess is that you are thinking of a Camaro." );
        System.out.println( "I would ask you if I'm right, but I don't actually care." );
      }
    }
    else if ( answer2.equals("no") )
    {
      if ( answer1.equals("animals") )
      {
        System.out.println( "My guess is that you are thinking of a squirrel." );
        System.out.println( "I would ask you if I'm right, but I don't actually care." );
      }
      else if ( answer1.equals("vegetable") )
      {
        System.out.println( "My guess is that you are thinking of a carrot." );
        System.out.println( "I would ask you if I'm right, but I don't actually care." );
      }
      else if ( answer1.equals("minerial") )
      {
        System.out.println( "My guess is that you are thinking of a paper clip." );
        System.out.println( "I would ask you if I'm right, but I don't actually care." );
      }
    }
}
}
