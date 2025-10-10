package java_Jigsaw_Code_Reconstruction_Challenge;

//Make the following code it Print "myPerson is a Manager."

class Employee {
}

class Manager extends Employee {
}
public class C8_Company {

	public static void main(String[] args) {

		String Employee myPerson = new Employee();

		if (Employee instanceof Employee ) {

			System.out.println("myPerson is a Manager.");

		}
		else 
		{ System.out.println("myPerson is a regular Employee.");}
	

	}

}

