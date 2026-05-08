class Calc{
    public int add(int a,int b){
        return a+b;
    }
}
class AdvCalc extends Calc{
    public int add(int a,int b){
        return a+b+1;
    }
}
public class Calculator{
    public static void main(String[] args){
        Calc c=new Calc();
        System.out.println(c.add(2,3));
        AdvCalc a=new AdvCalc();
        System.out.println(a.add(2,3));
    }
}