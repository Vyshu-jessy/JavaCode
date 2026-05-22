import java.util.*;
class MaxDiff{
    public void maxDiff(int d[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<d.length-1;i++){
            for(int j=i+1;j<d.length;j++){
                if(d[j]-d[i]>max){
                    max=d[j]-d[i];
                }
            }
        }
        System.out.println(max);
    }
}
public class CMaxDiff{
    public static void main(String[] args){
        MaxDiff m=new MaxDiff();
        int d[]={2,3,10,6,4,8,1};
        m.maxDiff(d);
    }
}
