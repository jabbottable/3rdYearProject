/**
 * 
 */
package joshJavaCompiler;

/**
 * @author Joshua Abbott
 *
 */
public class JJC
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		if(args.length!= 1)
		{
			System.out.println("error");
		}
		else
		{
			ScanFile scan = new ScanFile(args[0]);
		}

	}

}
