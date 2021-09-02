import java.util.Scanner;

public class ALittleQuiz
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int answer1, answer2, answer3, score = 0;
        System.out.print("Are you ready for a quiz? ");
        keyboard.next();
        System.out.println("Okay, here it comes!");
        System.out.println();
        System.out.println("Q1 What is Ichigo in Aikatsu's favorite food?" );
        System.out.println("    1) strawberry buffet");
        System.out.println("    2) takoyaki");
        System.out.println("    3) noodles");
        System.out.println();
        System.out.print("> ");
        answer1 = keyboard.nextInt();
        System.out.println();
        if (answer1 == 1)
        {
            System.out.println("Happy~ You are correct~");
            score++;
        }
        else
        {
            System.out.println("Unlucky...Ichigo's favorite food is strawberry buffet...");
        }
        System.out.println();
        System.out.println("Q2 Yume in Aikatsu Stars DOESN'T have magical power of voice.");
        System.out.println("    1) yes");
        System.out.println("    2) no");
        System.out.println();
        System.out.print("> ");
        answer2 = keyboard.nextInt();
        System.out.println();
        if (answer2 == 2)
        {
            System.out.println("Happy~ You are correct again~");
            score++;
        }
        else
        {
            System.out.println("Unlucky...Yume had magical power of voice before...");
        }
        System.out.println();
        System.out.println("Q3 Who are the main characters in different seasons of Aikatsu?");
        System.out.println("    1) Hinaki, Mirai, Sayuka, Ran, Yurika");
        System.out.println("    2) Sumire, Aoi, Mio, Maika, Karen");
        System.out.println("    3) Ichigo, Akari, Yume, Aine, Raki");
        System.out.println();
        System.out.print("> ");
        answer3 = keyboard.nextInt();
        System.out.println();
        if (answer3 == 3) {
          System.out.println("Happy~ You are correct again~");
            score++;
        } else {
            System.out.println("Unlucky... They are not the main characters...");
        }
        System.out.println();
        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thank you for playing! Now your Aikastu is starting!!!");
    }
}
