package STACK;

import java.util.Collections;
import java.util.Stack;

public class InsertAtBottom {
    public static void atBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int x=s.pop();
        atBottom(s, data);
        s.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        Collections.addAll(s,12,45,78,89,1);
        System.out.println(s.toString());
        atBottom(s,0);
        System.out.println(s.toString());
    }
}
