package records;

record RecordWithConstructor(String player, int age) {

	public RecordWithConstructor {
		System.out.println("Canonical Constructor invoked");
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
	}

	public RecordWithConstructor() {
		this("Ousmane", 27);
		System.out.println("Custom Constructor invoked");
	}

}

class RecordWithConstructorWithMain {
	public static void main(String[] args) {
		RecordWithConstructor recordWithConstructor = new RecordWithConstructor();
		RecordWithConstructor recordWithConstructor2 = new RecordWithConstructor("Dembele", -8);
	}
}
