import java.util.*;
class Angaram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        char[] s=sc.next().toLowerCase().toCharArray();
        System.out.println("Enter second string");
        char[] s1=sc.next().toLowerCase().toCharArray();
        Arrays.sort(s);
        Arrays.sort(s1);
        if(Arrays.equals(s,s1)){
            System.out.println("Angram");
        }
        else{
            System.out.println("Not an Angram");
        }

    }
}