import java.util.*;
public class ReversePrint{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=ar.length-1;i>=0;i--){
            System.out.println(ar[i]);
        }

    }
}