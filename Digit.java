import java.util.*;
public class Digit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int count=0;
        while(s>0){
            s=s/10;
            count++;
        }
        System.out.println(count);
    }
}