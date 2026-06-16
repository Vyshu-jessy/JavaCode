import java.util.*;
class Smallestword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String[] s=sc.nextLine().split(" ");
        String small=s[0];
        for(String c:s){
        if(c.length()<small.length()){
            small=c;
        }
        }
        System.out.println(small);
    }
}