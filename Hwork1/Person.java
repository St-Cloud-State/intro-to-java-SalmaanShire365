public class Person {
	
	private String firstName, lastName, id;
	
	public Person(String firstN, String lastN, String personId) {
		firstName = firstN;
		lastName = lastN;
		id = personId;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getId() {
		return id;
	}
	@Override
	public String toString() {
	return "First name:" + firstName + ","
		+ "Last name:" + lastName + ","
		+ "ID:" + id + "\n" ;
	}


public static void main(String [] args) {
	// Person p1 = new Person("Salmaan","Shire","012210");
	// System.out.println(p1.id);

}
}
