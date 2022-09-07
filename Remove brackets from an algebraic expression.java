import java.util.*;
import java.io.*;

public class Main
{
    static String solve(String str1){
        StringBuilder ans = new StringBuilder();
        int n = str1.length();
        for(int i = 0; i < n; i++) {
            if(str1.charAt(i) != '(' && str1.charAt(i) != ')') {
                ans.append(str1.charAt(i));
            }
        }
        return ans.toString();
    }
	public static void main(String[] args) {
	    String input1 = "a+((b-c)+d)";
        String input2 = "(((a-b))+c)";
        
        System.out.println("Original String: " + input1);
        System.out.println("After Removing Brackets: " + solve(input1));
        System.out.println("Original String: " + input2);
        System.out.println("After Removing Brackets: " + solve(input2));
	}
}
