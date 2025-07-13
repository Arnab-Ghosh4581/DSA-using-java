package ARRAY;

import java.util.Scanner;

public class Suubarray {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array element: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("The suarrays are: ");
       // printArray(arr);
       System.out.println("Maximum sum between all subarrays is: "+sum(arr));

    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int sum(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                   sum+=arr[k];
                }
                System.out.println(sum);
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
