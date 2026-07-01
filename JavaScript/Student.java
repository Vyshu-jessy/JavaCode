import java.util.*;
public class Student{
	public static void main(String[] args){
		Map<Integer,String> name=new HashMap<>();
		name.put(1,"Ancel");
		name.put(2,"Hema");
		name.put(3,"Joshita");
		name.put(4,"Karuna");
		name.put(5,"Tejasri");
		name.put(6,"Vyshnavi");
		System.out.println(name.get(6));
		System.out.println(name);
		name.put(3,"Anusha");
		System.out.println(name);
		System.out.println(name.keySet());
		for(int roll:name.keySet()){
			System.out.println(roll+" "+name.get(roll));
		}
		System.out.println(name.values());
		name.remove(5,"Tejasri");
		System.out.println(name);
		name.clear();
		System.out.println(name);
		
	}
}
