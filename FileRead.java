package expenses_visualizer;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileRead
{
	FileRead () 
	{
		
	}
	
	public Scanner readIn() throws FileNotFoundException
	{
		System.out.print("Please input the file name: ");
		
		Scanner keyboard = new Scanner(System.in);
		
		String fileName = keyboard.nextLine();
		
		keyboard.close();
		
		File text = new File(fileName);
		
		Scanner file = new Scanner(text);
		
		System.out.println("Reading file: \""+ text + "\"");
		
		return file;
	}
	
	public ArrayList<String> fileIntoArray (Scanner sc)
	{
		ArrayList<String> data = new ArrayList<String>();
		
		String line = sc.nextLine();
		
		while(line != null)
		{
			data.add(line);
			line = sc.nextLine();
		}
		
		return data;
	}
	
	
}
