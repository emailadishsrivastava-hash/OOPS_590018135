// Parent class
class Parents {
    int value = 10;
}

// Child class
class Child extends Parents {
    int value = 20;

    void printValues() {
        System.out.println("Value of child class (this.value): " + this.value);
        System.out.println("Value of parents class (super.value): " + super.value);
    }
}

// Main class
public class MainClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printValues();
    }
}
