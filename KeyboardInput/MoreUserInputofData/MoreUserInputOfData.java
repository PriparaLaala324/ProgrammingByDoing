import java.util.Scanner;

public class MoreUserInputOfData
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int grade, studentId;
    String firstName, lastName, login;
    double GPA;

    System.out.println( "Please enter the following informations os I can sell it for a profit! " );
    System.out.println();
    System.out.println( "First name: ");
    firstName = keyboard.next();
    System.out.println();
    System.out.println( "Last name: ");
    lastName = keyboard.next();
    System.out.println();
    System.out.println("Grade (9-12): ");
    grade = keyboard.nextInt();
    System.out.println();
    System.out.println("Student ID: ");
    studentId = keyboard.nextInt();
    System.out.println();
    System.out.println("Login: ");
    login = keyboard.next();
    System.out.println();
    System.out.println( "GPA (0.0-4.0): " );
    GPA = keyboard.nextDouble();
    System.out.println();
    System.out.println( "Your information: " );
    System.out.println( "     Login: "  + login);
    System.out.println( "     ID: " + studentId);
    System.out.println( "     Name: " + firstName +", "+ lastName);
    System.out.println( "     GPA: " + GPA);
    System.out.println( "     Grade: " + grade);
  }
}
