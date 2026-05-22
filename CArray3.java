import java.util.*;
class Common3{
    public int[] Common(){
        int n[]={1,2,3,4,5};
        int m[]={1,3,5,6,7};
        int count=0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<m.length;j++){
                if(n[i]==m[j]){
                    count++;
                }
            }
        }
        int res[]=new int[count];
        int k=0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<m.length;j++){
                if(n[i]==m[j]){
                    res[k]=n[i];
                    k++;
                }
            }
        }
        return res;
    }
}
public class CArray3{
    public static void main(String[] args){
        Common3 c=new Common3();
        int res[]=c.Common();
        System.out.println(Arrays.toString(res));
    }
}