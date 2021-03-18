package Exercise7;
import java.util.Scanner;
public class mainExe7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		humanWeight human = new humanWeight();
		
		System.out.print("\nEnter your weight in KG:");
		double weight = sc.nextDouble();
		human.setWeightEarth(weight);
		
		human.calculateWeightMars(weight);
		System.out.println("\nYour weight on Earth is:"+human.getWeightEarth()+"KG");
		System.out.println("\nYour weight on Mars is:"+human.getWeightMars()+"KG");
		
		sc.close();
	
	}
	

}


