import java.io.File;

public class CountFilesRec
{
	// The following is from Ch 12's DirectorySize:
	// you can adapt it to return a count of all files and directories
	// within file

	public static long getSize(File file)
	{
		long size = 0; // Store the total size of all files

		if (file.isDirectory())
		{
			File[] files = file.listFiles(); // All files and subdirectories
			for (int i = 0; i < files.length; i++)
			{
				size += getSize(files[i]); // Recursive call
			}
		}
		else
		{ // Base case
			size += file.length();
		}

		return size;
	}

	public static int countFiles(File dir)
	{
		int count = 0;
		
		if (dir.isDirectory())
		{
			File[] files = dir.listFiles(); // All files and subdirectories
			for (int i = 0; i < files.length; i++)
			{
				count += countFiles(files[i]); // Recursive call
				StdOut.println(files[i]);
			}
		}
		else
		{ // Base case
			count = 1;
			StdOut.println(dir);
		}

		return count;

		// iterate over each file in directory dir
		// add 1 to running count for ordinary file,
		// add 1+countFiles(sub) for directory file

	}

	public static void main(String[] args)
	{
		StdOut.print("Enter a filename (complete path): ");
		String startDir = StdIn.readLine();

		File base = new File(startDir);

		if (!base.exists())
		{
			StdOut.println("No such directory.  Exiting...");
			System.exit(1);
		}
		else if (!base.isDirectory())
		{
			StdOut.println("Not a directory.  Exiting...");
			System.exit(1);
		}
		else
			StdOut.printf("Number of files/directories is %d.\n", countFiles(base));

	}

}
