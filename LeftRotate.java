import java.util.*;
public class LeftRotate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int s=sc.nextInt();
        int ar[]=new int[s];
        // int dup[]=new int[s];
        System.out.println("Enter the array elements");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        // int j=1;

        int first=ar[0];
        for(int i=0;i<ar.length-1;i++){
            // dup[i]=ar[j];
            // j++;
            ar[i]=ar[i+1];
        }
        ar[ar.length-1]=first;
        // dup[dup.length-1]=ar[0];
        System.out.println("Left rotated array is");
        for(int x:ar){
            System.out.print(x+" ");
        }
    }
}