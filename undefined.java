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
	    int [][]arr=new int[N][5];
	    int check=1,num=1;
	    for(int i=0;i<N;i++)
	    {
	        check++;
	        if(check%2==0){
	        for(int j=1;j<=5;j++)
	        arr[i][j-1]=num++;}
	        else{
	        for(int k=5;k>=1;k--)
	        arr[i][k-1]=num++;
	            
	        
	    }
	        
	    }
	    for(int x=0;x<N;x++)
	    {
	    for(int y=0;y<5;y++)
	        System.out.print(arr[x][y]+" ");
	     System.out.println();   
	    }
	    
	    
	}
}
