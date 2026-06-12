import java.util.*;
class Secsmall{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements one by one");
        int ar[]=new int[n];
        int small=Integer.MAX_VALUE;
        int secsmall=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
         ar[i]=sc.nextInt();
         if(ar[i]<small){
            secsmall=small;
            small=ar[i];
         }
         else if(ar[i]<secsmall && ar[i]!=small){
            secsmall=ar[i];
         }   
        }
        System.out.println("The Second small element is:"+secsmall);
    }
}