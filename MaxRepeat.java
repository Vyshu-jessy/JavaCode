import java.util.*;
class MaxRepeat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int maxval=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxval=arr[i];
            }
        }
        System.out.println(maxval+"Has the max frequency with frequency of:"+max);
    }
}