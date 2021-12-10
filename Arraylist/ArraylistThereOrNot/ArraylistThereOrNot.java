import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class ArraylistThereOrNot
{
  public static void main(String[]args)
  {
    Scanner kb = new Scanner(System.in);
    Random r = new Random();
    ArrayList<Integer> no = new ArrayList<Integer>();
    for (int i=0; i<10;i++)
    {
      no.add(1+r.nextInt(51));
    }
    System.out.println(no);
    System.out.print("Value to find: ");
    int x = kb.nextInt();
    //for (Integer i:no)
    //{
      if (no.contains(x))
      {
        System.out.println(x+" is in the ArrayList");
        //break;
      }
      else
      {
        System.out.println(x+" is not in the ArrayList");
      }
    //}
  }
}
