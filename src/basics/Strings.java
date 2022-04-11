package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle = "Lord of the Rings";
		String wordChoice = "Ring";
		if(bookTitle.contains(wordChoice))
		{
			System.out.println("The book conatains string " + wordChoice );
		}
		
		String bookName = "lord OF THE rings";
		if(bookTitle.equalsIgnoreCase(bookName))
		{
			System.out.println("The book name is " + bookName );
		}
		
		String firstName = "Sundas";
		String lastName = "Khan";
		String SSN = "456321789";
		String fullName = firstName.concat(lastName);
		System.out.println(fullName);
		
		String initials = firstName.substring(0, 1);
		String initials2 = lastName.substring(0, 1);
		String initials3 = SSN.substring(4, 8);
		
		String nameInitials = initials.concat(initials2);
		String code = nameInitials.concat(initials3);
		
		System.out.println(code);
		System.out.println("The length of my code is " + code.length());
		
		
		

	}

}
