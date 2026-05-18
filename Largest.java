import java.util.*;
public class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int ar[]=new int[s];
        int Large=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            if(ar[i]>Large){
                Large=ar[i];
            }
        }
        System.out.println(Large);
    }
}