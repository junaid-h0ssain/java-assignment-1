import java.util.Scanner;


	class admin extends inventory implements login{
	
	
	Scanner s = new Scanner(System.in);
	
	public void adminLoginPage() {
		
		while(true) {
			System.out.println("Enter your Admin username : ");
			String username = s.next();
			System.out.println("Enter your password : ");
			String pass = s.next();
			
			if(username.equalsIgnoreCase("Admin")&&pass.equals("password")) {
				while(true) {
					loginMenu();
				}
			}else {
				System.out.println("Wrong username or password");
			}
		}
	}
		
	
	
	void loginMenu() {
		
		int c=0;
		
			do {
			System.out.println("Choose one : \n"
					+ "1. Add product\n"
					+ "2. Update product quantity\n"
					+ "3. Update product price\n"
					+ "4. View products\n"
					+ "5. Exit to Main Menu.");
			c = s.nextInt();
			if(c==1) {
				addProduct();
			}
			else if(c==2){
				updateProductQuantity();
			}
			else if(c==3) {
				updateProductPrice();
			}
			else if(c==4) {
				viewProducts1();
			}
			else if(c==5) {
				mainM();
			}
			else {
				System.out.println("Invalid choice.");
			}
		}while(true);
	}
	private void addProduct() {
		System.out.println("Enter the product name: ");
     	String name = s.next();
        System.out.println("Enter the product quantity: ");
        int quantity = s.nextInt();
        System.out.println("Enter the product retail price: ");
        int price = s.nextInt();

        products[totalItems] = new product(name, quantity, price);
        totalItems++;
        System.out.println(totalItems);
	}
	private void updateProductQuantity() {
		System.out.println("Enter the product name: ");
		String name = s.next();
		System.out.println("Enter the new product quantity: ");
		int quantity = s.nextInt();

		for (int i = 0; i < totalItems; i++) {
        if (products[i].name.equalsIgnoreCase(name)) {
        	products[i].quantity = quantity;
            break;
        	}else {
    			System.out.println("Wrong product code.\nTry again.");
    		}
		}
	}
	
	
	private void updateProductPrice() {
		 System.out.println("Enter the product name: ");
	     String name = s.next();
	     System.out.println("Enter the new product price: ");
	     int price = s.nextInt();

	     for (int i = 0; i < totalItems; i++) {
	          if (products[i].name.equalsIgnoreCase(name)) {
	              products[i].price=price;
	              break;
	          }else {
	    			System.out.println("Wrong product code.\nTry again.");
	    		}
	     }

	}
	
	public void mainM() {
	
		System.out.println("Main Menu : Choose one.\n"
				+ "1. Amdin.\n"
				+ "2. Staff.\n"
				+ "3. Exit.");
		int c = s.nextInt();
			
		while(true) {
			if(c==1) {
				adminLoginPage();
			}else if(c==2) {
				staff s1 = new staff();
				s1.staffLoginPage();
			}else if(c==3) {
				System.out.println("Program Exited.");
				System.exit(0);
			}else {
				System.out.println("Invalid input.");
			}
		}
	}
	
}
