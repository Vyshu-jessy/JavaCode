import java.util.*;
public class SecLarge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        System.out.println("Enter the elements of the array:");
        int large=Integer.MIN_VALUE;
        int secLarge=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]>large){
                secLarge=large;
                large=ar[i];
            }
            else if(ar[i]>secLarge && ar[i]!=large){
                secLarge=ar[i];
            }
        }
            System.out.println("Second largest element is :"+secLarge);
    }
}