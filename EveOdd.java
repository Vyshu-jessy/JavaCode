import java.util.*;
class EveOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
         System.out.println("Printing even elements in the array:");
        for(int i=0;i<ar.length;i++){
           
            if(ar[i]%2==0){
                System.out.print(ar[i]+" ");
            }
        }
    
        System.out.println("\n Printing odd elements in the array");
        for(int i=0;i<ar.length;i++){
            
            if(ar[i]%2!=0){
                System.out.print(ar[i]+" ");
            }
        }
    }
}