import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] = {13,46,24,52,20,9};
		System.out.println("Before Sorting the Bubble Sort");
		for(int i = 0; i < arr.length; i++)
		{
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
		    for(int j = 0; j < n - i -1; j++)
		    {
		        if(arr[j] > arr[j+1])
		        {
		            int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		System.out.println("After Sorting the Bubble Sort");
		for(int i = 0; i < n; i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
