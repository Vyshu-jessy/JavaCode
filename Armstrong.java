import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=s;
        int sum=0;
        while(s>0){
            int r=s%10;
            sum+=r*r*r;
            s=s/10;
        }
        if(sum==t){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }
        }
    }
