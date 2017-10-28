
public class RecursiveTrace2
{
	public static String mystery2(int n)
	{
		if (n == 0)
		{
			return "";
		}
		else
		{
			String result = mystery2(n/2) + (n % 2);
			
			return result;
		}
		
		
	}
public static Object mystery2loop(int n)
{ String result = "";
            while (n > 0)
            {
 result =  n%2 + result;
  n = n/2;
            }
            
            return result;
}

	public static void main(String[] args)
	{
		StdOut.println (mystery2(47));
		StdOut.println (mystery2loop(3));

	}

}
