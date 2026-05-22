import java.util.*;
public class LCM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        int high=(num1>num2)?num1:num2;
        while(true){
            if(high%num1==0 && high%num2==0){
                System.out.println("LCM of "+num1+" and "+num2+" is "+high);
                break;
            }
            high++;
        }
    }
}