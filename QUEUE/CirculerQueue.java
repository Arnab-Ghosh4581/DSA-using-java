package QUEUE;

public class CirculerQueue {
    static int size=6;
    // CirculerQueue(int size){
    //     this.size=size;
    // }
    static int[] arr=new int[size];
    int front=-1;
    int rear=-1;

    public boolean isEmpty(){
        return front==-1 && rear==-1;
    }
    // public boolean isFull(){
    //     return front==rear;
    // }
    public void add(int data){
        if(isEmpty()){
            front=0;
        }
        // if(front==rear){
        //     System.out.println("Queue is full...");
        //     return;
        // }
        rear=(rear+1)%size;
        arr[rear]=data;
    }

    public int remove(){
        if(front==rear){
            front=rear=-1;
        }
        if(isEmpty()){
            System.out.println("We can't delete anything...");
            return -1;
        }
        if(front==rear){
            front=rear=-1;
        }
        int x=arr[front];
        front=(front+1)%size;
        return x;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public void print(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        CirculerQueue c=new CirculerQueue();
        c.add(12);
        c.add(19);
        c.add(1);
        c.add(12);
        c.add(12);
        c.add(12);
        c.print();
    }
}
