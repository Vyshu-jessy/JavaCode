import java.util.*;
public class Copy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        int cr[]=new int[ar.length];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            cr[i]=ar[i];
        }
        System.out.println("The copied array is:");
        for(int x:cr){
            System.out.print(x+" ");
        }
        System.out.println("\n Original array is:");
        for(int x:ar){
            System.out.print(x+" ");
        }
    }
}