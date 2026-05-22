// Right rotate , with return type with parameter
import java.util.*;
class Rotate{
    public int[] rightRotate(int n,int d[]){
        if(d == null || d.length == 0) return d;
        int temp = d[d.length-1];
        for(int i = d.length-1; i > 0; i--){
            d[i] = d[i-1];
        }
        d[0] = temp;
        return d;
    }
}
public class RightRotate{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int ar[]=new int[a];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        Rotate r=new Rotate();
        int res[]=r.rightRotate(a,ar);
        for(int x:res){
            System.out.print(x+" ");
        }


    }
}