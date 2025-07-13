package ARRAYLIST;

import java.util.ArrayList;

public class Minimum {

    public static int minimum(ArrayList<Integer> list){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(39);
        list.add(34);
        list.add(18);
        list.add(03);
        list.add(24);
        System.out.println(list);
        System.out.println("Minimum value is: "+minimum(list));
    }
}
