import java.util.*;
public class Spy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            product*=d;
            n/=10;
        }
        if(sum==product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a spy number");
        }
        }
    }
