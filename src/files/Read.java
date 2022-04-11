package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) 
	{
		// define the file and the path
		//"C:/LearningJava/Workspaces/Files/Sample.txt";
		String fileName = "C:\\LearningJava\\Workspaces\\Files\\Sample.txt";
		String text = "";
		File file = new File(fileName);
		
		
		try 
		{
			//open the file
			BufferedReader br = new BufferedReader(new FileReader(file));
			//read the file
			text = br.readLine();
			// close the resource
			br.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("ERROR: File not found : " + file);
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			System.out.println("ERROR: Encounter error during file reading. " + file);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finished reading the file");
			
		}
		System.out.println(text);

	}

}
