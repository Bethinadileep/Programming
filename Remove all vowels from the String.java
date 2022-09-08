import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "a rkw wer";
	    String str1 = "";
	    for(int i = 0; i < str.length(); i++){
	        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' 
	        || str.charAt(i)=='u') {
	            str = str.substring(0,i) + str.substring(i+1);
	            i--;
	        }
	    }
	    System.out.println(str);
	}
}
