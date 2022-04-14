package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PasswordCheckingApp {

	public static void main(String[] args) 
	{
		// read a file that contains multiple passwords
		//CRITERIA
		//check if password contain a number, a letter and a special character
		//throw user defined exceptions
		//throw exceptions if criteria does not meet
		
		File f = new File ("C:\\LearningJava\\Workspaces\\Files\\Passwords.txt");
		List <String> passwordsList = new ArrayList<String>();
		
		try 
		{
			BufferedReader reader = new BufferedReader (new FileReader(f));
			String password = reader.readLine(); 
			do {
				passwordsList.add(password);
				password =reader.readLine();
			}
			while(password != null);
			reader.close();
					
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(passwordsList);
		System.out.println("----------------------------------------");
		String[] pList = passwordsList.toArray(new String[0]);
		
		for(int i = 0; i < pList.length; i++)
		{
			String testPassword = pList[i];
			try 
			{
				if (testPassword.matches(".*[a-zA-Z]+.*") && (testPassword.matches(".*[0-9]+.*")) && (testPassword.matches(".*[!@#]+.*")))
				{
					System.out.println("The password fullfills all the requirements of being a good password. " + testPassword);
					System.out.println("-------------------------------------------------");
				}
				else
				{
					if(!testPassword.matches(".*[a-zA-Z]+.*"))
					{
						throw new LetterNotFoundException(testPassword);
					}
					else if (!testPassword.matches(".*[0-9]+.*"))
					{
						throw new NumbersNotFoundException(testPassword);
					}
					else if (!testPassword.matches(".*[!@#]+.*"))
					{
						throw new SpecialCharacterNotFoundException(testPassword);
					}
				}
			}
			catch(NumbersNotFoundException e)
			{
				System.out.println("ERROR: Your password must contain number !");
				System.out.println(e.toString());
			}
			catch(LetterNotFoundException e)
			{
				System.out.println("ERROR: Your password must contain a letter !");
				System.out.println(e.toString());
			}
			catch(SpecialCharacterNotFoundException e)
			{
				System.out.println("ERROR: Your password must contain special character !");
				System.out.println(e.toString());
			}

		}
	}		
}

class NumbersNotFoundException extends Exception
{
	String password;
	NumbersNotFoundException(String p)
	{
		this.password = p;
		
	}
	public String toStirng()
	{
		return ("NumberNotFoundException :" + password);
	}
}

class LetterNotFoundException extends Exception
{
	String password;
	LetterNotFoundException(String p)
	{
		this.password = p;
	}
	public String toString()
	{
		return ("LetterNotFoundException :" + password);
	}
}
class SpecialCharacterNotFoundException extends Exception
{
	String password;
	SpecialCharacterNotFoundException(String p)
	{
		this.password = p;
	}
	public String toString()
	{
		return ("SpecialCharacterNotFoundException: " + password);
	}
}