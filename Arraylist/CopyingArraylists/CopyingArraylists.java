import java.util.ArrayList;
import java.util.Random;
public class CopyingArraylists
{
  public static void main(String[]args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i=1; i<=10; i++)
    {
      list.add(getNumbers());
    }

    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2.addAll(list);

    list.set(list.size()-1, -7);
    System.out.println("ArrayList 1: "+list);
    
    //list2.set(list.size()-1, 50);
    System.out.println("ArrayList 2: "+list2);
  }
  public static int getNumbers()
  {
    Random r = new Random();
    int x = 1+r.nextInt(100);
    return x;
  }
}
