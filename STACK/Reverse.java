package STACK;
import java.util.Stack;
public class Reverse {
    public static String rev(String str){
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<=str.length()-1){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.empty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       String s=rev("pokki");
       System.out.println(s);
    }
}
