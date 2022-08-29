import java.util.*;

public class Main
{
    public static int count_one(int bin)
    {
        int r;
        int count=0;
        while(bin > 0)
        {
            r = bin % 10;
            if(r == 1)
            {
                count++;
            }
            bin = bin / 10;
        }
        return count;
    }
    public static int checkEvilNumber(int n)
    {
        int r,bin=0;
        while(n>0)
        {
          r = n % 2;
          bin = bin + r * (int)(Math.pow(10,0));
          n = n / 2;
        }
        int count_1 = count_one(bin);
        if(count_1%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
	public static void main(String[] args) {
	    int i, check, num;
	    num = 20;
	    check = checkEvilNumber(num);
	    if(check==1){
	        System.out.println("Evil Number");
	    }
	    else
	    {
	        System.out.println("Idious Number");
	    }
	}
}
