import java.util.*;
class Common2{
    public void Common(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n1=sc.nextInt();
        int n[]=new int[n1];
        System.out.println("Enter elements of first array");
        for(int i=0;i<n1;i++){
            n[i]=sc.nextInt();
    }
    System.out.println("Enter size of second array");
    int m1=sc.nextInt();
    int m[]=new int[m1];
    System.out.println("Enter elements of second array");
    for(int i=0;i<m1;i++){
        m[i]=sc.nextInt();
    }
    for(int i=0;i<n.length;i++){
        for(int j=0;j<m.length;j++){
            if(n[i]==m[j]){
                System.out.print(n[i]+" ");
            }
        }
    }

    }
}
class CArray2{
    public static void main(String[] args){
        Common2 c=new Common2();
        c.Common();
    }
}