import java.util.*;
class DiscountCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price");
        double price=sc.nextDouble();
        if(price>5000){
            double discount=price*0.2;
            double finalPrice=price-discount;
            System.out.println("Discount: "+discount);
            System.out.println("Final Price:"+finalPrice);
        }else{
            double discount=price - price*0.1;
            System.out.println("Discount: "+price*0.1);
            System.out.println("Final Price:"+discount);
        }
    }
}