package RECURSION;

public class FirstOccurence {

    public static int firstOccurence(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstOccurence(a, key, i+1); 
    }
    public static void main(String[] args) {
        int a[]={1,23,4,5,6,7};
        System.out.println("The element is found at index: "+firstOccurence(a, 5, 0));
    }
}
