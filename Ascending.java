import java.util.*;
public class Ascending{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    int t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }
        for(int x:ar){
            System.out.print(x+" ");
        }
    }
}