import java.util.*;
class CountPrime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
         int c=0;
        for(int i=0;i<ar.length;i++){
            int count=0;
           
          
            for(int j=1;j<ar[i];j++){
                if(ar[i]%j==0){
                    count++;
                }
            }
            if(count==1){
                c++;
            }
        }
        System.out.println("The count of prime numbers are:"+c);
    }
}