package STRING;

import java.util.Scanner;

public class Compresion {
    static Scanner input=new Scanner(System.in);

    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            while((i<str.length()-1) && (str.charAt(i)==str.charAt(i+1))){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String str=input.nextLine();
        System.out.println(compress(str));
    }
}
