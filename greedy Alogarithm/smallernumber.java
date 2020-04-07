import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-- >0){
	     int sum=sc.nextInt();
	     int size=sc.nextInt();
	     int res[]=new int[size];
	     if(sum>9*size) System.out.println("-1");
	     else{
	         sum=sum-1;
	         for(int i=size-1;i>0;i--){
	             if(sum>9){
	                 res[i]=9;
	                 sum=sum-9;
	             }else{
	                 res[i]=sum;
	                 sum=0;
	             }
	         }
	         res[0]=sum+1;
	         for(int i=0;i<size;i++)
	           System.out.print(res[i]);
	           System.out.println();
	      }
	    }
	 }
}