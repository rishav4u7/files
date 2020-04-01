package interview;
import java.io.*; 
import java.math.*; 
public class amazing_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2,12,20,18,1,12,7,8 }; 
        int n = arr.length; 
        System.out.println(maxTripletSum(arr, n));

	} 
    // Function to calculate maximum triplet sum 
    static int maxTripletSum(int arr[], int n) 
    { 
        // Initialize the answer 
        int ans = 0; 
  
        for (int i = 1; i < n - 1; ++i) { 
            int max1 = 0, max2 = 0; 
  
            // find maximum value(less than arr[i]) 
            // from i+1 to n-1 
            for (int j = 0; j < i; ++j) 
                if (arr[j] < arr[i]) 
                    max1 = Math.max(max1, arr[j]); 
  
            // find maximum value(greater than arr[i]) 
            // from i+1 to n-1 
            for (int j = i + 1; j < n; ++j) 
                if (arr[j] > arr[i]) 
                    max2 = Math.max(max2, arr[j]); 
  
            // store maximum answer 
            ans = Math.max(ans, max1 + arr[i] * max2); 
        } 
  
        return ans; 
    }
}
