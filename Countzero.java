import java.util.*;
class Countzero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextLong();
        int count=0;
        while(n>0){
            int d=(int)n%10;
            if(d==0){
                count++;
            }
            n=n/10;
        }
        System.out.println("The total count of the number is :"+count);
    }
}