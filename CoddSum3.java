import java.util.*;
class OddSum3{
    public void oddSum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s=sc.nextInt();
        int n[]=new int[s];
        int sum=0;
        System.out.println("Enter array elements");
        for(int i=0;i<s;i++){
            n[i]=sc.nextInt();
            if(n[i]%2!=0){
                sum+=n[i];
            }
        }
        System.out.println(sum);
    }
}
public class CoddSum3{
    public static void main(String[] args){
        OddSum3 o=new OddSum3();
        o.oddSum();
    }
}