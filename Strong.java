import java.util.*;
public class Strong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int t=num;
        int sum=0;
        while(num>0){
            int d=num%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            sum+=fact;
            num=num/10;
        }
        if(sum==t){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a Strong number");
        }
    }
}