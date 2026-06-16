import java.util.*;
class TreeSetDemo{
    public static void main(String[] args){
        Collection<Integer> n=new TreeSet<Integer>();
        n.add(3);
        n.add(2);
        n.add(1);
        n.add(0);
        Iterator<Integer> values=n.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}