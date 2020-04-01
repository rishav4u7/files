package interview;
import java.util.*;
import java.io.*;
public class duplicate {

	public static void main(String[] args) {
		Integer [] a={1,2,3,4,2,4,5};
	     //List<Integer> list=new ArrayList<>(Arrays.asList(a));
	     Set<Integer> set=new HashSet<>(Arrays.asList(a));
	        //List<Integer> list=new ArrayList<>(Arrays.asList(set));
	        for(Integer i : set)
	        {
	            int k=0;
	            for(Integer j : a)
	            {
	                if(i==j)
	                    k++;
	            }
	            if(k>1)
	            System.out.println(i+" "+k);
	        }
	}

}
