package oop;

public class BankAccountApp {

	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount();
		acc1.accountNum="5634";
		//acc1.name = "Khan";
		
		//With Encapsulation : public API methods
		acc1.setName("Khan");
		System.out.println(acc1.getName());
		acc1.setSSN("657845");
		System.out.println(acc1.getSSN());
		
		acc1.setRate();
		acc1.increaseRate();
		acc1.balance = 10000;
		acc1.deposit(1500);
		acc1.withdraw(2000);
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNum="2221";
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNum="9087";
		acc3.checkBalance();
		
/*		//// demo inheritence
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Alice";
		cd1.accountType = "CD Account";
		cd1.accountNum = "03452";
		System.out.println(cd1.toString()); */ 
		
	}

}
