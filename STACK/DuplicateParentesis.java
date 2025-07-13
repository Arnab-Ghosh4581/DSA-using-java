package STACK;

import java.util.Stack;

public class DuplicateParentesis {
    public static boolean duplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            if(!s.empty() && ch==')'){
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str="((a+b))";
        if(duplicate(str)){
            System.out.println("Duplicate parenthesis exist..");
        }
        else{
            System.out.println("duplicate parenthesis not exist...");
        }
    }
}
