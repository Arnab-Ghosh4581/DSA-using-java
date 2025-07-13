package STRING;

import java.util.Scanner;

public class Palindrome {
    static Scanner input=new Scanner(System.in);
    public static void pal(String str){
        int n=str.length();
        int start=0,end=n-1;
        while(start<=end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                System.out.println("The input string is not palindrom");
                return;
            }
        }
        System.out.println("Enter string is palindrom");
    }

    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String str=input.nextLine();
        pal(str);
    }
}
