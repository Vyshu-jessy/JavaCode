import java.util.*;
public class Count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        int cO=0,cE=0;
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<ar.length;i++){

            ar[i]=sc.nextInt();
            while(ar[i]!=1){
            if(ar[i]%2==0){
                cE++;
            }
            else{
                cO++;
            }
            
        }}
            System.out.println("Even count: "+cE);
            System.out.println("Odd count: "+cO);
        }
    }
