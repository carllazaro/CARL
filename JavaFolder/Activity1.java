package aCT;
import java.util.*;
public class Act1 {
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Greeting g = new Greeting();
		Menu m = new Menu();
		Confirmation c = new Confirmation();
		
		g.greeting();
		System.out.println("ITEMS: ");
		System.out.println("Bag | Clothes");
		System.out.println("Select item name:");
		m.menu();
		c.confirmation();
		
	}
}
class Menu extends Act1{
	public void menu() {
		try {
			String item = s.nextLine();
			if(item.equalsIgnoreCase("Bag")) {
				System.out.println("Okay");
				System.out.println("Small | Medium | Large");
				System.out.print("Enter size: ");
				String size = s.nextLine();
				
				System.out.println("Size: " + size);
				
				int smallPrice = 1300;
				int mediumPrice = 1500;
				int largePrice = 2000;
				
				if(size.equalsIgnoreCase("Small")) {
					System.out.println("Price: " + smallPrice);
					
					System.out.println("Enter quantity: ");
					int quantity = s.nextInt();
					
					int total = quantity * smallPrice;
					
					System.out.println("Total: " + total);
				}
				if(size.equalsIgnoreCase("Medium")) {
					System.out.println("Price: " + mediumPrice);
					
					System.out.println("Enter quantity: ");
					int quantity = s.nextInt();
					
					int total = quantity * mediumPrice;
					
					System.out.println("Total: " + total);
				}
				if(size.equalsIgnoreCase("Large")) {
					System.out.println("Price: " + largePrice);
					
					System.out.println("Enter quantity: ");
					int quantity = s.nextInt();
					
					int total = quantity * largePrice;
					
					System.out.println("Total: " + total);
				}
			}
			if(item.equalsIgnoreCase("Clothes")) {
				System.out.println("Select brand: ");
				System.out.println("Bench | Ralph Lauren | Calvin Klein | Uniqlo");
				System.out.print("Select: ");
				String select = s.nextLine();
				
				int smallPrice = 2500;
				int mediumPrice = 2700;
				int largePrice = 2900;
				
				if(select.equalsIgnoreCase("Bench")) {
					System.out.println("Select size: ");
					System.out.println("Small | Medium | Large");				
					String size = s.nextLine();
					
					if(size.equalsIgnoreCase("Small")) {
						System.out.println("Price: " + smallPrice);
						
						System.out.println("Enter quantity: ");
						int quantity = s.nextInt();
						
						int total = smallPrice * quantity;
						System.out.println("Total: " + total);
					}
					if(size.equalsIgnoreCase("Medium")) {
						System.out.println("Price: " + mediumPrice);
						
						System.out.println("Enter quantity: ");
						int quantity = s.nextInt();
						
						int total = mediumPrice * quantity;
						System.out.println("Total: " + total);
					}
					if(size.equalsIgnoreCase("Large")) {
						System.out.println("Price: " + largePrice);
						
						System.out.println("Enter quantity: ");
						int quantity = s.nextInt();
						
						int total = largePrice * quantity;
						System.out.println("Total: " + total);
					}
				}
			}
		}
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
class Confirmation extends Act1{
	public void confirmation() {
		System.out.print("Confirm payment? ");
		System.out.println("Yes | No");
		String confirm = s.nextLine();
		
		if(confirm.equalsIgnoreCase("Yes")) {
			System.out.println("Thank you for the purchase! Please come again!");
		}
		if(confirm.equalsIgnoreCase("No")) {
			System.out.println("Is there something you need?");
			System.out.println("Please send a message to us: 534-23-223");
		}
	}
}
class Greeting extends Act1{
	public void greeting() {
		System.out.println("WELCOME");
	}
}
