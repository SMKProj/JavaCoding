package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberApp {

	public static void main(String[] args) 
	{
		// this will read a text file & retrieve phone number
		String filename = "C:\\LearningJava\\Workspaces\\Files\\Phone.txt";
		File f = new File(filename);
		FileReader fr;
		// list that holds strings of a file
		List <String> phoneNums = new ArrayList<String>();
			try 
			{
				fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				do
				{
					phoneNums.add(line);
					line = br.readLine();
				}
				while(line != null); // checking if end of file has reached
				br.close();
			}			
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				System.out.println("ERROR: File not found.");
				//e.printStackTrace();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				System.out.println("ERROR: Unable to read the file");
				//e.printStackTrace();
			}
			//System.out.println(phoneNums);
		// Converting list to an array
		String[] nums = phoneNums.toArray(new String [0]);
		for(int j = 0; j< nums.length-1; j++)
		{
			String phoneNum = nums[j];
			try 
			{
				// valid phone number is 10 digit
				if(phoneNum.length() != 10)
				{
					//there can be 911 in the phone
					if(phoneNum.contains("911"))
					{
						throw new EmergencyException(phoneNum);
					}
					else
					{
						throw new TenDigitsException(phoneNum);
					}
				}
				// Area code cannot start with 0 and 9 
				if(phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9"))
				{
					if(phoneNum.contains("911"))
					{
						throw new EmergencyException(phoneNum);
					}
					else
					{
						throw new AreaCodeException(phoneNum);
					}
				}
				
				
				System.out.println("The correct phone number you have entered is: " + phoneNum);
			}
			catch(TenDigitsException e)
			{
				System.out.println("ERROR: Please enter correct phone number !");
				System.out.println(e.toString());
			}
			catch(AreaCodeException e)
			{
				System.out.println("ERROR: Phone number has invalid area code !");
				System.out.println(e.toString());
				
			}
			catch(EmergencyException e)
			{
				System.out.println("ERROR: Emergency Code 911 is found !");
				System.out.println(e.toString());
				
			}
		}

		
		
					
		

	}

}

class TenDigitsException extends Exception
{
	String num;
	TenDigitsException(String num)
	{
		this.num = num;
	}
	public String toString()
	{
		return ("TenDigitsException: " + num);
	}
	
}

class AreaCodeException extends Exception
{
	String num;
	AreaCodeException(String num)
	{
		this.num = num;
	}
	public String toString()
	{
		return ("AreaCodeException: " + num);
	}
}

class EmergencyException extends Exception
{

	String num;
	EmergencyException(String num)
	{
		this.num = num;
	}
	public String toString()
	{
		return ("EmergencyException: " + num);
	}
}