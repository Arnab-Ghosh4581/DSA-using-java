package STACK;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    static Scanner input=new Scanner(System.in);
    public static boolean perenthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                s.push(str.charAt(i));
            }
            else {
                if(s.empty()){
                    return false;
                }
                if((str.charAt(i)==')' && s.peek()=='(') || (str.charAt(i)=='}' && s.peek()=='{') || (str.charAt(i)==']' && s.peek()=='[')){
                    s.pop();
                }
                else{
                    System.out.println(s);
                    return false;
                }
            }

        }
        System.out.println(s);
        if(s.empty()){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        String str=input.nextLine();
        boolean a=perenthesis(str);
        if(a){
            System.out.println("perenthesis matching perfectly...");
        }
        else{
            System.out.println("perenthisis is not matching...");
        }
    }
}
