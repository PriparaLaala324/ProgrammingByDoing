import java.util.Scanner;

public class AgeInFiveYears
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;
    int ageFive;
    int ageFiveb;

    System.out.println( "Hello! What's your name?" );
    name = keyboard.next();
    System.out.println();
    System.out.println( "Hi, " + name + "." );
    System.out.println( "How do are you?" );
    age = keyboard.nextInt();
    System.out.println();
    ageFive = age+5;
    ageFiveb = age-5;
    System.out.println( " Did you know that in five years you will be " + ageFive + " years old?" );
    System.out.println( " And five years ago  you were " + ageFiveb + "! Imagine that!" );
  }
}
