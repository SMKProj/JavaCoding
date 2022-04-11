package oop;

class Person 
{
	String name;
	String email;
	String phone;
	
	void walk()
	{
		System.out.println("The " + name + " is walking. ");
	}
	void eat()
	{
		System.out.println("The " + name + " is eating. ");
		
	}
	void sleep()
	{
		System.out.println("The " + name + " is sleeping. ");
	}
	
	
}

public class Demo {

	public static void main(String[] args) 
	{
		// Instantiating an object
		Person person1 = new Person();
		
		// defining some properties
		person1.name = "Khan";
		person1.email = "khan@gmail.com";
		person1.phone = "2242264";
		
		//Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Tia";
		person2.eat();
		//person1.sleep();
		
	/*	String name = "Khan";
		String email = "khan@gmail.com";
		String phone = "12345";	
		walking(name);
		*/
		// what about binding attributes & properties together
		
	}
/*	static void walking(String s)
	{
		System.out.println("The " + s + " is walking. ");
		
	} */

}
