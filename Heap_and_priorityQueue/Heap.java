package Heap_and_priorityQueue;
import java.util.*;
public class Heap {
  static class MyHeap{
    //creating arrayList
    ArrayList<Integer> arr=new ArrayList<>();

    //write function for adding value to Heap(Min Heap)
    public void add(int data){
      arr.add(data);
      int x=arr.size()-1;
      int per=(x-1)/2;
      while(arr.get(x)<arr.get(per)){
        int temp=arr.get(x);
        arr.set(x,arr.get(per));
        arr.set(per,temp);

        //update  values in loop
        x=per;
        per=(x-1)/2;
      }
    }

    //Write function for peek value from Heap(min Heap)
    public int peek(){
      return arr.get(0);
    }

    //Write function for deleting element from Heap
    private void hepify(int i){
      int minIdx=i;
      int left=2*i+1;
      int right=2*i+2;
      if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
        minIdx=left;
      }
      if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
        minIdx=right;
      }
      if(i!=minIdx){
        int temp=arr.get(minIdx);
        arr.set(minIdx, arr.get(i));
        arr.set(i,temp);
        hepify(minIdx);
      }
    }
    public int remove(){
      int data=arr.get(0);
      int temp=arr.get(arr.size()-1);
      arr.set(arr.size()-1,data);
      arr.set(0,temp);
      arr.remove(arr.size()-1);
      hepify(0);
      return data;
    }

    //Write function for check empty
    public boolean isEmpty(){
      return arr.size()==0;
    }
  }

  public static void main(String[] args) {
    MyHeap h=new MyHeap();
    h.add(10);
    h.add(4);
    h.add(50);
    h.add(1);
    System.out.println(h.arr);
    while (!h.isEmpty()) {
      System.out.print(h.remove()+" ");
    }
  }
  
}
