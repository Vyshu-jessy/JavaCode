import java.util.*;
//right rotate,with return type without parameter
class Rotate1{
    public static int[] rightRotate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int d[]=new int[n];
        System.out.println("Enter array elements one by one:");
        for(int i=0;i<n;i++){
            d[i]=sc.nextInt();
        }
        int temp=d[d.length-1];
        for(int i=d.length-1;i>0;i--){
            d[i]=d[i-1];
        }
        d[0]=temp;
        return d;
    }

}
public class RightRotate1{
    public static void main(String[] args){
        Rotate1 r=new Rotate1();
        int res[]=r.rightRotate();
        System.out.println(Arrays.toString(res));
    }
}