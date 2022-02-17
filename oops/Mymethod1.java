package oops;

public class Mymethod1 {
    public static void main(String[] args) {
        //we can create multiple objects in java with different names
        Student2 std = new Student2();
        Student2 std2 = new Student2();
        std.name = "Shivam";
        std.age = 21;
        std2.name = "Prakhar";
        std2.age = 21;
        System.out.println(std.name + " " + std.age);
        System.out.println(std2.name+ " " + std2.age);
        std.eat();
        std2.eat();
        std.run();
        std2.run();
        std.run(3);
        std2.run(5);

    }
}
class Student2{
    //Class student is a blueprint
    String name;
    int age;
    //each class has properties and behaviours , name and age are properties of class , 
    // while for behaviour we use class.
    void eat(){
        System.out.println(name + " " + "eating");
    }
    void run(){
        System.out.println(name + " " + "run");
    }
    //we can add argument or parameter in method
    void run(int steps){
        System.out.println(name + " walked " + steps + " steps ");
    }
    //we also implemented polymorphism here as we can see void run is implemented
    //in two ways with arguments and without arguments that's called complie time polymorphism.
}