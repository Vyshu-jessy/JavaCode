import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int ar[]=new int[s];
        int sum=0;
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            sum+=ar[i];
        }
            System.out.println(sum);
    }
}