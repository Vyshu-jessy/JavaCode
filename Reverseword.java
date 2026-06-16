import java.util.*;
class Reverseword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String[] word=s.split(" ");
        String rev="";
        for(int i=0;i<word.length;i++){
            for(int j=word[i].length()-1;j>=0;j--){
                rev+=word[i].charAt(j);
            }
            rev+=" ";
        }
        System.out.println(rev.trim());

    }
}