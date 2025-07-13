package ARRAY;

import java.util.Scanner;

public class BinarySearch {

    static Scanner input=new Scanner(System.in);
    public static int search(int[] arr,int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]>key) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter which element you want to find: ");
        int key=input.nextInt();
        int index=search(arr, key);
        if(index==-1) System.out.println("Element is not present in the array...");
        else System.out.println("Element is present in array index: "+index);
    }
}
