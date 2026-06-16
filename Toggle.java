import java.util.*;
class Toggle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                res+=Character.toLowerCase(s.charAt(i));
            }
            else if(Character.isLowerCase(s.charAt(i))){
                res+=Character.toUpperCase(s.charAt(i));
            }
            else{
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }
}