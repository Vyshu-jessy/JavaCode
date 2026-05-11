import java.util.*;
class Fact{
    public static void main(String[] args){
        long fact=1;
        long f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        f=sc.nextLong();
        // while(f>0){
        //     fact=fact*f;
        //     f=f-1;
        // }
        for(long i=1;i<=f;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}