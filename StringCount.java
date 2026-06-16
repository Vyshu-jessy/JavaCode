import java.util.*;
class CountWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.nextLine();
        s.toUpperCase();
        Int owel=0;
        int cons=0;
        for(for int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'|'E'|'I'|'O'|'U'){
                owel++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Owel count is:"+owel+"Consonent count is: "+cons);
    }
}