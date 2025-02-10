package sealed;

sealed interface Shape1 permits Circle1, Square1 {
    double area();
}

// Record implementing the sealed interface
record Circle1(double radius) implements Shape1 {
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Record implementing another permitted type of the sealed interface
record Square1(double side) implements Shape1 {
    @Override
    public double area() {
        return side * side;
    }
}


sealed class Person permits Student, Teacher {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}


//Record can't extend sealed class because internally record extends Record class
// Record extending the sealed class
record Student(String name, int grade) extends Person {
    public Student {
        super(name);
    }
}

// Record extending another permitted type of the sealed class
record Teacher(String name, String subject) extends Person {
    public Teacher {
        super(name);
    }
}

public class SealedClassorInterfaceWithRecord {

}
