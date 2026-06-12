import java.util.*;
class MoveZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                for(int j=i+1;j<ar.length;j++){
                    if(ar[j]!=0){
                        int temp=ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;

                                        }
                }
            }
        }
        System.out.println("Array after moving zeroes to end");
        for(int x:ar){
            System.out.print(x+" ");
        }
    }
}