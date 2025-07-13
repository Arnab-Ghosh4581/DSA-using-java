package ARRAY;

import java.util.Scanner;

public class LinearSearch {
    static Scanner input =new Scanner(System.in);

    public static int search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elment: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }  
        System.out.print("Enter which element you want to find: ");
        int key=input.nextInt(); 
        int index=search(arr, key); 
        if(index==-1) System.out.println("Element is not present in this array..");
        else System.out.println("Array element is found at index: "+index);
    }
}
