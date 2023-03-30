package carDealer;

public class CarTest {

	public static void main(String[] args) {
		
		Car[] carInventory = new Car[6];
		
		carInventory[0] = new NewCar("N2312", 18000, 2006, 2000, 3000, 2000);
		carInventory[2] = new NewCar("N6467", 43000, 2006, 4000, 6000, 3000);
		carInventory[4] = new NewCar("N0864", 24000, 2007, 1200, 2500, 0);
		
		carInventory[1] = new UsedCar("U3425", 16000, 2003, 400, 40000, 0.15);
		carInventory[3] = new UsedCar("U2347", 8000, 1998, 700, 12000, 0.1);
		carInventory[5] = new UsedCar("U4739", 18000, 2005, 2400, 12000, 0.2);
		
		for (Car car : carInventory) {
			car.updateAssets();
		}
		    System.out.printf("Total assets of the car dealer: $%,.2f\n", Car.getTotalAssets());

		    System.out.printf("\nTotal assets of New Car: $%,.2f\n", NewCar.getTotalAssets());
		    double avgNewCarPrice = NewCar.getTotalAssets() / NewCar.getNumOfNewcar();
		    System.out.printf("Average car price of New Car: $%,.2f\n", avgNewCarPrice);

		    System.out.printf("\nTotal assets of Used Car: $%,.2f\n", UsedCar.getTotalAssets());
		    double avgUsedCarPrice = UsedCar.getTotalAssets() / UsedCar.getNumOfUsedCar();
		    System.out.printf("Average car price of Used Car: $%,.2f\n", avgUsedCarPrice);

		    System.out.println("\nInventory Details: ");
	        for (Car car : carInventory) {
	            System.out.println(car);
	            System.out.println("------------------------------");
	        }
	}
}