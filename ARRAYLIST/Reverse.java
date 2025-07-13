package ARRAYLIST;

import java.util.ArrayList;

public class Reverse {

    @SuppressWarnings("rawtypes")
    public static ArrayList reverse(ArrayList<Integer> list){
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            int x=list.get(i);
            a.add(x);
        }
        //System.out.println();
        return a;
    }   

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(40);
        System.out.println(list);
        reverse(list);
        System.out.println(reverse(list));
    }
}
