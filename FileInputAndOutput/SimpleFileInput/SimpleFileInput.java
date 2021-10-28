import java.util.*;
import java.io.*;

public class SimpleFileInput
{
	public static void main( String[] args ) throws Exception
	{

		Scanner fileIn = new Scanner(new File("name.txt"));
		String f_name =fileIn.next();
		String l_name =fileIn.next();


		System.out.println("Using my psychic powers aided by reading data from the file");
		System.out.println("I have determined that your name is " +f_name+" "+l_name+".");
		System.out.println("YEAH~~~ I know how to use this~~~");
	}
}
