package file1;

import java.io.*;


public class file1 {

	public static void main(String[] args) throws IOException {
	File Dir=new File("Snapchat");
	Dir.mkdir();
	File file=new File("Snapchat\\pappu.txt");
	try
	{
		file.createNewFile();
		System.out.println("File Created");
	}
	catch(IOException e)
	{
		System.out.print("error while creating file");
	}
	try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,false)))
	{
		bw.write("gola");
		bw.newLine();
		bw.write("garh");
		bw.newLine();
		bw.write("khole");
		bw.newLine();
		bw.write("gola");
		System.out.println("writing completed");
		bw.close();
	}
	catch(IOException e) {
		System.out.println("error occured,while writing onto file");
	}
	try {
		BufferedReader br=new BufferedReader(new FileReader(file));
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		br.close();
	}
	catch(FileNotFoundException e)
	{
		System.out.print("File not found");
	}
	catch(IOException e)
	{
		System.out.print("Error While reading");
	}
	
	}
}
