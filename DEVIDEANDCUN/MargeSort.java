package DEVIDEANDCUN;

public class MargeSort {
    public static void margesort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        margesort(a, si, mid);
        margesort(a, mid+1, ei);
        marging(a,si,mid,ei);
    }

    public static void marging(int a[],int si,int mid,int ei){
        int i=si,j=mid+1,k=0;
        int temp[]=new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[k++]=temp[i++];
            }
            else{
                temp[k++]=temp[j++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=ei){
            temp[k++]=a[j++];
        }
        // for(int s=si;s<temp.length;s++){
        //     a[s]=temp[s];
        // }
        for(i=si,k=0;k<temp.length-1;i++,k++){
            a[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int[] a={1,4,7,2,3,8};
        margesort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
