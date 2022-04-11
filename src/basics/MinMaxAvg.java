package basics;

public class MinMaxAvg {

	public static void main(String[] args) 
	{
		int[] numbers = {20,14,10,25,4};
		calMin(numbers);
		calAvg(numbers);
		calMax(numbers);
	}
	
	/////////////////////////////////////////////
	public static void calMin(int[] numbers)
	{
		int minVal = 0;
		for(int i =0; i< numbers.length-1 ; i=i+1)
		{
			if(numbers[i]> numbers[i+1])
			{
				minVal = numbers[i+1];
			}
			else
			{
				minVal = numbers[i];
			}
		}
		System.out.println("The minimum value is: " + minVal);	
	}
	/////////////////////////////////////
	public static void calAvg(int[] numbers)
	{
		int avg = 0;
		int sum = 0;
		for(int i =0; i< numbers.length ; i=i+1)
		{
			sum = sum + numbers[i];
		}
		avg = sum / numbers.length;
		System.out.println("The average of given values is: " + avg);	
	}
	
	public static void calMax(int[] numbers)
	{
		int maxVal = 0;
		for(int i =0; i< numbers.length-1 ; i=i+1)
		{
			if(numbers[i]> numbers[i+1])
			{
				maxVal = numbers[i];
			}
			else
			{
				maxVal = numbers[i+1];
			}
		}
		System.out.println("The minimum value is: " + maxVal);	
	}

}
