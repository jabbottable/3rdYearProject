/**
 * 
 */
package joshJavaCompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Joshua Abbott
 * 
 */
public class ScanFile
{

	private File inputFile;
	private File outputFile;

	/**
	 * @param inputFile
	 * @param outputFile
	 */
	public ScanFile(String inputFile)
	{
		this.inputFile = new File(inputFile);
		this.outputFile = new File(inputFile.replaceAll(".java", ".ScanOut"));
		Scan();
	}

	private void Scan()
	{
		try
		{
			Scanner scanner = new Scanner(inputFile);
			PrintWriter writer = new PrintWriter(outputFile);
			
			while(scanner.hasNext())
			{
				String str = scanner.next();
				writer.write(str+ "\n");
			}
			scanner.close();
			writer.close();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
