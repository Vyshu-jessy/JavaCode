import java.util.*;
public class NegPos{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        int ar[]=new int[s];
        int pos=0,neg=0;
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            if(ar[i]>0){
                pos++;
            }
            else if(ar[i]<0){
                neg++;
            }
        }
        System.out.println("The number of positive numbers in array :"+pos);
        System.out.println("The number of negative numbers in array :"+neg);
    }
}