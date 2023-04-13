import java.util.Scanner;

import java.util.ArrayList;

public class FileProcessor 
{

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList;
	private static Scanner input;
	
	public FileProcessor(String fileName, int stringLength) 
	{
		
		this.fileName = fileName;
		
		this.stringLength = stringLength;
		
		if(this.stringLength<5)
		{
			this.stringLength = 5;
		}
			
	}//end empty-argument constructor
	
	public int getArrayListSize() 
	{
		return stringList.size();
	}//end getArrayListSize
	
	public void processFile() 
	{
		
		
	}//end processFile
	

	public String getFileName()
	{
		return fileName;
	}//end getFileName
	
	public int getStringLength()
	{
		return stringLength;
	}//end getStringLength
	
	
	
}//end class





