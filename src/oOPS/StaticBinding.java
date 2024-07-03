package oOPS;
class Parent {
    void print() {
        System.out.println("Parent's print method");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child's print method");
    }
}

public class StaticBinding {
    public static void main(String[] args) {
        Parent obj = new Child(); // Reference type is Parent, but object type is Child
        obj.print(); // Output: Parent's print method (static binding)
    }
}
