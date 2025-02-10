package personmain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mabardaji
 */
public class Person {

	/* fields, attributes, properties */
	private String nif;
	private String name;
	private int age;
	/* constructors */
	/** Person()
	 * full initializer constructor
	 * @param String nif: the nif id of this person
	 * @param String name: the name of this person
	 * @param int age: the age of this person
	 * @throws InvalidValueException if a value for a property is not valid
	 * @return nothing
	 */
	public Person(String nif, String name, int age) 
			 {
		setNif(nif);
		setName(name);
		setAge(age); 
	}
	/** Person()
	 * constructor without any initialization (default constructor)
	 * @param none
	 * @return nothing
	 */
	public Person() {
	}
	/** Person()
	 * copy constructor
	 * @param Person p: person to copy from
	 * @return nothing
	 */
	public Person(Person p) {
		nif = p.nif;
		name = p.name;
		age = p.age; 
	}
	/* accessors */
	/** getNif()
	 * @param none
	 * @throws PropertyNotInitializedException if property is not initialized
	 * @throws InvalidValueException if property value is not validNif
	 * @return nif
	 */
	public String getNif() {
            return "";
	}
	/** setNif()
	 * @param String nif: the nif to set
	 * @throws InvalidValueException if parameter value is not valid for property 'nif'
	 * @return nothing
	 */
	public void setNif(String nif) {

	}
	/** getName()
	 * @param none
	 * @throws PropertyNotInitializedException if property is not initialized , if is null
	 * @return name
	 */
	public String getName()  {
            return "";
	}
	/** setName()
	 * @param String name: the name to set
	 * @throws InvalidValueException if parameter value is not valid for property 'name'
	 * @return nothing
	 */
	public void setName(String name) {
		//TO DO 
	}
	/** getAge()
	 * @param none
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/** setAge()
	 * @param int age: the age to set
	 * @throws InvalidValueException if value is not valid
	 * @return nothing
	 */
	public void setAge(int age) {
		  //TO DO
	}

	/** isAValidNif()
	 * checks if parameter 'nif' has a valid value for property 'nif'
	* nif is valid if its length is 9, if the last position is not numerical, 
		and if the first 8 positions make up a number
		functions length, substring, Integer.parseInt
	 * @param String nif: the nif value to check
	 * @return true if value is valid for a nif, false otherwise
	 */
	public static boolean isAValidNif(String nif) {
		boolean flag = true; //TODO: perform the checkings
		return flag;
	}	
	/** toString()
	 * gives a String representations of this person
	 * @param none
	 * @return a string representation of this person
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{Person your nif is ");
		sb.append(nif);
		sb.append(" and your name is");
		sb.append(name);
		sb.append(" and you have ");
		sb.append(age);
		sb.append(" years.");
		return sb.toString();
		//return ( "{Person: nif="+nif+";name="+name+";age="+age+"}" );
	}
	/** equals()
	 * compares this person to another one
	 * two persons are equals if their nifs are equals.
	 * @param Person other: the other person to compare to
	 * @return true if they are equal, false otherwise
	 */
	public boolean equals(Person other) {
		return (nif.equals(other.nif));
	}
}

