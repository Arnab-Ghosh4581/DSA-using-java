package STACK;
class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Stack{
         Node head=null;
         static int size=0;
        //push---
        public void push(int data){
            Node newNode=new Node(data);
            size++;
            newNode.next=head;
            head=newNode;
        }
        //pop---
        public int pop(){
            int top=head.data;
            head=head.next;
            size--;
            return top;
        }

        public int peek(){
            int top=head.data;
            return top;
        }
        //print--->
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(34);
        s.push(12);
        s.push(12);
        s.print();
    }

}
