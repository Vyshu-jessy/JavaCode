import java.util.*;
class OddSum1{
    public void oddSum(int n[]){
        int sum=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2!=0){
                sum+=n[i];
            }
        }
        System.out.println(sum);
    }
}
public class CoddSum1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int s=sc.nextInt();
        int n[]=new int[s];
        System.out.println("Enter array elements");
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
        }
        OddSum1 o= new OddSum1();
        o.oddSum(n);
    }
}