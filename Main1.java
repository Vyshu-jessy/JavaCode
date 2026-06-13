
public class Main1{
    public Main1(){
        this("Vyshnavi");
    }

    public Main1(String N){
        System.out.println("Hello "+N);
    }

    public static void main(String[] args){
        Student1 s1=new Student1(113,"Vyshnavi");
        Student1 s2=new Student1(102,"Ancel");
        s1.show();
        s2.show();
        System.out.println(s1.showid());
        System.out.println(s1.showname("Patoju"));
        s1.showvalue(7);
    }
}
class Student1{
    int id;
    String name;
    void show(){
        System.out.println(id+" "+name);
    }
    int showid(){
        return id;
    }
    String showname(String n){
        return n+name;
    }
    void showvalue(int v){
        System.out.println(v+id);
    }
    Student1(int id,String name){
        this.id=id;
        this.name=name;
    }
}