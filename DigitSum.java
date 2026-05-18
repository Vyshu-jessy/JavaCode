import java.util.*;
public class DigitSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int sum=0;
        while(s>0){
            int d=s%10;
            sum+=d;
            s=s/10;
        }
        System.out.println(sum);
    }
}