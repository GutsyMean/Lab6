package carDealer;

public class UsedCar extends Car {
	private double mileage;
	private double rateOfDepreciation;
	private static int usedCarCount;
	private static double totalAssets;
	
	public UsedCar() {
		this.mileage = 0;
		this.rateOfDepreciation = 0;
		usedCarCount++;
		totalAssets = 0;
	}
	public UsedCar(String eid, double eprice, int eyear, double ecommission,
			double emileage, double erate) {
		super(eid, eyear, eprice, ecommission);
		this.mileage = emileage;
		this.rateOfDepreciation = erate;
		usedCarCount++;
	}
	public double computeTotal() {
		double totalCost = super.basePrice - mileage * rateOfDepreciation +
				super.commission;
		return totalCost;
	}
	public static int getNumOfUsedCar() {
		return usedCarCount;
	}
	public static double getTotalAssets() {
		return totalAssets;
	}
	
	@Override
	public void updateAssets() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getMileage() {
		return 0;
	}
	@Override
	public String goodBusiness() {
		String str;
		if (super.commission > (computeTotal()*0.04))
			str = "Good";
		else
			str = "Bad";
		return str;
	}
	@Override
	public String toString() {
		return super.toString() + "Mileage: " + mileage +
				"\nTotal Cost: " + computeTotal() +
				"\nDeal Result: " + goodBusiness();
	}
}