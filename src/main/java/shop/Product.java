package shop;

/**
 * Created by Goodwin Chua on 2/18/2016.
 */
public abstract class Product {

	protected int productID;
	protected String productName;
	protected double cost;
	protected int quantity;

	public Product(int productID, String productName, double cost, int quantity) {
		this.productID = productID;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void decreaseQuantityBy(int quantity){
		if ( this.quantity < quantity ) {
			throw new NullPointerException("Not enough " + productName);
		} else {
			this.quantity -= quantity;
		}
	}
}
