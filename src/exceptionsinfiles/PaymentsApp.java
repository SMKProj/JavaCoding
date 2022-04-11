package exceptionsinfiles;

import java.util.Scanner;

public class PaymentsApp {
	// Take payment from user
	public static void main(String[] args) 
	{
		double payment = 0;
		boolean positivePayment = true;
		
		do 
		{
			// ask user for input
			System.out.print("Enter the payment amount: ");
			//get the amount and test the value
			Scanner in = new Scanner(System.in);
			// test the value //handle exceptions
			try
			{
				payment = in.nextDouble();
				if(payment < 0)
				{
					throw new NegativePaymentException(payment);
				}
				else
				{
					positivePayment = true;
				}
			}
			catch(NegativePaymentException e)
			{
				System.out.println(e.toString());
				System.out.println("Please enter positive payment amount");
				positivePayment = false;
			}
			finally
			{
				if(in != null)
				{
					in.close();
				}
			}
		} while(!positivePayment);
		
		//print payment confirmation
		System.out.println("Thank you for your payment : $ " + payment);
	}

}
