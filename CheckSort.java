import java.util.*;
class CheckSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        boolean sort=true;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]>ar[i+1]){
                sort=false;
                break;
            }
        }
        if(sort==true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}