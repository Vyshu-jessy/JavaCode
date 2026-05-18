import java.util.*;
public class Smallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        System.out.println("Enter the elements of the array:");
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            if(ar[i]<smallest){
                smallest=ar[i];
            }
        }
        System.out.println("Smallest element: "+smallest);
    }
}