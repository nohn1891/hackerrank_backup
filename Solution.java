import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
	// added documentation
	 public int diagonalDifference(List<List<Integer>> arr) {
		 System.out.println(arr);
        int a = 0 ; 
        int b = 0 ;
        for(int i = 0 ; i<arr.size(); i++){
			a += arr.get(i).get(i);
			b += arr.get(i).get((arr.size()-i)-1);
		}
        System.out.println(a);
		System.out.println(b);
		c = a-b;
		if(c < 0 ){
			return c*-1;
		}
        return c;
        // ^^^ should use absolute
    }
	
	public static void main(String[] args) throws IOException {
        // Why use random ? 
         Random random = new Random();
		 int n = 3;
		
         List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem =  random.nextInt(10);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
		Solution solution = new Solution();
		System.out.println(solution.diagonalDifference(arr));
		
    }
	
	
}
