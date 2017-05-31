public class ArrayMinMaxPrinter 
{
	/* Done By: Talib Bacchus
	 * Displays the minimum and maximum values of an array.
	 */
	
	public static void printminandmax(int array[])
	
	{
		/* Declaring and initializing the minimum and maximum values as the 
		 * first element located in the array.
		 */
		int min= array[0];
		int max=array[0];
		// Using a for loop to iterate through the entire array.
		for(int i =0; i<array.length; i++)
		{
			
			/* If an element in the array is of lesser value than the minimum value
			 * then that element is initialized as the minimum.
			 */
			if(array[i]<min)
			{
				min=array[i];
				}
			/* If an element in the array is of greater value than the maximum value
			 * then that element is initialized as the maximum.
			 */
			if(array[i]>max)
			{
				max=array[i];
			}
			
		}
		//Displaying the minimum and maximum value.
		System.out.println("The minimum is: " + min);
		System.out.println("The maximum is: " + max);
		
	}
	
	// Testing the program.
	public static void main(String[] args) {
		int a[] ={189, 15, 90, 622, 29};
		printminandmax(a);
		
	}

}
