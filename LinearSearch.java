import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int se=sc.nextInt();
        boolean found=false;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==se){
                found=true;
                System.out.println("Element found at "+i);
                break;
            }
        }
        if(!found){
            System.out.println("Element not found in the array");
        }
    }
}