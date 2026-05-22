import java.util.*;
class OddSum2{
    public int oddSum(){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int s=sc.nextInt();
        int n[]=new int[s];
        System.out.println("Enter array elements");
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
            if(n[i]%2!=0){
                sum+=n[i];
            }
        }
        return sum;
    }

}
public class CoddSum2{
    public static void main(String[] args){
        OddSum2 o=new OddSum2();
        int res=o.oddSum();
        System.out.println(res);
    }
}