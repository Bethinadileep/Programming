/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj = new Scanner(System.in);
		int t = obj.nextInt();
		int n,s;
		while(t != 0)
		{
		    n = obj.nextInt();
		    s = obj.nextInt();
		    if(n >= s)
		    {
		        System.out.println(s);
		    }
		    else
		    {
		        System.out.println(2 * n - s);
		    }
		    t--;
		}
	}
}
