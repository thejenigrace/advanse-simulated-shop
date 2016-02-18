package shop;

import java.util.HashMap;

/**
 * Created by Goodwin Chua on 2/18/2016.
 */
public class Store {

	private HashMap<Integer, Product> map;

	public Store(){
		this.map = new HashMap<Integer, Product>();

		ElectronicProducts iphone = new ElectronicProducts(1, "IPhone", 50000, 10, 20);
		ElectronicProducts tablet = new ElectronicProducts(2, "Tablet", 35000, 8, 30);
		ConsumableProducts apple = new ConsumableProducts(3, "Apple", 10, 50, 14);
		ConsumableProducts banana = new ConsumableProducts(4, "Banana", 7, 36, 14);
		ConsumableProducts pear = new ConsumableProducts(5, "Pear", 12, 24, 14);
		GenericProducts table = new GenericProducts(6, "Table", 550, 5);
		GenericProducts chair = new GenericProducts(7, "Chair", 250, 5);

		addItem(iphone);
		addItem(tablet);
		addItem(apple);
		addItem(banana);
		addItem(pear);
		addItem(table);
		addItem(chair);
	}

	public void addItem(Product product){
		this.map.put(product.getProductID(), product);
	}

	public Product purchase(int id, int quantity){
		Product product = this.map.get(id);
		product.decreaseQuantityBy(quantity);
		Product usersCopy = null;
		if ( product instanceof ElectronicProducts ) {
			ElectronicProducts electronicProducts =
				new ElectronicProducts(product.getProductID(), product.getProductName(),
					product.getCost(), quantity, ((ElectronicProducts) product).getPowerUsage());
			usersCopy = electronicProducts;
		} else if ( product instanceof ConsumableProducts ) {
			ConsumableProducts electronicProducts =
					new ConsumableProducts(product.getProductID(), product.getProductName(),
							product.getCost(), quantity, ((ConsumableProducts) product).getExpires());
			usersCopy = electronicProducts;
		} else if ( product instanceof GenericProducts ) {
			GenericProducts electronicProducts =
					new GenericProducts(product.getProductID(), product.getProductName(),
							product.getCost(), quantity);
			usersCopy = electronicProducts;
		}
		return usersCopy;
	}
}
