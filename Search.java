import java.util.*;
public class Search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==search){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}