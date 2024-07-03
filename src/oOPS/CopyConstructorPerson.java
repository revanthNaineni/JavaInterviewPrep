package oOPS;

class CopyConstructorPerson {
    private String name;
    private int age;

    // Default constructor
    public CopyConstructorPerson() {
    }

    // Parameterized constructor
    public CopyConstructorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public CopyConstructorPerson(CopyConstructorPerson otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }
    
    

    // Getter methods (not shown for brevity)

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
        // Create an original person
		CopyConstructorPerson originalPerson = new CopyConstructorPerson("John", 30);

        // Use the copy constructor to create a new person with the same attributes
		CopyConstructorPerson copiedPerson = new CopyConstructorPerson(originalPerson);

        // Display information about the original and copied persons
        System.out.println("Original Person: " + originalPerson.getName() + ", " + originalPerson.getAge());
        System.out.println("Copied Person: " + copiedPerson.getName() + ", " + copiedPerson.getAge());
    }
}


