package Exercise8;
//import java.util.ArrayList;
//import Exercise7.humanWeight;
import java.util.Scanner;
public class mainExe8 {
	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Number of human in the list: ");
		int humanNumber=sc.nextInt();
		
		ListHuman humans= new ListHuman();
		humansWeight[] human = new humansWeight[humanNumber];
		for(int i =0;i<humanNumber;i++)
		{
			human[i]= new humansWeight();
			System.out.print("\nEnter your weight in KG:");
			double weight = sc.nextDouble();
			human[i].setWeightEarth(weight);
			
			human[i].calculateWeightMars(weight);
			humans.people.add(human[i]);
		}
		for(int i =0; i<humans.people.size();i++)
		{
			System.out.println("Human "+i+ "weight on earth is:"+humans.people.get(i).getWeightEarth()+"KG");
			System.out.println("Human "+i+ "weight on mars is:"+humans.people.get(i).getWeightMars()+"KG");
		}
		sc.close();
	}}