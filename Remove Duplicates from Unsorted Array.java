import java.util.*;

public class Main
{
    public static void duplicates(int arr[],int n)
    {
        int mark[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            mark[i] = 1;
        }
        for(int i = 0; i < n; i++)
        {
            if(mark[i]==1)
            {
                for(int j = i+1; j < n; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        mark[i] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(mark[i]==1)
            {
                System.out.println(arr[i]);
            }
        }
        
    }
	public static void main(String[] args) {
		int n = 12;
        int arr[] = { 4,4,4, 3,3, 9, 2, 4, 1, 10, 89, 34 };

        duplicates(arr, n);
	}
}
