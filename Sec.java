import java.util.Scanner;
class Sec{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int larg=integer.MIN_VALUE;
        int seclarg=integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int secsmall=integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(larg<a[i]){
                seclarg=larg;
                larg=a[i];
            }
            else if(seclarg<a[i]&&a[i]!=larg){
                seclarg=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(small>a[i])[
                secsmall=small;
                small=a[i];
            ]
            else if(secsmall>a[i]&&a[i]!=small){
                secsmall=a[i];
            }
        }
        for(int x:a){
            System.out.println(x);
        }

    }
}