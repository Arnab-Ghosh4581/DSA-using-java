package STACK;

import java.util.ArrayList;
import java.util.List;

public class Stack {
       static List<Integer> s=new ArrayList<>();
       static int size=0;
       //check empty
       public static boolean isEmpty(){
        return size==0;
       }
        //push
        public void push(int data){
           s.add(data); 
           size++;
        }
        //pop
        public  int pop(){
            if(s.isEmpty()){
                System.out.println("Stack is empty..");
                return -1;
            }
            int top=s.get(s.size()-1);
            s.remove(s.get(s.size()-1));
            size--;
            return top;
        }
        //peak
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty..");
                return -1;
            }
            return s.get(size);
        }
        //print
        public void print(){
            int i=size-1;
           while(i!=-1){
            System.out.println(s.get(i));
            i--;
           }
        }
    }

