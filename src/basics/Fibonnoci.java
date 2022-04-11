package basics;


public class Fibonnoci 
{

	public static void main(String[] args) 
	{
		// Fibonnaci number is the sum of two previous numbers
		int[] numbers = new int[10];
		
		for (int i = 1; i < 10 ; i++)
		{
			numbers[i] = i;
	//		System.out.println(numbers[i]);
		}
		
		fib(10,numbers);	

	}
	public static void fib(int n, int[] numbers)
	{
		int[] fib = new int[numbers.length];
		for(int j = 0; j < numbers.length ; j++)
		{
			fib[j] = numbers[j];
			if (j >= 2)
			{
				fib[j] = fib[j-1] + fib[j-2];
			}	
			System.out.println("The fibonnaci sequence is: " + fib[j]);
		}
			
	}
	
	
}
