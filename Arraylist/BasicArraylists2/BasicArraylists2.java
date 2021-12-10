import java.util.ArrayList;
import java.util.Random;
public class BasicArraylists2
{
  public static void main(String[]args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i=1; i<=10; i++)
    {
      list.add(getNumbers());
    }
    System.out.println("ArrayList: "+list);
    }
    public static int getNumbers()
    {
      Random r = new Random();
      int x = 1+r.nextInt(100);
      return x;
    }
}
