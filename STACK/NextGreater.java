package STACK;
import java.util.Stack;

public class NextGreater {
    public static void findNextGrater(int [] arr){
        Stack<Integer> s=new Stack<>();
        int [] nextgre=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && arr[i]>=s.peek()){
                s.pop();
            }
            if(s.empty()){
                nextgre[i]=-1;
            }
            else{
                nextgre[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for(int i=0;i<nextgre.length;i++){
            System.out.print(nextgre[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,13,2,16,5,8};
        findNextGrater(arr);
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a+" ");
        // }
    }
}
