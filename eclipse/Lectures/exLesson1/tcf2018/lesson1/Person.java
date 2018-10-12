/**
 * 
 */
package tcf2018.lesson1;

/**
 * @author Dr. Jacopo Pellegrino
 *
 */
public class Person {

	static int counter = 0;
	static Person[] personArray = new Person[3];
	String fullName;
	int age;
	
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.fullName = name;
		this.age = age;
		System.out.println("creating person " + name + 
				", age: " + age + 
				", person number: " + counter);
		
		personArray[counter++] = this;
		
		System.out.println("now counter is " + counter);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("Pippo", 28);
		Person p2 = new Person("Pluto", 29);
		Person p3 = new Person("Paperino", 30);
//		p1.name = "Pippo";
//		p1.age = 28;
//		System.out.println(p1.name + ", age: " + p1.age);
		
		Person personRef1 = personArray[0];
		System.out.println(personRef1.fullName + ", age: " + personRef1.age);

		Person personRef2 = personArray[1];
		System.out.println(personRef2.fullName + ", age: " + personRef2.age);
		
		Person personRef3 = personArray[2];
		System.out.println(personRef3.fullName + ", age: " + personRef3.age + "\n");

		p1.sayHello();
		System.out.println("Person objects created so far: " + counter);
	
		p2.getOlder(4);
		p2.getOlder(1);

		p3.addSurname(" mySurname");
		p3.sayHello();
		
		compareAgeStatic(p1, p2);
		compareAgeStatic(p2, p1);
		
		p1.compareAge(p2);
		p2.compareAge(p1);
	}
	
	public void compareAge(Person other) {
		System.out.println("\nThe younger is: " +
				(this.age < other.age ? this.fullName : other.fullName)
				);
	}
	
	public static void compareAgeStatic(Person first, Person second) {
		String younger = (first.age < second.age) ? first.fullName : second.fullName;
		
		System.out.println("\nThe younger is: " + younger);
	}
	
	public void addSurname(String surname) {
		this.fullName += surname;
//		fullName = this.fullName.concat(surname);
	}
	
	public void getOlder(int years) {
		this.age += years;
		System.out.println("now age of " + this.fullName + " is " + this.age 
				+ ", is even " + this.isEven());
	}
	
	/**
	 * Check if the age of the person is even
	 * @return True if age is even
	 */
	public boolean isEven() {
		return age%2 == 0;
	}
	
	public static int getCreatedPerson() {
		return counter;
	}

	public void sayHello() {
		System.out.println("Hello from " + this.fullName);
	}
	
}
