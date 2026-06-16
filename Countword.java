import java.util.*;
class CountWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.nextLine().toUpperCase();
    
        int owel=0;
        int cons=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if( c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                owel++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Owel count is:"+owel+"Consonent count is: "+cons);
    }
}