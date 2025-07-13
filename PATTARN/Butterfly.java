package PATTARN;

import java.util.Scanner;

public class Butterfly {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        int  n=input.nextInt();
        pattarn(n);
    }

    public static void pattarn(int n){

        //for 1st part

        for(int i=1;i<=n;i++){
            //loop for first star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //loop for spaces
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print(" ");
            }

            //loop for second stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //for 2nd part
        for(int i=n;i>-1;i--){
            //loop for first star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //loop for spaces
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print(" ");
            }

            //loop for second stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
