import java.util.Scanner;

public class BMICalculatorBonus
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    double weight, height, BMI, m, kg;
    System.out.println( "Your height in inches: " );
    height = keyboard.nextDouble();
    m = height / 25.4;
    System.out.println( "Your weight in pound: " );
    weight = keyboard.nextDouble();
    kg = weight / 0.45359237;
    System.out.println();
    BMI = m / kg * kg;
    System.out.println( "Your BMI is " + BMI );
  }
}
