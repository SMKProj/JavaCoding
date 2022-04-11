package oop;

public class LoanAccount implements IRate 
{
	public void setRate()
	{
		System.out.println("Rate");
	}
	public void increaseRate()
	{
		System.out.println("Increaseing Rate");
	}
	public void setTerms(int terms)
	{
		System.out.println("Setting the terms to "+ terms + "years");
	}
	public void setAmortSchedule()
	{
		System.out.println("Amortization schedule ");
	}

}
