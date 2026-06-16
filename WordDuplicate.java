import java.util.*;
class wordDuplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}