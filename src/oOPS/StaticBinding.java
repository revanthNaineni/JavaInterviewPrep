package oOPS;
class Parent {
    private void print() {
        System.out.println("Parent's print method");
    }
    
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.print(); // Output: Parent's print method (static binding)
    }
}



