import java.util.*;
public class CopyingArrays
{
	public static void main(String[] args)
  {
		Random r = new Random();
		int x = 1+r.nextInt(100);
		int array[] = new int[10];
		int array1[] = new int[10];
		System.out.print("Array 1: ");
		for(int a=0; a<array.length; a++)
    {
			array[a] = 1+r.nextInt(100);
			System.out.print(array[a]+"  ");
		}
		array1 = array;
		array[array.length - 1] = -7;
		System.out.println();

		System.out.print("Array 2: ");
		for(int b=0; b<array1.length; b++)
    {
			System.out.print(array1[b]+"  ");
		}
	}
}
