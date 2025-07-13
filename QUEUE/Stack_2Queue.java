package QUEUE;

import java.util.*;

 class Stack_2Queue {
   static class Queue{
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
    public  void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        return s1.pop();
    }

    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        return s1.peek();
    }
   }

   public static void main(String[] args) {
   // Stack_2Queue ss=new Stack_2Queue();
    Queue q=new Queue();
    q.add(34);
    q.add(14);
    q.add(12);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
   }
}
