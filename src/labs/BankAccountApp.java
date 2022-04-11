package labs;

public class BankAccountApp {

	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount("343-23-5678", 1000);
/*		BankAccount acc2 = new BankAccount("343-23-8756", 2350);
		BankAccount acc3 = new BankAccount("343-23-7856", 5000);
		BankAccount acc4 = new BankAccount("343-23-6578", 3250);
		BankAccount acc5 = new BankAccount("343-23-8576", 6000);*/
		
		acc1.setName("Khan");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(1500);
		acc1.payBill(300);
		acc1.makeDeposit(2000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
		

	}

}
class BankAccount implements IInterest
{
	// Properties of Bank Account
	//Here we are implementing encaspsulation so we are making it private
	//encapsulating will ensure client cannot access these properties directly 
	//other then our defined public methods
	private static int ID = 1000; // internal ID staying with class not with the object
	private String accountNum; // combination of ID + random two digit numbers + last two initials of SSN
	private static final String routingNum = "00547004";
	private String accountName;
	private String SSN;
	private double balance;
	
	// Constructors
	public BankAccount(String SSN, double initDeposit)
	{// we will use SSN to generate account number
		this.SSN = SSN;
		this.balance = balance + initDeposit;
		ID++;	
		setAccountNum();
		showBalance();
	}
	private void setAccountNum()
	{
		int rand = (int) (Math.random() * 100);
		accountNum = ID + rand + SSN.substring(9, 11);
		System.out.println("CONGRATULATIONS!!! The account is created");
		System.out.println("Your account number is : "+accountNum);	
	}
	public void setName(String name)
	{
		this.accountName = name;
	}
	public String getName()
	{
		return accountName;
	}
	public void payBill(double amount)
	{
		this.balance = balance - amount;
		System.out.println("Paying bill amount: "+ amount);
		showBalance();
	}
	public void makeDeposit(double amount)
	{
		this.balance = balance + amount;
		System.out.println("You have made a deposit amount: " + amount);
		showBalance();
	}
	public void showBalance()
	{
		System.out.println("Your balance is: " + balance);
	}
	@Override
	public void accrue() 
	{
		balance = balance * (1 + rate/100);
		showBalance();		
	}
	@Override
	public String toString()
	{
		return "[Accountholder Name: " + accountName + "\n Account Number: " + accountNum + "\n Rounting Number: " + routingNum + "\n Balance Amount is: " + balance + "]";
		
	}
	
	
}