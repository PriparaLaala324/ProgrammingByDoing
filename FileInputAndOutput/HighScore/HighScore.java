import java.util.*;
import java.io.*;
public class HighScore
{
  public static void main(String[]args) throws IOException
  {
    Scanner kb = new Scanner(System.in);
    File score = new File("score.txt");
    FileWriter fw = new FileWriter(score);
    PrintWriter pw = new PrintWriter(fw);
    System.out.println("You got a high score!");
    System.out.print("\nPlease enter your score: ");
    int num = kb.nextInt();
    System.out.print("Please enter your name: ");
    String name = kb.next();
    System.out.println("Data stored into score.txt.");

    pw.println(name);
    pw.println(num);
    pw.close();
  }
}
