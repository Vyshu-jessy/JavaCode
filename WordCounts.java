import java.util.*;
class WordCounts{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int count=1;
        String result="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                result+=s.charAt(i);
                result+=count;
                count=1;
            }
        }
        result+=s.charAt(s.length()-1);
        result+=count;
        System.out.println(result);
    }
}