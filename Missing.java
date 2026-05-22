import java.util.*;
public class Missing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int sum=0;
        System.out.println("Enter elements of array in sequence");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            sum+=ar[i];
        }
        System.out.println("Enter range of numbers");
        int r=sc.nextInt();
        int total=r*(r+1)/2;
        int m=total-sum;
        System.out.println("Missing number is "+m);
    }
}