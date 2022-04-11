package exceptionsinfiles;

public class NegativePaymentException extends Exception
{
	// define class variable
	double payment;
	// calling class constructor with value that will throw exception
	// assigning local variable to class variable
	public NegativePaymentException(double payment)
	{
		this.payment = payment;
	//	System.out.println( "ERROR: Negative Payment");
	}
	// overriding toString() function to print user defined exception message
	public String toString()
	{
		return "ERROR: Cannot take negative payment amount: " + payment;
		
	}

}
