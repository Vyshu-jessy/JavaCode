import java.util.*;
class Largestword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String[] s=sc.nextLine().split(" ");
        String largest=s[0];n
        for(String c:s){
            if(c.length()>largest.length()){
                largest=c;
            }
        }
        System.out.println("The largest word is:"+largest);
    }
}