import java.util.Scanner;
class Merge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("ENter the elements of the array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the second array:");
        int s1=sc.nextInt();
        int a1[]=new int[s1];
        System.out.println("Enter the elements of the second array");
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        int c=s+s1;
        int b[]=new int[s+s1];
        for(int i=0;i<s;i++){
            b[i]=a[i];
        }
        for(int i=s;i<c;i++){
            b[i]=a1[i-s];
        }
        for(int x:b){
            System.out.println(x);
        }
    }
}