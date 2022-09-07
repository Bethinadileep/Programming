import java.util.*;
//Approach 1
public class Main
{
	public static void main(String[] args) {
	    String str =  "take12% *&u ^$#forward";
	    int n = str.length();
	    for(int i = 0; i < n; i++)
	    {
	        if(str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c' ||
	        str.charAt(i) == 'd' || str.charAt(i) == 'e' ||str.charAt(i) == 'f'
	        ||str.charAt(i) == 'g' ||str.charAt(i) == 'h' ||str.charAt(i) == 'i' 
	        ||str.charAt(i) == 'j' ||str.charAt(i) == 'k' ||str.charAt(i) == 'l' ||
	        str.charAt(i) == 'm' ||str.charAt(i) == 'n' ||str.charAt(i) == 'o' ||
	        str.charAt(i) == 'p' ||str.charAt(i) == 'q' ||str.charAt(i) == 'r' ||
	        str.charAt(i) == 's' 
	        ||str.charAt(i) == 't' || str.charAt(i) == 'u' || str.charAt(i) == 'v' || 
	        str.charAt(i) == 'w' || str.charAt(i) == 'x' || str.charAt(i) == 'y' ||
	        str.charAt(i) == 'z'){
	            System.out.print(str.charAt(i));
	        }
	    }
	}
}

//Approach 2
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str =  "take12% *&u ^$#forward";
	    StringBuffer ans = new StringBuffer();
	    int n1 = str.length();
	    for(int i = 0; i < n1; i++)
	    {
	       int n = (int) str.charAt(i);
	       if((n>=65 && n <= 90) || (n>=97 && n >= 122)){
	           ans.append(str.charAt(i));
	       }
	    }
	    String res = ans.toString();
	    System.out.println(res);
	}
}
