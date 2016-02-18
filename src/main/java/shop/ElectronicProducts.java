package shop;

/**
 * Created by Goodwin Chua on 2/18/2016.
 */
public class ElectronicProducts extends Product {

	private double powerUsage;

	public ElectronicProducts(int productID, String productName, double cost, int quantity, double powerUsage) {
		super(productID, productName, cost, quantity);
		this.powerUsage = powerUsage;
	}

	public double getPowerUsage() {
		return powerUsage;
	}

	public void setPowerUsage(double powerUsage) {
		this.powerUsage = powerUsage;
	}

	@Override
	public double getCost() {
		return super.getCost() * powerUsage;
	}

	@Override
	public String getProductName() {
		return super.getProductName() + " (PU: " + powerUsage + ")";
	}
}
