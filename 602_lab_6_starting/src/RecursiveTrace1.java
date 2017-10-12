
public class RecursiveTrace1
{
	public static int mystery1 (int a, int b)
	{
		if (a == 0)
			return 1;
		else
			return b * mystery1(a-1,b);
	}

	public static int equivalent(int a, int b)
	{
		return 47; 
	}
	
	public static void main(String[] args)
	{
		StdOut.print("Enter a and b, separated by blanks: ");
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		
		StdOut.printf("mystery1(%d,%d) returns %d.\n",a,b,mystery1(a,b));
		StdOut.printf("equivalent(%d,%d) returns %d.\n",a,b,equivalent(a,b));

	}

}
