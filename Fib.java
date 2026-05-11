import java.util.*;
class Fib{
    public static void main(String[] args){
        int n1=0;
        int n2=1;
        int n3=n1+n2;
        System.out.println("Enter the size of the series:");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        System.out.print(n1+","+n2+","+n3+",");
        for(int i=3;i<size;i++){
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.print(n3);
            if(i!=size-1){
                System.out.print(",");
            }
        }
    }
}