package STRING;

import java.util.Scanner;

public class Direction {

    static Scanner input=new Scanner(System.in);
    public static double distence(String direction){
        int x=0,y=0;
        for(int i=0;i<direction.length();i++){
            if(direction.charAt(i)=='W'){
                x--;
            }
            else if(direction.charAt(i)=='E'){
                x++;
            }
            else if(direction.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        return Math.sqrt((x*x)+(y*y));
    }

    public static void main(String[] args) {
        System.out.println("Enter direction: ");
        String direction=input.nextLine();
        double dis=distence(direction);
        System.out.println("Total distence is: "+dis);

    }
}
