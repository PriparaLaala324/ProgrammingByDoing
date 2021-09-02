import java.util.Scanner;

public class SpaceBoxing
{

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int earthWeight, choice;
        double planetWeight = 0.0;
        System.out.print("Please enter your current earth weight: ");
        earthWeight = keyboard.nextInt();
        System.out.println();
        System.out.println("I have information for the following planets:");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune");
        System.out.println();
        System.out.print("Which planet are you visiting? ");
        choice = keyboard.nextInt();
        System.out.println();
        if (choice == 1)
        {
            planetWeight = earthWeight * 0.78;
        }
        else if (choice == 2)
        {
            planetWeight = earthWeight * 0.39;
        }
        else if (choice == 3)
        {
            planetWeight = earthWeight * 2.65;
        }
        else if (choice == 4)
        {
            planetWeight = earthWeight * 1.17;
        }
        else if (choice == 5)
        {
            planetWeight = earthWeight * 1.05;
        }
        else if (choice == 6)
        {
            planetWeight = earthWeight * 1.23;
        }
        else
        {
            System.out.println("Not a valid planet.");
        }
        System.out.println("Your weight would be " + planetWeight + " pounds on that planet.");
    }
}
