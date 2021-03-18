package Exercise7;

public class humanWeight {
	
	private double weightEarth;
	private double weightMars;
	
	void setWeightEarth(double weight) {
		this.weightEarth=weight;
	}

	double getWeightEarth()
{
		return weightEarth;
}
	void setWeightMars(double weight)
	{
		this.weightMars=weight;
	}
	double getWeightMars()
	{
		return weightMars;
	}
	
	void calculateWeightMars(double weight)
	{
		weightMars=(weight/9.81)*3.711;
		
	}
}


