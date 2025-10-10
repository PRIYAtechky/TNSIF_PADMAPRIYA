package java_Jigsaw_Code_Reconstruction_Challenge;

class Shape1 {

	int width;

	public Shape1(int side) {

		width = side;

	}

	public void printArea() {

		System.out.println("Area of shape is defined.");

	}

}

class Square extends Shape1 {

	int length;

	public Square(int side) {

		super();

		length = side;

	}

	public void printArea() {

		int area = length * length;

		System.out.println("Area of square is " + area);

	}

}

public class C10_Geometry {

	public static void main(String[] args) {

		Shape1 myShape = new Shape1(5);

		myShape.printArea();

	}

}