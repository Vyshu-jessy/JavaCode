import java.util.*;
class Common{
    public int[] Common(int n[],int m[]){
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
                    res[k]=m[j];
                    k++;
                }
            }
        }
        return res;
    }
}
public class CArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n[]={1,2,3,4,7};
        int m[]={1,3,5,6,7};
        Common c=new Common();
        int res[]=c.Common(n,m);
        System.out.println(Arrays.toString(res));
    }
}