import java.util.*;
class Rotate2{
    public void rightRotate(int n,int d[]){
        int temp=d[d.length-1];
        for(int i=d.length-1;i>0;i--){
            d[i]=d[i-1];
        }
        d[0]=temp;
        for(int x:d){
            System.out.print(x+" ");
        }
    }
}
public class RightRotate2{
    public static void main(String[] args){
        Rotate2 r=new Rotate2();
        int d[]={1,2,3,4,5};
        r.rightRotate(5,d);
    }
}