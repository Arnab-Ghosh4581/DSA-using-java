package FACTORIAL;

import java.util.Scanner;

public class IncreasingNumber {
    static Scanner input=new Scanner(System.in);
    
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        } else{
            print(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int n=input.nextInt();
        print(n);
    }
}
