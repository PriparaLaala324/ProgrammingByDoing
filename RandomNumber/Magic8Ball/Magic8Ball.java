import java.util.Random;

public class Magic8Ball
{
  public static void main(String[] args)
  {
    Random r = new Random();

    int choice = 1 + r.nextInt(8);
    String response = "";

    if (choice == 1)
      response = "You are so lucky, you won the lottery!!!";
    else if (choice == 2)
      response = "oh...bad lucky, there will be a lot of bad things on you...";
    else if (choice == 3)
      response = "It's gonna be a normal day.";
    else if (choice == 4)
      response = "Be careful with something red";
    else if (choice == 5)
      response = "Go to confess with the person you like, maybe there will be a surprise.";
    else if (choice == 6)
      response = "Be careful with your money";
    else if (choice == 7)
      response = "Talk a walk if you felt presured, something might happen.";
    else if (choice == 8)
      response = "Enjoy the day when you are free.";
    else
      response = "8-BALL ERROR!";

    System.out.println("MAGIC 8-BALL SAYS: " + response + ".");
  }
}
