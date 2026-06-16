import java.util.*;
class Countcase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int lower=0,upper=0,digit=0,spl=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                upper++;
            }
            else if(Character.isLowerCase(s.charAt(i))){
                lower++;
            }
            else if(Character.isDigit(s.charAt(i))){
                digit++;
            }
            else{
                spl++;
            }
        }
        System.out.println("Lower case characters:"+lower);
        System.out.println("Upper case characters:"+upper);
        System.out.println("Digits"+digit);
        System.out.println("Special characters"+spl);
    }
}