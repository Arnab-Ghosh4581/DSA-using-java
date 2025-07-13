package PATTARN;

import java.util.Scanner;

public class Pattarn2 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        int n=input.nextInt();
        Triangle(n);
    }

    public static void Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
