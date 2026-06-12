import java.util.*;
class UniqueELe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            int count=0;
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    count++;
                    
                }
            }
            if(count==1){
                System.out.print(ar[i]+" ");
            }
        }
    }
}