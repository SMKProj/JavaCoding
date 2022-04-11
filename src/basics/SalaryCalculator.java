package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// lets create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career is: "+ career);
		
		//Compute our annual salary
		// Declare & define 
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double annualSalary;
		annualSalary = rate * hoursPerWeek * weeksPerYear;
		System.out.println("My carrer as " + career + ", my expected annual salary at the rate of " + rate + " will be: $ "+annualSalary + " per year");
		//rate * hoursPerWeek * weeksPerYear
	}

}
