class A{
    public void show(){
        System.out.println("Showing A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Showing B");
    }
}   
class Hello{
    public static void main(String[] args){
        A a=new A();
        a.show();
        B b=new B();
        b.show();
        // final int a;
        // System.out.println(a);
        // a=3;
        // System.out.println(a);
    }
}