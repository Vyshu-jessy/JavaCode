class MaxDiff3{
    public int maxDiff(int n[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(Math.abs(n[i]-n[j])>max){
                    max=Math.abs(n[i]-n[j]);
                }
            }
        }
        return max;
    }
}
public class CMaxDiff3{
    public static void main(String[] args){
        MaxDiff3 m=new MaxDiff3();
        int n[]={1,2,3,4,5};
        int result=m.maxDiff(n);
        System.out.println(result);
    }
}