/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=1,val=1;
		int []arr=new int[N];
		while(N>0)
		{
		    arr[i-1]=val*10;
		    arr[i]=(val++*10)/5;
		    i+=2;
		    N=N-2;
		}
		for(int k=0;k<arr.length;k++)
		System.out.print(arr[k]+" ");
	}
}
