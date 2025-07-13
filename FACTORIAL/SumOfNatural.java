package FACTORIAL;
import java.util.Scanner; 
public class SumOfNatural {
    static Scanner input=new Scanner(System.in);

    public static int  printSum(int n){
        if(n==1){
            return n;
        }
        else{
            return n+printSum(n-1);
        }
    }

    public static void main(String... args){
        System.out.print("Enter number: ");
        int n=input.nextInt();
        System.out.println("The sum first "+n+" digits is: "+printSum(n));
    }
}
