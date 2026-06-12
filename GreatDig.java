import java.util.*;
class GreatDig{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextLong();
        int great=Integer.MIN_VALUE;
        while(n>0){
            int d=(int)n%10;
            if(d>great){
                great=d;
            }
            n=n/10;
        }
        System.out.println("The greatest digit is:"+great);
    }
}