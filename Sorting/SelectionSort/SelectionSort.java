import java.util.Random;

public class SelectionSort
{
	public static void selection_sort( int[] a )
	{
		int minIndex;
		int n = a.length;

		for ( int i = 0; i < n - 1; i++ )
		{
			minIndex = i;
			for ( int j = i + 1; j < n; j++ )
			{
				if ( a[j] < a[minIndex] )
					minIndex = j;
			}
			if ( minIndex != i )
				swap(a, i, minIndex);
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

		selection_sort( arr );

		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}
