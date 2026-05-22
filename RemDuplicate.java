import java.util.*;
public class RemDuplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();

        }
        for(int i=0;i<ar.length;i++){
            boolean dup=false;
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    dup=true;
                    break;
                }
            }
            if(!dup){
                System.out.print(ar[i]+" ");
            }
        }
    }
}