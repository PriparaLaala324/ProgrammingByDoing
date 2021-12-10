import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class ArraylistWhereIsIt
{
  public static void main(String[]args)
  {
    Random r = new Random();
    Scanner kb = new Scanner(System.in);
    ArrayList<Integer> yeah = new ArrayList<Integer>();
    for (int i=0; i<10;i++)
    {
      yeah.add(1+r.nextInt(51));
    }
    System.out.println("ArrayList: "+yeah);
    System.out.print("Value to find: ");
    int x = kb.nextInt();
    //for(Integer i:yeah)
    //{
      if(yeah.contains(x))
      {
        System.out.println(x+" is in slot "+yeah.indexOf(x));
      }
    //}
  }
}
