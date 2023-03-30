package carDealer;

public abstract class Car {
	private String id;
	private int year;
	protected double basePrice;
	protected double commission;
	protected static double totalAssets;
	
	
	public Car() {
		this.id = "Unknown Car";
		this.year = 2007;
		this.basePrice = 0;
		this.commission = 0;
		totalAssets = 0; 
	}
	public Car(String eid, int eyear, double eprice, double ecommission) {
		this.id = eid;
		this.year = eyear;
		this.basePrice = eprice;
		this.commission = ecommission;
	}
	public static double getTotalAssets() {
		return totalAssets;
	}
	public static void addTotalAssets(double asset) {
		totalAssets += asset;
	}
	@Override
	public String toString() {
		String str = "\nVehicle ID: " + id +
				"\nModel Year: " + year + 
				"\nBase Price: " + basePrice +
				"\nCommission: " + commission;
		return str;
	}
	public abstract void updateAssets();
	public abstract double getMileage();
	public abstract String goodBusiness();
}
