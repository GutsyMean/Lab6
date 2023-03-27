package carDealer;

public class NewCar extends Car {
	private double optionCost;
	private double rebate;
	private static int numOfNewcar;
	private static double totalAssets;
	
	public NewCar() {
		this.optionCost = 0;
		this.rebate = 0;
		numOfNewcar++;
		totalAssets = 0;
	}
	public NewCar(String eid, double eprice, int year, double ecommission, 
			double eoption, double erebate) {
		super(eid, year, eprice, ecommission);
		this.optionCost = eoption;
		this.rebate = erebate;
		numOfNewcar++;
	}
	public double computeTotal() {
		double totalCost = (basePrice + optionCost + commission) - rebate;
		return totalCost;
	}
	public String goodBusiness() {
		String str;
		if (commission > (basePrice*0.08))
			str = "Good";
		else
			str = "Bad";
		return str;
	}
	public static int getNumOfNewcar() {
		return numOfNewcar;
	}
	public static double getTotalAssets() {
		return totalAssets;
	}
	@Override
	public void updateAssets() {
		totalAssets = computeTotal();
		super.addTotalAssets(totalAssets);
	}
	@Override
	public double getMileage() {
		return 0;
	}
	@Override
	public String toString() {
		return super.toString() + 
				"\nOption Cost: " + optionCost +
				"\nRebate: " + rebate +
				"\nTotal Cost: " + computeTotal() +
				"\nDeal Result: " + goodBusiness();
	}
}
