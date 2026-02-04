// Class with constructor
class Student {
    String name;
    int age;

    
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Constructor called!");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Parent  {
    public static void main(String[] args) {
         Student s1 = new Student("Adish", 20);
        s1.display();
    }
}
