import java.util.*
class Nonrepeat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                System.out.println("The first non repeat character is:");
            }
        }
    }
}