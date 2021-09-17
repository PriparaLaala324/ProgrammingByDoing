import java.util.Scanner;
public class EnterYourPIN
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    int pin = 930116;

    System.out.println("WELCOME TO THE BANK OF MILOLI.");
    System.out.print("ENTER YOUR PIN: ");
    int entry = keyboard.nextInt();

    while(entry != pin)
    {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("Enter You PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
  }
}
