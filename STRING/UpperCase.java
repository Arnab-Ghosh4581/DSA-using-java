package STRING;

import java.util.Scanner;

public class UpperCase {
    static Scanner input=new Scanner(System.in);

    public static String Upper(String sen){
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(sen.charAt(0)));
        for(int i=1;i<sen.length();i++){
            if(sen.charAt(i)==' '){
                sb.append(sen.charAt(i));
                i++;
                sb.append(Character.toUpperCase(sen.charAt(i)));
            }
            else{
                sb.append(sen.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String sen=input.nextLine();
        System.out.println(Upper(sen));
    }
}
