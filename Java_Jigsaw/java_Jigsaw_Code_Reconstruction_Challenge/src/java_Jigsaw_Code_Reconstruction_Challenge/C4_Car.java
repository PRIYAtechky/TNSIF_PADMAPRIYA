package java_Jigsaw_Code_Reconstruction_Challenge;

// The Car class supposed to print the brand name instead of null.

public class C4_Car {

	String brand;

	public C4_Car(String brand) {

	this.brand = brand;
	

	}

	public void drive() {

		System.out.println(this.brand + " is driving.");

	}

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.drive ("Toyota");

	}

}
