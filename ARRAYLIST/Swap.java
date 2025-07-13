package ARRAYLIST;

import java.util.ArrayList;

public class Swap {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
        list.add(39);
        list.add(34);
        list.add(18);
        list.add(03);
        list.add(24);
        System.out.println(list);
        swap(list, 0, list.size()-1);
        System.out.println(list);
    }
}
