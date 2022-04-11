package oop;

public class BankAccount implements IRate
{
	// Defining variables
	// static variable -> for which the value cannot change
	// final force us not to change variable and give error if we try to
	private static final String routingNum="454321"; // this variable belong to class & not to objects
	
	// instance variables
	String accountNum;
	private String name;
	private String SSN;
	String accountType;
	double balance;
	// Constructor definition = they are unique methods
	//1. they are used to define/ setup object properties
	//2. Constructors are IMPLICCITLY automatically call upon instantiation
	//3. Same name as the class itself
	//4. have no return
	
	//Constructor
	BankAccount()
	{
		System.out.println("the account is created");
	}
	//Overloading
	// Calling same method with different arguments
	BankAccount(String accountType)
	{
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit)
	{
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit Amount is $: " + initDeposit);
		String msg = "";
		if(initDeposit < 1000)
		{
			msg = "ERROR: The initial deposit must be greater or equal to $1000.";
			System.out.println(msg);
		}
		else
		{
			msg ="Thank you for your first deposit amount:" + initDeposit;
		}
		balance = balance + initDeposit;
		System.out.println(msg);
	}
	// Define methods
	//public available anywhere in the project
	public void deposit(double amount)
	{
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	// default
	void withdraw( double amount)
	{
		balance = balance - amount;
		showActivity("WITHDRAW");
		
	}
	//private available only with in a class
	private void showActivity(String activity)
	{
		System.out.println("Show recent transaction : " + activity);
		System.out.println("Your new balance is: $ " + balance);
	}
	void checkBalance()
	{
		System.out.println("Balance is " + balance);
	}
	void getStatus()
	{
		
	}
	//Override
	public String toString()
	{
		return "[ NAME: " + name + ", ACCOUNT # " + accountNum + "ROUTING # " + routingNum + "Balance = $ " + balance + "]";
	}
	//getters & setters
	// we want to hide our variables inside the client class and access them publicly via methods
	public void setName(String name)
	{
		this.name = "Ms."+name; // name variable is assigned to a class variable
	}
	public String getName()
	{
		return name;
	}

	public void setSSN(String ssn)
	{
		this.SSN = "01-"+ ssn + "-11";
	}
	public String getSSN()
	{
		return SSN;
	}
	
	//Interface Methods
	public void setRate()
	{
		System.out.println("SettingRate");
	}
	public void increaseRate()
	{
		System.out.println("IncreasingRate");
	}
}
