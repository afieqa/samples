package calculate;

import java.util.Scanner;
public class weight {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight on Earth in kg: ");
		double weight = input.nextDouble();
		
		double mars = (weight * 0.3711);
		
		System.out.print("Your weight " + mars + " kg on Mars\n");
	}
	
	

}
