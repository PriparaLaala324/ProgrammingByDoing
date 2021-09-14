import java.util.Random;

public class Dice
{
  public static void main(String[]args)
  {
    Random r = new Random();
     int x = 1 + r.nextInt(6);
     int r1, r2, total;

     System.out.println("HERE COMES THE DICE!!!");
     System.out.println();
     r1 = 1 + r.nextInt(6);
     System.out.println("Roll #1: " + r1);
     r2 = 1 + r.nextInt(6);
     System.out.println("Roll #2: " + r2);
     System.out.println(total = r1 + r2);
  }
}
