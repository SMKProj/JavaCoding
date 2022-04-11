package exceptionsinfiles;

public class CommonExceptions 
{
	// using exceptions from JAVA libraries
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 0;
		// identify the potential problem area
		// surround with try and catch
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide integer by zero");
			System.out.println(e.toString());
		}
		System.out.println("The program is closing");
		
		String[] states = {"CA", "NY", "TX", "FL"};
		for(int i = 0; i<= states.length ; i++)
		{
			try
			{
				System.out.println(states[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ERROR: Index outside array domain");
				System.out.println(e.toString());
			}
			finally
			{
				System.out.println("Iterating through array");
			}
		}
		System.out.println("The program is closing");

	}

}
