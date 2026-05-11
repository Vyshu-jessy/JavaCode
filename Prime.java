import java.util.*;
class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check:");
        int p=sc.nextInt();
        boolean p1=false;
        if(p<=1){
            p1=true;
        }
        else{
        for(int i=2;i<=p/2;i++){
            if(p%i==0){
                p1=true;
                System.out.println(i);
                break;
            }
        }}
        if(p1==false){
            System.out.println(p+" is a prime number");
        }
        else{
             System.out.println(p+" is not a prime number");
        }
    }
}