import java.util.*;
class MaxDiff2{
    public int maxDiff(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        System.out.println("Enter array elements");
        for(int i=0;i<s;i++){
            ar[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(Math.abs(ar[i]-ar[j])>max){
                    max=Math.abs(ar[i]-ar[j]);
                }
            }
        }
        return max;
    }

}
public class CMaxDiff2{
    public static void main(String[] args){
        MaxDiff2 md=new MaxDiff2();
        int result=md.maxDiff();
        System.out.println(result);
    }
}