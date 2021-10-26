import java.io.*;
public class LetterRevisited
{

  public static void main(String[] args) throws IOException
  {
    File score = new File ("LetterRevisited.txt");
    FileWriter fw = new FileWriter(score);
    PrintWriter pw = new PrintWriter(fw);

    pw.println("+--------------------------------------------------------+");
    pw.println("|                                                   #### |");
    pw.println("|                                                   #### |");
    pw.println("|                                                   #### |");
    pw.println("|                                                        |");
    pw.println("|                           Bill Gates                   |");
    pw.println("|                           1 Minecraft Way              |");
    pw.println("|                           RedDiamond, WA 98104         |");
    pw.println("+--------------------------------------------------------+");

    pw. close();
  }
}
