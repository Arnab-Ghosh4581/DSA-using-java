package ARRAYLIST;

import java.util.ArrayList;

public class MostWaterProblem {

    public static int storeWater(ArrayList<Integer> list){
        int maxwater=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i), list.get(j));
                int width=j-i;
                int currWater=height*width;
               // System.out.print(currWater+" ");
                if(currWater>maxwater){
                    maxwater=currWater;
                }
            }
        }
        return maxwater;
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
        System.out.println("Maximum water store in this list is: "+storeWater(list));
    }
}
