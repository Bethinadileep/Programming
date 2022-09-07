import java.util.*;
import java.io.*;

public class Main
{
    static int findSum(String str){
        String tempsum = "0";
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char s = str.charAt(i);
            
            if (Character.isDigit(s))
                tempsum += s;
            else {
                sum += Integer.parseInt(tempsum);
                tempsum = "0";
            }
        }
        return sum + Integer.parseInt(tempsum);
    }
	public static void main(String[] args) {
	    String str = "1bc268";
	    System.out.print("Sum: ");
	    System.out.println(findSum(str));
	}
}
