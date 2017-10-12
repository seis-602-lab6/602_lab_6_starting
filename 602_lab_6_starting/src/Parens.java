
public class Parens
{

	public static boolean isNested(String str)
	{
		// check if str is correctly-nested parentheses: ((((()))))

		// base case: empty string is nested

		// check first, last characters and return if NOT nested

		if (str.charAt(0) != '(')
			return false;

		// check if last char is ')'

		// do recursive call to check within (..):
		//	extract substring that's all but first, last

		return false;
	}

	public static boolean isBalanced(String str)
	{
		// not required, but you can try this:
		// same as above, but check for balanced parens:
		//	((()())())() is an example
		
		return false;
	}
	
	public static void main(String[] args)
	{
		StdOut.print("Enter a String to test for properly-nested parentheses: ");
		String pString = StdIn.readLine();

		StdOut.printf("\"%s\" is %snested.\n", pString, isNested(pString) ? "" : "NOT ");
	}

}
