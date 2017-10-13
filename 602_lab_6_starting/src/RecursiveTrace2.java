
public class RecursiveTrace2
{

	// Binary Conversion
	public static String mystery2(int n)
	{
		if (n == 0)
		{
			return "";
		}
		else
		{
			String result = mystery2(n / 2) + (n % 2);

			return result;
		}

	}

	public static String mystery3(int n)
	{

		String result = "";

		while (n > 0)
		{
			result = n % 2 + result;
			n = n / 2;
		}

		return result;
	}

	public static void main(String[] args)
	{
		StdOut.println(mystery2(5));

	}

}
