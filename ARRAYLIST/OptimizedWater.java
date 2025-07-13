package ARRAYLIST;

import java.util.ArrayList;

public class OptimizedWater {

    public static int storeWater(ArrayList<Integer> list){
        int lp=0,rp=list.size()-1;
        int maxWater=0;
        while(lp<rp){
            int height=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currWater=height*width;
            if(maxWater<currWater){
                maxWater=currWater;
            }
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);
        System.out.println("Maximum water store is: "+storeWater(list));
    }
}
