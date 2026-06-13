class Student1{
     int id;
        String name;
    Student1(int id,String name){
        this.id=id;
        this.name=name;
    } 
  
}
public class Main1{
    public static void main(String[] args){
        Student1 s1=new Student1(113,"Vyshnavi");
        Student1 s2=new Student1(102,"Ancel");
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}