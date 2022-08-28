import java.util.*;

public class Main
{
    static boolean isPrime(int n)
    {
        if(n==1)
        return false;
        for(int i = 2; i < n; i++)
        {
            if(n%i == 0)
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
	  int f = 2, l = 10;
	  for(int i = f; i < l; i++)
	  {
	      if(isPrime(i))
          {
              System.out.println(i + " ");
          }
	  }
	}
}
