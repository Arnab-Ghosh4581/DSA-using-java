package LINKEDLIST;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size=0;

    public void addFirst(int data){
        Node newnode =new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        } 
        newnode.next=head;
        head=newnode;
    }

    public void addLast(int data){
        Node newnode =new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        } 
        newnode.next=null;
        tail.next=newnode;
        tail=newnode;
    }

    public void add(int data,int index){
        Node newnode=new Node(data);
        size++;
        // if(head==null){
        //     System.out.println("Addition can't possible..");
        //     return;
        // }
        Node temp=head;
        int i=0;
        while(i!=index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
        if(temp.data==key){
            return i;
        }
        else{
            temp=temp.next;
            i++;
        }}
        return -1;
    }

    public void print(){
        if(head==null){
            System.out.println("Linked list is empty....");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Remove operetion can't possible...");
            size--;
            return Integer.MAX_VALUE;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Remove operetion can't possible...");
            size--;
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int vsl=head.data;
            head=tail=null;
            size--;
            return vsl;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int remove(int index){
        Node prev=head;
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        int x=prev.next.data;
        prev.next=prev.next.next;
        return x;
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addFirst(20);
        ll.addFirst(49);
        ll.addLast(59);
        ll.addFirst(32);
        ll.add(24, 2);
        System.out.println("key find at index: "+ll.search(20));
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        ll.remove(1);
        System.out.println(ll.size+" ");
        ll.print();
    }
}
