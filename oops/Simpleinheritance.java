package oops;

public class Simpleinheritance {
    public static void main(String[] args) {
        A a = new B();
        a.name();
        a.age();
    }
}
class A{
    public void name(){
        System.out.println("Shivam");
    }
}
class B extends A{
    public void age(){
        System.out.println(25);
    }
}
