import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class FindingAValueInAnArraylist
{
  public static void main(String[]args)
  {
    Random r = new Random();
    ArrayList<Integer> soHard = new ArrayList<Integer>();
    Scanner kb = new Scanner(System.in);
    for(int i=0; i<10; i++)
    {
      soHard.add(1+r.nextInt(51));
    }
    System.out.println("ArrayList: ["+soHard+"]");
    System.out.print("please enter an integer: ");
    int x = kb.nextInt();
    System.out.println("Value to find "+ x);
    for(Integer i:soHard)
    {
      if (x==i)
      {
        System.out.println(x+" is in the ArrayList");
      }
    }
  }
}
