class Student{
     int id;
        String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    } 
  
}
public class Main{
    public static void main(String[] args){
        Student s1=new Student(113,"Vyshnavi");
        Student s2=new Student(102,"Ancel");
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}