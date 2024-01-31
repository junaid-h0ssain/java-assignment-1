import java.util.Scanner;
public class SupermarketBillingSystem {
	
	
	public static void main(String[] args) {
		mainMenu();
	}
		
		public static void mainMenu() {
			Scanner s = new Scanner(System.in);
			System.out.println("Main Menu : Choose one.\n"
					+ "1. Amdin.\n"
					+ "2. Staff.\n"
					+ "3. Exit.");
			int c = s.nextInt();
			
			while(true) {
				if(c==1) {
					admin a1 = new admin();
					a1.adminLoginPage();
				}else if(c==2) {
					staff s1 = new staff();
					s1.staffLoginPage();	
				}else if(c==3) {
					System.out.println("Program Exited.");
					System.exit(0);
				}else {
					System.out.println("Invalid Choice.");
				}
			}
	}
}


		
		

