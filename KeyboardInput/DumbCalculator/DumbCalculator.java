import java.util.Scanner;

public class DumbCalculator
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double number1, number2, number3, total;
        System.out.print( "What is your first number? " );
        number1 = keyboard.nextDouble();
        System.out.print( "What is your second number? " );
        number2 = keyboard.nextDouble();
        System.out.print( "What is your third number? " );
        number3 = keyboard.nextDouble();
        System.out.println();
        total = (number1 + number2 + number3) / 2;
        System.out.println( "( " + number1 + " + " + number2 + " + " + number3 + " ) / 2 is... " + total );
    }
}
