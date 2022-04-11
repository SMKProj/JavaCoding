package basics;

public class NumbersCal {
	public static void main(String[] args)
	{
		// Lets print names, add & multiply numbers
		printName();
		
		int numA = 10;
		int numB = 20;
		addNum(numA, numB);
		int p = multiplyNum(numA,numB);
		System.out.println("The product of "+ numA + " and " + numB + " is : " + p);
		
	}
	static void printName() 
	{
		System.out.println("My name is KHAN!");
		
	}
	static void addNum(int a,int b)
	{
		int sum = a+ b;
		System.out.println("The sum of " + a + " and " + b+ " is: " + sum);
	}
	static int multiplyNum(int a,int b)
	{
		int product = a * b;
		addNum(product,product);
		return product;
	}

}
