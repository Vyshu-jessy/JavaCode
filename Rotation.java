import java.util.*;
class Rotation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first stirng");
        String s1=sc.nextLine();
        System.out.println("Enter the second string");
        String s2=sc.nextLine();
        String temp=s1+s1;
        if(temp.contains(s2)){
            System.out.println("Rotation string");
        }
    else{
        System.out.println("Not a Rotation stirng");
    }}
    }
