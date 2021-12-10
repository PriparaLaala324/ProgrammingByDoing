import java.util.ArrayList;
import java.util.Random;
public class BasicArraylists3
{
  public static void main(String[]args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i=1; i<=1000; i++)
    {
      list.add(getNumbers());
    }
    System.out.println(list+"\t");
    }
    public static int getNumbers()
    {
      Random r = new Random();
      int x = 10+r.nextInt(90);
      return x;
  }
}
