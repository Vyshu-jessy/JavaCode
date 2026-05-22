import java.util.*;
class OddSum{
    public int OddSum(int[] n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2!=0){
                sum+=n[i];
            }
        }
        return sum;
    }
}
public class CoddSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int s=sc.nextInt();
        int[] n=new int[s];
        System.out.println("Enter array elements");
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
        }
        OddSum o= new OddSum();
        int re=o.OddSum(n);
        System.out.println(re);
    }
}