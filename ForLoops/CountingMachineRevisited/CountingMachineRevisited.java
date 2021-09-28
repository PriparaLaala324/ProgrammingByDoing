import java.util.Scanner;
public class CountingMachineRevisited
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Count from: ");
    int cFrom = keyboard.nextInt();
    System.out.print("Count to: ");
    int cTo = keyboard.nextInt();
    System.out.print("Count by: ");
    int cBy = keyboard.nextInt();

    for(int i=cFrom; i<=cTo; i=i+cBy)
    {
      System.out.print(i + " ");
    }
  }
}
