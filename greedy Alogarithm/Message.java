import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void message(int n) {
        if (n == 1) {
            System.out.println("0");
        } else {
            System.out.println((n - 1) * 2);
        }
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
		    int Nos = Integer.parseInt(sc.nextLine());
		    message(Nos);
		}
		
	}
}