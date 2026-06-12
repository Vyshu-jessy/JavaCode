import java.util.*;
class FirstLast{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        long n=sc.nextLong();
       
        int first=(int)n%10;
        while(n>10){
            n=n/10;
        }
        System.out.println("First digit is:"+n);
        System.out.println("Last digit is :"+first);

    }
}