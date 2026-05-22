import java.util.*;
public class Merge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();

        }
        System.out.println("Enter the size of the second array:");
        int s2=sc.nextInt();
        int ar2[]=new int[s2];
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<ar2.length;i++){
            ar2[i]=sc.nextInt();
        }
        int merge[]=new int[ar.length+ar2.length];
        for(int i=0;i<ar.length;i++){
            merge[i]=ar[i];
        }
        for(int i=ar.length;i<merge.length;i++){
            merge[i]=ar2[i-ar.length];
        }
    
    System.out.println("The merged array is:"+ Arrays.toString(merge));

}
}