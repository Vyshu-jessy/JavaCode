import java.util.List;
import java.util.ArrayList;
class ArrayListCol{
    public static void main(String[] args){
        List<Integer> c=new ArrayList<Integer>();
        c.add(5);
        c.add(4);
        c.add(1);
        c.add(2);
        System.out.println(c);
        for(int x:c){
            System.out.println(x);
        }
        System.out.println(c.get(0));
        c.set(1,3);
        System.out.println(c);
        System.out.println(c.indexOf(1));
        c.add(1);
        System.out.println(c);
    }
}