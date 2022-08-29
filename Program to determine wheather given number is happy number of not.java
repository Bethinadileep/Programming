
public class Main
{
    public static int isHappyNumber(int n)
    {
        int sum = 0;
        int rem = 0;
        while(n > 0)
        {
            rem = n % 10;
            sum = sum + (rem * rem);
            n = n / 10;
        }
        return sum;
    }
	public static void main(String[] args) {
		int n = 37;
		int result = n;
		while(result != 1 && result != 4)
		{
		    result = isHappyNumber(result);
		}
		if(result == 1)
		{
		    System.out.println("Happy Number");
		}
		else if(result == 4)
		{
		    System.out.println("UnHappy Number");
		}
	}
}
