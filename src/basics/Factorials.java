package basics;

public class Factorials {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		for (int i = 1; i < 10 ; i++)
		{
			numbers[i] = i;
			//System.out.println(numbers[i]);
		}
		fac(10,numbers);
		int n =9;
		int f = fac2(n);
		System.out.println("The factorial of " + n + " is: " + f);	
	}
	public static void fac(int n,int[] numbers)
	{
		//1! = 1
		//2! = 2 * 1
		//3! = 3 * 2 * 1 (j)(j-1)(j-2)
		//4! = 4 * 3 * 2 * 1
		int[] fac = new int[numbers.length];
		int multiple = 1;
		for(int i = 1; i < numbers.length; i++)
		{
			if(i == 1)
			{
				fac[i] = numbers[i];
			}
			else
			{
				multiple = multiple * numbers[i];
				fac[i] =  multiple;
				System.out.println("The factorial of " + i + " is: " + fac[i]);	
			}
		}
		
	}
	//////////////////////////////////////
	public static int fac2(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		int f = fac2(n-1) * n;
		return f;
		
		
	}

}
