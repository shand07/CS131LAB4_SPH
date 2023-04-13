import java.util.Scanner;

import java.io.File;

import java.io.FileNotFoundException;


public class Application 
{	
	
	public static void main(String[] args) throws StringTooLongException
	{
		
		StringTooLongException problem = new StringTooLongException("String is Too Long!");
		
		System.out.println(problem);
		
		try 
		{
			File myFile = new File("FileToBeScanned.txt");
			
			Scanner scan = new Scanner(myFile);
			
			while(scan.hasNextLine())
			{
				String data = scan.nextLine();
				System.out.println(scan);
			}
			
		}
			
		catch (FileNotFoundException e)
			
		{
			
			System.out.println(e);
				
			
		}
		
			
		
	}
	
}
