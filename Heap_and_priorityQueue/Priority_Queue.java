package Heap_and_priorityQueue;
import java.util.*;

public class Priority_Queue {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<String> s=new PriorityQueue<>();
    s.add("Arnab");
    s.add("poulami");
    s.add("I love you");
    while (!s.isEmpty()) {
      System.out.print(s.remove()+" ");
    }
    pq.add(10);
    pq.add(4);
    pq.add(50);
    pq.add(1);
    System.out.println(pq.toString());
    while(!pq.isEmpty()){
      System.out.print(pq.remove()+" ");
      //pq.remove();
    }
  }
}
