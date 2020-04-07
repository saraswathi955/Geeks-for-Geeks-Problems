import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
		    int num = Integer.parseInt(sc.nextLine());
		    int rem = 0;
		    int sum = 0;
		    while(num != 0) {
		        rem = num % 10;
		      //  if (rem == 1) {
		      //      break;
		      //  }
		        if (rem == 2 || rem == 3 || rem == 5 || rem == 7) {
		            sum = sum + rem;
		        }
		        num = num /10;
		    }
		    System.out.println(sum);
		}
	}
}
