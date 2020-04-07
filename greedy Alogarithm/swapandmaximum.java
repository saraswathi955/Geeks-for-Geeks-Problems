import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void maxsum(int ar[], int n) {
        Arrays.sort(ar);
        int sum = 0;
        for (int i = 0; i < n/2; i++) { 
            sum -= (2 * ar[i]); 
            sum += (2 * ar[n - i - 1]); 
        } 
       
        System.out.println(sum); 
    
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
		    int arrlen = Integer.parseInt(sc.nextLine());
		    int[] arr = new int[arrlen];
		    String[] st = sc.nextLine().split(" ");
		    for (int j = 0; j < arrlen; j++) {
		        arr[j] = Integer.parseInt(st[j]);
		    }
		    maxsum(arr, arrlen);
		}
	}
}

// alternate method


// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class GFG {
// 	public static void main (String[] args) {
// 	    Scanner sc=new Scanner(System.in);
// 	    int t=sc.nextInt();
// 	    while(t-->0)
// 	    {
// 	        int n=sc.nextInt();
// 	        int ar[]=new int[n];
// 	        for(int i=0;i<n;i++)
// 	            ar[i]=sc.nextInt();
// 	        Arrays.sort(ar);
// 	        int i=0,j=n-1,s=0;
// 	        while(i<j)
// 	        {
// 	            s=s+ar[j]-ar[i];
// 	            i++;
// 	            if(i<j)
// 	                s=s+ar[j]-ar[i];
// 	            j--;
// 	        }
// 	        s=s+ar[i]-ar[0];
// 	        System.out.println(s);
// 	    }
// 	}
// }