https://bootcamp.du.edu/blog/programming-skills/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5};
	    int len = arr.length;
	    for(int i = 0; i < len; i++) 
	    {
	        int k = len - 1 - i;
	        for(int j = 0; j < len; j++)
	        {
	            if(i==j || k==j)
	            {
	                System.out.print(arr[j]);
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println("");
	    }
	}
}
