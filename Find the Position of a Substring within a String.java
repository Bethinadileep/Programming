import java.util.*;

public class Main
{
    public static int foundpattern(String text,String pattern){
        int n = text.length();
        int m = pattern.length();
        
        for(int i = 0; i < n; i++){
            int temp = i;
            int j = 0;
            for(j = 0; j < m; j++){
                if(text.charAt(temp) != pattern.charAt(j)){
                    break;
                }
                temp++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		String text = "takeuforward";
		String pattern = "forward";
		
		int foundIdx = foundpattern(text, pattern);
		
		System.out.println(foundIdx);
	}
}

//Approach 2
import java.util.*;

public class Main
{
    public static int foundpattern(String text,String pattern){
        int n = text.length();
        int m = pattern.length();
        
        for(int i = 0; i < n; i++){
            int temp = i;
            int j = 0;
            for(j = 0; j < m; j++){
                if(text.charAt(temp) != pattern.charAt(j)){
                    break;
                }
                temp++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		String text = "takeuforward";
		String pattern = "forward";
		
		int foundIdx = text.indexOf(pattern);
		
		System.out.println(foundIdx);
	}
}

