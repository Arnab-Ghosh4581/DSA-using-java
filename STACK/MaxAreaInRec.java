package STACK;

import java.util.Stack;

public class MaxAreaInRec {
    public static int maxArea(int arr[]){
        Stack<Integer> s=new Stack<>();
        int[] nsr=new int[arr.length];
        int[] nsl=new int[arr.length];
        //calculate next smallest right;
        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.empty()){
                nsr[i]=arr.length;
            }
            else{
               nsr[i]=s.peek();
            }
            s.push(i);
        }
        //calculate next smallest left..
        for(int i=0;i<=arr.length-1;i++){
            while(!s.empty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.empty()){
                nsl[i]=-1;
            }
            else{
               nsl[i]=s.peek();
            }
            s.push(i);
        }
        int maxArea=0;
        //claculate maximum area..
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height={2,1,5,6,2,3};
        System.out.println("Maximum area is: "+maxArea(height));
    }
}
