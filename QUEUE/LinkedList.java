package QUEUE;

public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
       static Node head;
       static Node tail;
        public boolean isEmpty(){
            return head==null;
        }
       public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
       }

       public int remove(){
        if(head==null){
            System.out.println("queue ids empty...");
            return -1;
        }
        int x=head.data;
        head=head.next;
        return x;
       }

       public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty...");
            return -1;
        }
        return head.data;
       }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(12);
        ll.add(12);
        ll.add(47);
        ll.add(14);
        ll.add(78);
        ll.remove();
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

}
