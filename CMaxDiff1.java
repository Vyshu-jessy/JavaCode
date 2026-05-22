import java.util.*;

class MaxDiff1{
    public void maxDiff(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(ar[j]-ar[i])>max){
                    max=Math.abs(ar[j]-ar[i]);
                }
            }
        }
        System.out.println("Maximum difference is: "+max);
    }
}
public class CMaxDiff1{
    public static void main(String[] args){
        MaxDiff1 md=new MaxDiff1();
        md.maxDiff();
    }
}