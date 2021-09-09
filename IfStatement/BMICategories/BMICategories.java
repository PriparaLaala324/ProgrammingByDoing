import java.util.Scanner;

public class BMICategories
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    double weight, height, BMI;

    System.out.println( "Your height in m: " );
    height = keyboard.nextDouble();
    System.out.println( "Your weight in kg: " );
    weight = keyboard.nextDouble();
    System.out.println();
    BMI = ( weight / height * height );
    System.out.println( "Your BMI is " + BMI );
    if ( BMI < 15.0 )
    {
      System.out.println( "BMI Category: very severely underweight" );
    }
    else if ( BMI >= 15.0 && BMI <= 16.0 )
    {
      System.out.println( "BMI Category: severely underweight" );
    }
    else if ( BMI >= 16.1 && BMI <= 18.4 )
    {
      System.out.println( "BMI Category: underweight" );
    }
    else if ( BMI >= 18.5 && BMI <= 24.9 )
    {
      System.out.println( "BMI Category: normal weight" );
    }
    else if ( BMI >= 25.0 && BMI <= 29.9 )
    {
      System.out.println( "BMI Category: overweight" );
    }
    else if ( BMI >= 30.0 && BMI <= 34.9 )
    {
      System.out.println( "BMI Category: moderately obese" );
    }
    else if ( BMI >= 35.0 && BMI <= 39.9 )
    {
      System.out.println( "BMI Category: severely obese" );
    }
    else if ( BMI >= 40.0 )
    {
      System.out.println( "BMI Category: morbidly obese" );
    }
  }
}
