/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{	Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		while (test-- > 0) {
			String a = sc.nextLine();
			int count1 = 0;
			int count2 = 0;
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == '1')
					count1++;
				else
					count2++;
			}
			if ((count1 == a.length() - 1 && count2 == 1) || (count2 == a.length() - 1 && count1 == 1))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		sc.close();
	}
}
