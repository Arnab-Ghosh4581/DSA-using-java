package FACTORIAL;

import java.util.Scanner;

public class DecreasingNumber {
    static Scanner input=new Scanner(System.in);
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
        }
        else{
            System.out.print(n+" ");
            print(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number till which you want sum: ");
        int n=input.nextInt();
        print(n);
    }
}
