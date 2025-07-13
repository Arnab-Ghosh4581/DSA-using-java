package ARRAY;

import java.util.Scanner;

public class PairsInArray {
    static Scanner input=new Scanner(System.in);
    public static void pair(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+count+","+arr[j]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array element: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("The pairs is: ");
        pair(arr);
    }
}
