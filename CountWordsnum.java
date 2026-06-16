import java.util.*;
class CountWordsnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        // int wordCount=0;
        // for(int i=0;i<s.length();i++){
        //     char a=s.charAt(i);
        //     if(a==' '){
        //         wordCount++;
        //     }
        // }wordCount++;
        String ar[]=s.split(" ");
        System.out.println("The total words are: "+ar.length);
    }
}