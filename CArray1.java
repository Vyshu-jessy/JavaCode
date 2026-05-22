class Common1{
    public void Common(int n[],int m[]){
        for(int i=0;i<n.length;i++){
            for(int j=0;j<m.length;j++){
                if(n[i]==m[j]){
                    System.out.print(m[j]+" ");
                }
            }
        }
    }
}
public class CArray1{
    public static void main(String[] args){
        int n[]={1,2,3,4,7};
        int m[]={1,3,5,6,7};
        Common1 c=new Common1();
        c.Common(n,m);
    }
}