import java.util.*;

public class Main
{
    public static boolean isSubset(int arr1[],int arr2[],int n,int m)
    {
        if(n > m) return false;
        for(int i = 0; i < n; i++){
            boolean present = false;
            for(int j = 0; j < m; j++){
                if(arr1[i] == arr2[j]){
                    present = true;
                }
            }
            if(present == false) return false;
        }
        return true;
        
    }
	public static void main(String[] args) {
		int arr1[] = {1,3,4,5,2};
		int arr2[] = {2,4,3,1,7,5,15};
		
		int len = arr1.length;
		int len1 = arr2.length;
		
		boolean result = isSubset(arr1,arr2,len,len1);
		if(result == true)
		{
		    System.out.println("arr1[] is a subset of arr2[]");
		}
		else
		{
		    System.out.println("arr1[] is not subset of arr2[]");
		}
	}
}
