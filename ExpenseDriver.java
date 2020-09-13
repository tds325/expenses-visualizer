package expenses_visualizer;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseDriver 
{
	public static void main(String [] args) throws FileNotFoundException 
	{
		FileRead fr = new FileRead();
		Scanner file = fr.readIn();
		ArrayList<String> fileArray = fr.fileIntoArray(file);
		
		System.out.println(fileArray);
	}
}
