package Project;

public class StudentApp {

	public static void main(String[] args) 
	{
		Student st1 = new Student("Alice", "343-23-5678");
		st1.enroll("Software Engineering", 4500);
		st1.pay(200);
		st1.setPhone("5353463");
		st1.setCity("Borlange");
		st1.setState("Sweden");
		
		System.out.println("The new student belongs to : " + st1.getCity());
		System.out.println("Student phone # is: " + st1.getPhone());
		System.out.println("The student belongs to: "+st1.getState());
		System.out.println("--------------------------------------------------"); 
		Student st2 = new Student("Rio", "231-11-2019");
		st2.enroll("Computer Arts", 5000);
		st2.pay(300);
		st2.setPhone("05353466");
		st2.setCity("Stockholm");
		st2.setState("Sweden");
		System.out.println("Student phone # is: " + st2.getPhone());
		System.out.println("The new student belongs to : " + st2.getCity());
		System.out.println("The student belongs to: "+st2.getState()); 
		

	}

}
class Student
{
	private static int student_ID = 101;
	private String userID; 
	private String name;
	private String email;
	private String SSN;
	private String course;
	private double balance;
	private String phone;
	private String city;
	private String state;
	
	public Student(String name, String SSN)
	{
		this.SSN = SSN;
		this.name = name;
		student_ID++;
	//	System.out.println(student_ID);
		email();
		setUserID();
		
	}
	public void email()
	{
		this.email = name + "@test.com";
		System.out.println("Your new student email id is: " + email);
	}
	private void setUserID()
	{
		int min = 1000;
		int max = 9000;
		int rand = 0;
		for ( int i = min; i < max ; i++)
		{
			rand = (int) (Math.random() * i);
		}
		userID = student_ID +"-"+ rand + "-"+SSN.substring(9, 11);
		System.out.println("Your student user id is : "+userID);
		
	}
	public void enroll(String course, double registerationFee)  // registering for course and paying registeration fee
	{
		this.course = course;
		this.balance = registerationFee;
		System.out.println("You have paid " + registerationFee + " as Registeration.");
		showCourse();
	}
	public void pay(double tuitionFee) // pay for tuition
	{
		this.balance = balance - tuitionFee;
		System.out.println("Tution fee for " + course + " is : " + tuitionFee);
		checkBalance();
		
	}
	public void checkBalance()
	{
		System.out.println("Your balance is: " + balance);		
	}
	public void showCourse()
	{
		System.out.println("You have successfully enrolled for the course " + course);
		
	}
	// getters and setters
	public void setPhone(String phone)
	{		
		this.phone = phone;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setCity(String city)
	{		
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{		
		this.state = state;
	}
	public String getState()
	{
		return state;
	}
	
//	@Override
	public String toString()
	{
		return "[Student Name: " + name + "\n Student USER ID: " + userID + "\n Email address: " + email + "\n Balance Amount is: " + balance + "]";
		
	}
}

