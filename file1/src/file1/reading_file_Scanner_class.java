package file1;

import java.util.Scanner;
import java.io.*;

public class reading_file_Scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try
			{
				Scanner sc=new Scanner(new File("Snapchat\\pappu.txt"));
				String l;
				while(sc.hasNext())
				{
					l=sc.nextLine();
					System.out.println(l);
				}
				sc.close();
			}
			catch(FileNotFoundException e)
			{
				System.out.print("file not found");
			}
	}

}
