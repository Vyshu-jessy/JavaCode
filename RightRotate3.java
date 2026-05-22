import java.util.*;
class Rotate3{
    public void rightRotate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int d[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            d[i]=sc.nextInt();
        }
        int temp=d[d.length-1];
        for(int i=d.length-1;i>0;i--){
            d[i]=d[i-1];
        }
        d[0]=temp;
        System.out.println("Right rotated array");
        System.out.println(Arrays.toString(d));
    }
    
}
public class RightRotate3{
    public static void main(String[] args){
        Rotate3 r=new Rotate3();
        r.rightRotate();
    }
}