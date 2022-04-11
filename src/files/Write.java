package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		//1. define the path for file to write
		String fileName = "C:\\LearningJava\\Workspaces\\Files\\FileToWrite.txt";
		String message = "I am writing the data in a file";
		//2. create the file in java
		File file = new File(fileName);
		//3. open the file
		try 
		{
			FileWriter writer = new FileWriter(file);
			// writing text to a file
			writer.write(message);
			// closing the resource
			writer.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("ERROR: Sorry cannot write to a file. " + file);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Done with writing to a file.");
		}
		System.out.println("Successfull write data to a file");
		
		
		
		

	}

}
