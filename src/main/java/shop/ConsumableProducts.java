package shop;

/**
 * Created by Goodwin Chua on 2/18/2016.
 */
public class ConsumableProducts extends Product {

	private double expires;

	public ConsumableProducts(int productID, String productName, double cost, int quantity, double expires) {
		super(productID, productName, cost, quantity);
		this.expires = expires;
	}

	public double getExpires() {
		return expires;
	}

	public void setExpires(double expires) {
		this.expires = expires;
	}


	@Override
	public double getCost() {
		return super.getCost() - (expires * 3);
	}

	@Override
	public String getProductName() {
		return super.getProductName() + " (Expires: " + expires + " day)";
	}
}
