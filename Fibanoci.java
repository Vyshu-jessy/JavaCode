import java.util.*;
public class Fibanoci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int s=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=2;i<s;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}