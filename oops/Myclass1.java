package oops;
// An object is a real-world entity which is the basic unit of OOPs for example chair, cat, dog, etc.
//  Different objects have different states or attributes, and behaviors.
// A class is a prototype that consists of objects in different states and with different behaviors. 
// It has a number of methods that are common the objects present within that class.


public class Myclass1 {
    public static void main(String[] args) {
        //we can create multiple objects in java with different names
        Student std = new Student();
        Student std2 = new Student();
        std.name = "Shivam";
        std.age = 21;
        std2.name = "Prakhar";
        std2.age = 21;
        System.out.println(std.name + " " + std.age);
        System.out.println(std2.name+ " " + std2.age);

    }
}
class Student{
    //Class student is a blueprint
    String name;
    int age;
}
