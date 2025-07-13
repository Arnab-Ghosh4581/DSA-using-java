package FACTORIAL;

import java.util.Scanner;

public class Fibonacci {
    static Scanner input=new Scanner(System.in);
    public static int  fibonacci(int n){
        
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            int x= fibonacci(n-1)+fibonacci(n-2);
            System.out.print(x+" ");
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        //int n=input.nextInt();
        // if(n>2){
        //     System.out.print(0+" "+1+" ");
        // }
        // else if(n>1){
        //     System.out.print(1+" ");
        // }
        //int b=fibonacci(n);
    }
}
