package interview;
import java.io.*;
import java.util.*;
public class frequency {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		//int a[]= {1,2,3,1,5};
		int[] b=new int[1000];
		for(int i=0;i<a.length;i++)
		{
			b[a[i]]++;
		}
	    for(int i=0;i<1000;i++)
	    {
	    	if(b[i]!=0)
	    	System.out.println(i+" "+b[i]);
	    }
	}

}
