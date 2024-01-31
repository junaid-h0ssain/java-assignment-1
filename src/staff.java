import java.util.Scanner;

public class staff extends admin {
	Scanner s = new Scanner(System.in);
	
	String username;
	String pass;
	public void staffLoginPage() {
		while(true) {
			System.out.println("Enter your Staff username : ");
			username = s.next();
			System.out.println("Enter your password : ");
			pass = s.next();
			menu();
		}
	}
			
	void menu() {
		if(username.equalsIgnoreCase("Staff")&&pass.equals("password")) {
			while(true) {
				System.out.println("Staff Menu : Choose one.\n"
						+ "1. Billing Menu\n"
						+ "2. View Inventory\n"
						+ "3. Exit to Main Menu.");
				int c = s.nextInt();
				if(c==1) {
					billingMenu();
				}else if(c==2) {
					viewProducts1();
				}
				else if(c==3) {
					mainM();
				}else {
					System.out.println("Invalid Choice.");
				}
			}
		}else {
			System.out.println("Wrong username or password");
		}
	}
			
	int totalQuantity = 0;
	double totalPrice = 0;
	void billingMenu() {
		while(true) {
			System.out.println("Enter item name or type "+"\"fin\""+" to exit to Staff Menu : ");
	        String itemName = s.next();
	        for(int i=0;i<totalItems;i++) {
	        	if (itemName.equalsIgnoreCase("fin")) {
		            menu();
		        }else if(itemName.equalsIgnoreCase(products[i].name)) {
		        	System.out.println("Enter item quantity: ");
			        int itemQuantity = s.nextInt();
			        totalQuantity=itemQuantity;
			        if(totalQuantity>products[i].quantity) {
			        	System.out.println("Not Enough Inventory.");
			        }else {
			        	products[i].quantity-=totalQuantity;
				        totalPrice=products[i].price;					   	
					    System.out.println("Total bill : "+bill(totalQuantity,totalPrice));
			        }			        
		        }else {
		        	System.out.println("Product not available.");
		        }
	        }	        
		}
	}
	
	double bill(int itemQ,double itemP) {
		return itemQ*itemP;
	}
	
}
