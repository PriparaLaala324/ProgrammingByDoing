import java.util.Scanner;

public class BMICalculator
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    int weight;
    double height, BMI;
    System.out.println( " Your height in m: " );
    height = keyboard.nextDouble();
    System.out.println( " Your weight in kg: " );
    weight = keyboard.nextInt();
    System.out.println();
    BMI = weight / height * height;
    System.out.println( " Your BMI is " + BMI );
  }
}
