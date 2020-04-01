package interview;
import java.util.*;
public class str {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         String str=s.nextLine();
         /*String[] s1=str.split(" ");
         for(int i=0;i<s1.length;i++)
         {
        	 System.out.println(s1[i]);
         }*/
         for(int i=0;i<str.length();i++)
         {
          if(str.charAt(i)==' ')
          {
        	  System.out.println();
        	  continue;
          }
          System.out.print(str.charAt(i));
	     }

}
}
