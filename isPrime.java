import java.util.*;

public class Main
{
    public static boolean isPalindrome(int n)
    {
        int c = n;
        int sum = 0;
        while(n!=0)
        {
            int r = n%10;
            sum = sum*10 + r;
            n = n/10;
        }
        if(c == sum)
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
	  int f = 11, l = 50;
	  for(int i = f; i <= l; i++)
	  {
	      if(isPalindrome(i))
	      {
	          System.out.print(i + " ");
	      }
	  }
	    
	}
}
