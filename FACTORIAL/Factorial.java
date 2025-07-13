package FACTORIAL;

import java.util.Scanner;

public class Factorial {
    static Scanner input=new Scanner(System.in);

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n=input.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }
}
