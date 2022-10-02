import java.util.Scanner;
public class gameHub {
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		//STARTUP
		System.out.println("\n			   Welcome to GameHub\n");
		System.out.println("     			      ▄▀▄     ▄▀▄");
		System.out.println("  			     ▄█░░▀▀▀▀▀░░█▄");
		System.out.println(" 			 ▄▄  █░░░░░░░░░░░█  ▄▄");
		System.out.println("			█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█\n");
		
		Categories c = new Categories();
		
		c.categories();
	}
}
//GAME CATEGORIES OR GENRES
class Categories extends gameHub {
	public void categories() {
		Horrors h = new Horrors();
		System.out.println("CATEGORIES:");
		System.out.println("1. Horror | 2. Action | 3. First-person shooter | 4. Souls");
		System.out.println("\nFAQs");
		System.out.println("a. What is GameHub?");
		System.out.println("b. How to use?");
		System.out.print("\nSelect: ");
		String select = s.nextLine();
		
		if(select.equals("a")) {
			System.out.println("\nWhat is GameHub?");
			System.out.println("GameHub is an authorized platform where you can buy games online.");
			System.out.println("As you can see in the menu, currently, we have four (4) categories; \nHorror, Action,"
					+ " First-person shooter, and Souls. But don't worry, \nwe are updating our game categories"
					+ " and we might expand it in the \nnear future.");
			System.out.print("\n< Back: ");
			String back = s.nextLine();
			
			if(back.equals("<"));
			System.out.println();
			categories();
		}
		if(select.equals("b")) {
			System.out.println("\nHow to use?");
			System.out.println("To use gameHub, you can either select one of the four (4) categories:"
					+ "\nPress 1 to select Horror genre\nPress 2 to select Action genre\nPress 3 to select "
					+ "First-person shooter\nPress 4 to select Souls");
			System.out.print("\n< Back: ");
			String back = s.nextLine();
			
			if(back.equals("<"));
			System.out.println();
			categories();
		}
		if(select.equals("1")) {
			h.horrors();
		}
	}
	//HORROR (GAMES)
	class Horrors {
		public void horrors() {
			Categories c = new Categories();
			System.out.println("\nHorror");
			System.out.println("1. Silent Hill series •••");
			System.out.println("2. Resident Evil series •••");
			System.out.println("3. Outlast 1-2 •••");
			System.out.println("4. Manhunt 1-2 •••");
			System.out.println("Enter a number to select a series ");
			System.out.println("< Go back to main menu");
			System.out.print("Select: ");
			String select1 = s.nextLine();
			
			if(select1.equals("1")) {
				silentHill();		
			}
			if(select1.equals("<")) {
				System.out.println();
				c.categories();
			}
		}
	}
	//SILENT HILL SERIES LIST
	public void silentHill() {
		PaymentMethod p = new PaymentMethod();
		Horrors h = new Horrors();
		System.out.println("\nSILENT HILL SERIES");
		System.out.println("\n1. Silent Hill (1999)");
		System.out.println("2. Silent Hill 2 (2001)");
		System.out.println("3. Silent Hill 3 (2003)");
		System.out.println("4. Silent Hill 4 (2004)");
		System.out.println("5. Silent Hill: Origins (2007)");
		System.out.println("6. Silent Hill: Homecoming (2008)");
		System.out.println("7. Silent Hill: Shattered Memories (2009)");
		System.out.println("8. Silent Hill: Downpour (2012)");
		System.out.println("9. Silent Hill: Book Of Memories (2012)");
		System.out.println("10. Silent Hill: HD Collection (2012)");
		System.out.println("11. P.T. (Silent Hills Playable Teaser - 2014)");
		System.out.println("\nEnter a number to select a game");
		System.out.println("+ About this game");
		System.out.println("< Go back");
		System.out.print("Select: ");
		String select = s.nextLine();
		
		if(select.equals("+")) {
			aboutSilentHill();
		}
		if(select.equals("<")) {
			h.horrors();
		}
		if(select.equals("1")) {
			silentHill1();
		}
		if(select.equals("2")) {
			silentHill2();
		}
	}
	//SILENT HILL 1
	public void silentHill1() {
		System.out.println("\nSilent Hill (1999)");
		System.out.println("Price: 500 Php");
		System.out.println("\nAbout this game:");
		System.out.println("Developer(s): Team Silent");
		System.out.println("Publisher(s): Konami");
		System.out.println("Director(s): Keiichiro Toyama");
		System.out.println("Producer(s): Gozo Kitao");
		System.out.println("Programmer(s): Akihiro Imamura");
		System.out.println("Writer(s): Keiichiro Toyama");
		System.out.println("Composer(s): Akira Yamaoka");
		
		System.out.println("> Purchase game | + Reviews | ? Ask questions | < Go back");
		System.out.print("Select: ");
		String select1 = s.nextLine();
		
		if(select1.equals(">")) {
			purchaseSilentHill1();
		}
		if(select1.equals("<")) {
			silentHill();
		}
		if(select1.equals("+")) {
			reviewsSilentHill1_Part1();
		}
		if(select1.equals("?")) {
			askQuestions_SilentHill1_Part1();
		}
	}
	//SILENT HILL 2
	public void silentHill2() {
		System.out.println("\nSilent Hill 2 (2001)");
		System.out.println("Price: 500 Php");
		System.out.println("\nAbout this game:");
		System.out.println("Developer(s): Team Silent");
		System.out.println("Publisher(s): Konami");
		System.out.println("Director(s): Masashi Tsuboyama");
		System.out.println("Producer(s): Akihiro Imamura");
		System.out.println("Writer(s): Hiroyuki Owaku");
		System.out.println("Composer(s): Akira Yamaoka");
		
		System.out.println("> Purchase game | + Reviews | ? Ask questions | < Go back");
		System.out.print("Select: ");
		String select1 = s.nextLine();
		
		if(select1.equalsIgnoreCase(">")) {
			purchaseSilentHill2();
		}
		if(select1.equalsIgnoreCase("<")) {
			silentHill();
		}
		if(select1.equalsIgnoreCase("+")) {
			reviewsSilentHill2_Part1();
		}
	}
	//SILENT HILL 1 (REVIEWS PART 1)
	public void reviewsSilentHill1_Part1() {
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Positive: ================= 116\nMixed: ====== 6"
				+ "\nNegative: === 3");
		System.out.println("-------------------------------------------------------");
		System.out.println("USER REVIEWS:");
		System.out.println("\ndoodlerman - Jun 9, 2011 - Rate: 10 \nWithout a doubt, the best horror game in existence."
				+ "\nTo this day I've never played anything this frightening \nor uneasy feeling, "
				+ "and I'm a horror game fanatic.");
		
		System.out.println("\nZorrk - Mar 30, 2020 - Rate: 10 \nThat **** game...dammmn."
				+ "\nThat sound of unknown, one of the best horror games. Masterpiece!");
		
		System.out.println("\nDandys1 - Dec 15, 2021 - Rate: 10 \nThis game is just amazing, first Silent Hill game"
				+ "\nis still my favorite entry in the whole series, "
				+ "\nTeam Silent made very artisticly and emotionaly powerful and influentul "
				+ "\ngame that is gonna be forever stuck in my head.");
		
		System.out.println("\nAttackZach - Mar 14, 2012 - Rate: 9 \nThis horror classic sets the stage for future psychological"
				+ "\nvideo games as well as breathing new life into a literally dead genre. "
				+ "\nIt's unique visuals and storyline create an atmosphere that even years "
				+ "\nlater hold up against current video games and is stil just as scary.");
		
		System.out.println("\n< Go back | > Next ");
		System.out.print("Select: ");
		String select = s.nextLine();
		
		if(select.equals("<")) {
			silentHill1();
		}
		if(select.equals(">")) {
			reviewsSilentHill1_Part2();
		}
	}
	//SILENT HILL 1 (QUESTIONS PART 1)
	public void askQuestions_SilentHill1_Part1() {
		System.out.println("\nQUESTIONS ABOUT THIS GAME");
		System.out.println("\nDuckHunter69 - Jan 19, 2014 \nIs this the physical copy of the game?");
		System.out.println("> Reply by GameHub: Yes sir/ma'am, this is the original \nphysical copy of the game "
				+ "which will came all the way from Japan.");
		
		System.out.println("\nPedoMaster - Dec 25, 2010 \nAre you shipping nationwide?");
		System.out.println("> Reply by GameHub: Yes sir/ma'am, we are shipping nationwide "
				+ "\nyou can direct mail us at gameHub@gmail.com so we can assist you. \nThank you!");
		
		System.out.println("\nBeastMaster64 - April 26, 2005 \nIs it the physical copy?");
		System.out.println("> Reply by GameHub: Yes sir/ma'am, it is the physical copy.");
		
		System.out.println("\n? Ask question | < Go back | > Next");
		System.out.print("Select: ");
		String select = s.nextLine();
		
		if(select.equals("?")) {
			System.out.print("Write your question/inquiry: ");
			String question = s.nextLine();
			System.out.println("> Submit question | < Cancel question");
			System.out.print("Select: ");
			String submit_cancel = s.nextLine();
			
			if(submit_cancel.equals(">")) {
				System.out.println("Question submitted. Wait for GameHub moderator's response.");
				System.out.println("We are replying within hours. Thank you!");
				System.out.print("\n< Go back: ");
				String back = s.nextLine();
				
				if(back.equals("<")) {
					askQuestions_SilentHill1_Part1();
				}
			}
		}
		if(select.equals("<")) {
			silentHill1();
		}
		if(select.equals(">")) {
			System.out.println("System under maintenance...");
			System.out.println("Come back soon. Thank you!");
			System.out.println("\n< Go back: ");
			String back = s.nextLine();
			
			if(back.equals("<")) {
				askQuestions_SilentHill1_Part1();
			}
		}
	}
	//SILENT HILL 1 (REVIEWS PART 2)
	public void reviewsSilentHill1_Part2() {
		System.out.println("\nViperSquad - Dec 22, 2005 - Rate: 9 - \nMasterful atmosphere");
		
		System.out.println("\nSMBW - Feb 21, 2020 - Rate: 9 \nНе умирающая классика, лучший хоррор в своем стиле, "
				+ "все последующие части были хуже. \nДизайн, звук, сюжет, персонажи. "
				+ "\nГрафика для своего времени была топовая и выжимала все из ps1.");
		
		System.out.println("\nnonaste - Mar 15, 2019 - Rate: 0 \nThis is 2019. I must be spoiled. "
				+ "\nTrying to play this game is an absolutely aggravating experience. "
				+ "\nThe KB controls are clunky beyond belief. "
				+ "\nI gave up in utter frustration after an hour of trying to move around and defend myself.");
	
		System.out.println("\nSee all 125 Users Reviews");
		System.out.print("< Go back: ");
		String back = s.nextLine();
		
		if(back.equals("<")) {
			reviewsSilentHill1_Part1();
		}
	}
	//SILENT HILL 2 (REVIEWS PART 1)
	public void reviewsSilentHill2_Part1() {
		//Insert a review
		
		System.out.print("\n< Go back: ");
		String back = s.nextLine();
		
		if(back.equals("<")) {
			silentHill1();
		}
	}
	//SILENT HILL 1 (PURCHASE)
	public void purchaseSilentHill1() {
		PaymentMethod p = new PaymentMethod();
		System.out.println("Purchase the game? Yes | No");
		System.out.print("Select: ");
		String purchase = s.nextLine();
		
		if(purchase.equalsIgnoreCase("Yes")) {
			p.payment_method();
		}
		if(purchase.equalsIgnoreCase("No")) {
			silentHill1();
		}
	}
	//SILENT HILL 2 (PURCHASE)
	public void purchaseSilentHill2() {
		PaymentMethod p = new PaymentMethod();
		System.out.println("Purchase the game? Yes | No");
		System.out.print("Select: ");
		String purchase = s.nextLine();
		
		if(purchase.equalsIgnoreCase("Yes")) {
			p.payment_method();
		}
		if(purchase.equalsIgnoreCase("No")) {
			silentHill2();
		}
	}
	//SILENT HILL (ABOUT THE SERIES)
	public void aboutSilentHill() {
		System.out.println("\nSilent Hill is a 1999 survival horror game");
		System.out.println("developed by Team Silent, a group in Konami");
		System.out.println("Computer Entertainment Tokyo, and published by Konami.");
			System.out.println("\nRelease: 		      Platform(s): PlayStation\r\n"
					+ "NA: February 23, 1999\r\n"
					+ "JP: March 4, 1999\r\n"
					+ "EU: July 16, 1999");
			System.out.println("\nWriter(s): Keiichiro Toyama   Developer(s): Team Silent");
			
			System.out.print("\n< Back: ");
			String back = s.nextLine();
			
			if(back.equals("<")) {
			silentHill();
		}
	}
}
//PAYMENT METHODS - CONSISTS OF 4 METHOD OF PAYMENT = PAYAMAYA, VISA, BPI, AND GCASH
class PaymentMethod extends gameHub{
	public void payment_method() {
		PayMaya p = new PayMaya();
		System.out.println("\nSelect Payment method:");
		System.out.println("1. PayMaya");
		System.out.println("2. VISA");
		System.out.println("3. BPI");
		System.out.println("4. Gcash");
		System.out.print("Select: ");
		String select = s.nextLine();
		System.out.println("Redirecting you to PayMaya...");
		System.out.print("Press ENTER to continue");
		String pressEnter = s.nextLine();
		p.paymaya();
	}
}
//PAYMENT METHOD 1 (PAYMAYA)
class PayMaya extends gameHub {
	PaymentMethod p = new PaymentMethod();
	public void paymaya() {
		System.out.println("\nPayMaya");
		System.out.println("Personal Informations");
		System.out.print("First Name: ");
		String fName = s.nextLine();
		System.out.print("Last Name: ");
		String lName = s.nextLine();
		code();
	}
	//7 DIGITS CODE FOR PAYMAYA
	public void code() {
		System.out.print("Enter you seven (7) digits code: ");
		String code = s.nextLine();
		
		if(code.length() == 0) {
			System.out.println("Error! Please enter a code!");
			System.out.println("Try agan? Yes | No");
			System.out.print("Select: ");
			String tryAgain = s.nextLine();
			
			if(tryAgain.equalsIgnoreCase("Yes")) {
				code();
			}
			if(tryAgain.equalsIgnoreCase("No")) {
				System.out.println("Redirecting you back to gameHub...");
				System.out.print("Press ENTER to continue");
				String pressEnter = s.nextLine();
				p.payment_method();
			}
		}
		if(code.length() < 7) {
			System.out.println("Error! You entered a invalid code!");
			System.out.println("Try agan? Yes | No");
			System.out.print("Select: ");
			String tryAgain = s.nextLine();
			
			if(tryAgain.equalsIgnoreCase("Yes")) {
				code();
			}
			if(tryAgain.equalsIgnoreCase("No")) {
				System.out.println("Redirecting you back to GameHub...");
				System.out.print("Press ENTER to continue");
				String pressEnter = s.nextLine();
				p.payment_method();
			}
		}
		if(code.length() > 7) {
			System.out.println("Error! You entered a invalid code!");
			System.out.println("Try agan? Yes | No");
			System.out.print("Select: ");
			String tryAgain = s.nextLine();
			
			if(tryAgain.equalsIgnoreCase("Yes")) {
				code();
			}
			if(tryAgain.equalsIgnoreCase("No")) {
				System.out.println("Redirecting you back to GameHub...");
				System.out.print("Press ENTER to continue");
				String pressEnter = s.nextLine();
				p.payment_method();
			}
		}
		if(code.length() == 7) {
			System.out.println("Confirm payment? Yes | No");
			System.out.print("Select: ");
			String select = s.nextLine();
			
			if(select.equalsIgnoreCase("Yes")) {
				System.out.println("Payment successful");
				System.out.println("Thank you!");
				System.out.println("Redirecting you back to GameHub...");
				System.out.print("Press ENTER to continue");
				String pressEnter = s.nextLine();
				PaymentSuccessful ps = new PaymentSuccessful();
				ps.paymentSuccessful();
			}
		}
	}
}
//PAYMENT SUCCESSFUL MESSAGE
class PaymentSuccessful extends gameHub {
	public void paymentSuccessful() {
		Categories c = new Categories();
		System.out.println("\nYour order is now being placed. Thank you for trusting us!");
		System.out.println("Go back to main menu? Yes | No");
		System.out.print("Select: ");
		String select = s.nextLine();
		
		if(select.equalsIgnoreCase("Yes")) {
			System.out.println();
			c.categories();
		}
		if(select.equalsIgnoreCase("No")) {
			System.out.println("Want some help? email us - gameHub@gmail.com");
			System.out.println("All rights reserved 2022.");
		}
	}
}
