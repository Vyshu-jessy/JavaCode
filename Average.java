import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements of the array");
        int sum=0;
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            sum+=ar[i];
        }
        double avg=(double)sum/ar.length;
        System.out.println("The average is "+avg+" sum: "+sum);
    }
}