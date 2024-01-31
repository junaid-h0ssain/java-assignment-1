
public class inventory {

	public static product[] products = new product[100];
	public static int totalItems = 0;
	
	public void viewProducts() {
		for(int i=0;i<totalItems;i++) {	
			System.out.println("\nName of the item: "+products[i].name+"\n\nQuantity: "+ products[i].quantity +"\n\nPrice: "+ products[i].price+"\n");
		}      	
	}
	
	public void viewProducts1() {
		System.out.println("Product Name | Quantity | Retail Price\n");
		for(int i=0;i<totalItems;i++) {	
			System.out.println(products[i].name+" | "+ products[i].quantity +" | "+ products[i].price+"\n");
		}      	
	}
}
