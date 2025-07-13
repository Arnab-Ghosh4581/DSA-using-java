package PATTARN;

import java.util.Scanner;

public class FloyedTriangle{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter total number of rows: ");
        int n=input.nextInt();
        System.out.println("The pattarn is: ");
        Triangle(n);
    }

    public static void Triangle(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}