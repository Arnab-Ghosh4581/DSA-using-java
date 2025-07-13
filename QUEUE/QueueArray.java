package QUEUE;

public class QueueArray {
    private static int size;
    private  int front=0;
    private  int rear=-1;
    static int[] arr=new int[size];
    QueueArray(int size){
        QueueArray.size=size;
    }
    public boolean isEmpty(){
        return size==rear;
    }

    public void add(int data){
        if(isEmpty()){
            System.out.println("Queue is full...");
            return;
        }
        rear++;
        arr[rear]=data;
    } 

    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int x=arr[front];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return x;
    }

    public void print(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        QueueArray q=new QueueArray(5);
        q.add(1);
        q.add(12);
        q.add(35);
        q.remove();
        q.print();
        System.out.println(q.peek());
    }
}
