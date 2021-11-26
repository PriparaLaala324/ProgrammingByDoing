import java.util.Random;

public class BubbleSort
{
	public static void bubble_sort( int[] a )
	{
		boolean keep_sort = true;
		int j = 0;

		while ( keep_sort )
		{
			keep_sort = false;
			j++;
			for ( int i = 0; i < a.length - j; i++ )
			{
				if ( a[i] > a[i + 1] )
				{
					swap( a, i, i + 1 );
					keep_sort = true;
				}
			}
		}
	}


	public static void swap( int[] a , int i, int j )
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		bubble_sort( arr );

		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}
