import java.util.*;
public class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int s=sc.nextInt();
        int ar[]=new int[s];
        System.out.println("Enter the elements of the array");
        int sum=0;
        for(int i=0;i<s;i++){
            ar[i]=sc.nextInt();
            if(ar[i]%2==0){
                sum+=ar[i];
            }
        }
        System.out.println("The sum of even numbers in the given array is "+sum);
    }
}