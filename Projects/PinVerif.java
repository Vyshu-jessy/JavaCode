import java.util.*;
class Pinverif{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin");
        int pin=sc.nextInt();
        int actual=1234;
        if(pin==actual){
            System.out.println("Pin verified");
        }else{
            System.out.println("Invalid pin");
        }
    }
}