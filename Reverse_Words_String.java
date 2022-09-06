import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "Karunya is Going to in Top Position";
	    Stack<String> stk = new Stack<String>();
	    str+=" ";
	    int len = str.length();
	    String str1 = "";
	    for(int i = 0; i < len; i++) {
	        if(str.charAt(i) == ' ') {
	            stk.push(str1);
	            str1 = "";
	        }
	        else{
	            str1+=str.charAt(i);
	        }
	        
	    }
	    String ans ="";
	    while(stk.size() != 1){
	        ans += stk.peek() + " ";
	        stk.pop();
	    }
	    ans += stk.peek();
	    
	    System.out.println(ans);
	 }
}
