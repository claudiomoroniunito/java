/**
 * 
 */
package es_01;

/**
 * @author Dr. Jacopo Pellegrino
 *
 */
public class PersonBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person person1 = new Person("Pippo", 10);
		Person person2 = new Person("Pluto", 11);
		Person person3 = new Person("Paperino", 12);
		
		Person.personArray[0] = person1;
		Person.personArray[1] = person2;
		Person.personArray[2] = person3;
		
		System.out.println(Person.personArray);
	}

}
