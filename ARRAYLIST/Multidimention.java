package ARRAYLIST;

import java.util.ArrayList;

public class Multidimention {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        a.add(30);
        a.add(23);
        a.add(12);
        System.out.println(a);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(23);
        b.add(73);
        b.add(23);
        System.out.println(b);
        list.add(a);
        list.add(b);
        System.out.println(list);
    }
}
