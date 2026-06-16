import java.util.*;
class FindDuplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String result="";
        String dup="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
            else{
                dup+=ch;
            }
        }
        System.out.println(dup);
    }
}