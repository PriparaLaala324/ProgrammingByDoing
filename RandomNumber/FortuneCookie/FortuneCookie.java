import java.util.Random;

public class FortuneCookie
{
  public static void main(String[]args)
  {
    Random r = new Random();

    int x = 1 + r.nextInt(54);
    int choice = 1 + r.nextInt(6);
    String response = "";

    if (choice == 1)
      response = "You will find happiness with a new love.";
    else if (choice == 2)
      response = "You will go into hall if you do something bad.";
    else if (choice == 3)
      response = "You will never find your love if you don't look around.";
    else if (choice == 4)
      response = "Stick with your wife or husband.";
    else if (choice == 5)
      response = "Don't waste time on this!!!";
    else if (choice == 6)
      response = "Talk to someone.";
    else
      response = "ERROR";

    System.out.println("Fortune cookie says: " + response);
    System.out.print(1 + r.nextInt(54) + "\t" );
    System.out.print(1 + r.nextInt(54) + "\t" );
    System.out.print(1 + r.nextInt(54) + "\t" );
    System.out.print(1 + r.nextInt(54) + "\t" );
    System.out.print(1 + r.nextInt(54) + "\t" );
    System.out.print(1 + r.nextInt(54) + "\t" );
    System.out.println();
  }
}
