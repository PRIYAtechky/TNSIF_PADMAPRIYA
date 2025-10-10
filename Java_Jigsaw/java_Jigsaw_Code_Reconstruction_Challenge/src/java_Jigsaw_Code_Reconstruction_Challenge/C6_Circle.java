package java_Jigsaw_Code_Reconstruction_Challenge;

// Reconstruct a Circle class that has a final static PI variable and a static method to calculate the area.
import java.util.*;
public class C6_Circle {

    public final static double PI = 3.14159;

    public static double calculateArea(double radius) {
    	return calculateArea(0);
    }

    public static void main(String[] args) {
try {
	double area = calculateArea(10);
    System.out.println("The area of the circle is: " + area);
    }catch(Exception e) {
	System.out.println(e);
}
    
        
    }
}
