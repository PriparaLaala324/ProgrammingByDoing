public class GivingAnArrayABunchOfValuesAtOnce
{
	public static void main( String[] args )
	{
		String[] array1 = { "alpha", "bravo", "charlie", "delta", "echo"};
		int[] array2 ={11, 23, 37, 41, 53};
		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<array1.length; i++ )
		{
			System.out.print( array1[i] + " " );
		}
		System.out.println();
		System.out.println("The second array is filled with the following values:\t");
		System.out.print("\t");
		for ( int j=0; j<array2.length; j++ )
		{
			System.out.print(array2[j] + "\t ");
		}
	}
}
