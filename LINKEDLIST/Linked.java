package LINKEDLIST;

public class Linked {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){
        size++;
        if(head==null){
            head=tail=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        size++;
        if(head==null){
          tail=head=new Node(data);
          return;  
        }
        Node newNode=new Node(data);
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int data,int idx){
        if(head==null){
            head=tail=new Node(data);
            size++;
            return;
        }

        Node temp=head;
        if(idx==size){
            addLast(data);
            size++;
            return;
        }
        if(idx==0){
            addFirst(data);
            size++;
            return;
        }
        int i=0;
        while(i!=idx-1){
            temp=temp.next;
            i++;
        }
        Node newNode=new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("Linked list is empty..");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static  Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        Linked ll=new Linked();
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(467);
        ll.add(12, 4);
        ll.addLast(245);
        ll.print();
    }
}
