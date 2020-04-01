package file1;
import java.io.*;
public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("Snapchat\\pappu.txt");
           if(file.delete())
           {
        	   System.out.print("Deleletion is successful");
           }
        	   else
        	   {
        		   System.out.print("Deletion is not successful");
        	   }
           }
	}


