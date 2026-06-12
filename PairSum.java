import java.util.*;
public class PairSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int s=sc.nextInt();
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==s){
                    System.out.println(ar[i]+" "+ar[j]);
                }
            }
        }
    }
}