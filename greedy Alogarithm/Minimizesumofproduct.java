import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
     static int minValue(int A[], int B[], int n) 
    { 
        Arrays.sort(A); 
        Arrays.sort(B); 
        int result = 0; 
        for (int i = 0; i < n; i++) 
            result += (A[i] * B[n - i - 1]); 
  
        return result; 
    } 
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
		    String[] st = sc.nextLine().split(" ");
		  //  System.out.println(Arrays.toString(st));
		    int num = Integer.parseInt(st[0]);
		    String[] s = sc.nextLine().split(" ");
		  //  System.out.println(Arrays.toString(s));
		    int[] arr2 = new int[num];
		    for (int k = 0; k < num; k++) {
		        arr2[k] = Integer.parseInt(s[k]);
		    }
		  //  System.out.println(Arrays.toString(arr2[k]));
		    int[] arr1 = new int[num];
		    String[] f = sc.nextLine().split(" ");
		  //  System.out.println(Arrays.toString(f));
		    for (int j = 0; j < num; j++) {
		        arr1[j] = Integer.parseInt(f[j]);
		    }
		    int n = arr2.length;
		    System.out.println(minValue(arr2, arr1, n)); 
		}
	}
}