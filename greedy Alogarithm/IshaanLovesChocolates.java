import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
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
		    int min = arr[0];
		    for (int k = 0; k < arrlen; k++) {
		        if (arr[k] < min) {
		            min = arr[k];
		        }
		    }
		    System.out.println(min);
		}
	}
}


