import java.util.*;
class MoveZero1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int temp[]=new int[n];
        int index=0;
        System.out.println("Enter the elements of the array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            if(ar[i]!=0){
                temp[index++]=ar[i];
            }
        }
        System.out.println("The array after moving the zeroes");
        for(int x:temp){
            System.out.print(x+" ");
        }
    }
}