import java.util.*;
import java.util.Random;
public class MyClass {
    public static void main(String args[]) throws InterruptedException {
    Scanner s = new Scanner(System.in);
      
      System.out.println("         Welcome to КАРТОЧНАЯ БИТВА");
      System.out.println("            Made by Carl Lazaro");
      System.out.println("\n [1] Start | [2] Bank | [3] Shop | [4] Quit");
      System.out.print("                 Select: ");
      String select = s.nextLine();
      
      if(select.equals("1")) {
          start();
      }
    }
    public static void start() throws InterruptedException {
     System.out.print("\n           Setting up the table");
     for(int x = 3; x > 0; x--) {
         Thread.sleep(50);
         System.out.print(".");
        
     }
     System.out.print("\n           Shuffling the cards");
     for(int y = 3; y >0; y--) {
         Thread.sleep(50);
         System.out.print(".");
     }
     System.out.println();
     stack();
    }
    public static void stack() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        double money = 1000;
         do {
        	 String stackOfCard = "\n                  ╔════════════╗" +
                     "\n                 ╔║░░░░░░░░░░░░║" +
                    "\n                ╔║║░░░░░░░░░░░░║" +
                   "\n               ╔║║║░░░░░░░░░░░░║" +
                  "\n               ║║║║░░░░░░░░░░░░║" +
                 "\n               ║║║║░░░░░░░░░░░░║" +
                "\n               ║║║║░░░░░░░░░░░░║" +
                "\n               ║║║║░░░░░░░░░░░░║" +
                "\n               ║║║║░░░░░░░░░░░░║" +
                "\n               ║║║╚════════════╝" +
                "\n               ║║╚════════════╝" +
                "\n               ║╚════════════╝" +
                "\n               ╚════════════╝";
        	 System.out.println("\n________________[Pick a card]________________");
        	 System.out.println(stackOfCard);
        	 System.out.println("Money: " + (Math.round(money)) + "\n");
             System.out.print("> Pick: ");
             String pick = input.nextLine();
             
             if(pick.equals(">")) {
                 //for the dealer
                 int min = 1;
                 int max = 9;
                 int randomNumber = rnd.nextInt(max - min + 1) + min;
                 String cardType[] = {"♣", "♠", "♥", "♦"};
                 
                 int symbol = rnd.nextInt(cardType.length);

                 //for the user
                 int min1 = 1;
                 int max1 = 9;
                 int randomNumber1 = rnd.nextInt(max1 - min1 + 1) + min1;
                 String cardType1[] = {"♣", "♠", "♥", "♦"};
                 
                 int symbol1 = rnd.nextInt(cardType1.length);
                          
                 //table
                 String table = 
                          "\n    [ Dealer's card ]" +
                          "\n\n     ╔════════════╗" + "        ╔════════════╗" +
                          "\n     ║░░░░░░░░░░░░║" + "        ║" + randomNumber1 + "           ║" +
                          "\n     ║░░░░░░░░░░░░║" + "        ║            ║" +
                          "\n     ║░░░░░░░░░░░░║" + "        ║            ║" +
                          "\n     ║░░░░░░░░░░░░║" + "        ║     " + cardType1[symbol1] + "      ║" +
                          "\n     ║░░░░░░░░░░░░║" + "        ║            ║" +
                          "\n     ║░░░░░░░░░░░░║" + "        ║            ║" +
                          "\n     ║░░░░░░░░░░░░║" + "        ║            ║" +
                          "\n     ║░░░░░░░░░░░░║" + "        ║           " + randomNumber1 +"║" +
                          "\n     ╚════════════╝" + "        ╚════════════╝" +
                          "\n\n                           [ Your card ]";
                 
                 System.out.println("_______________[Decision phase]______________");
                 System.out.println(table);
                 System.out.println("\n     (f) Fight | (p) Pick | (ff) Forfeit");
                 System.out.print("     Select: ");
                 String select = input.nextLine();
                 String revealCards;
                 
                 //If the user wins
                 String revealUserWins = 
                          "\n    [ Dealer's card ]" +
                          "\n\n     ╔════════════╗" + "        ╔════════════╗" +
                          "\n     ║" + randomNumber + "           ║"  + "        ║" + randomNumber1 + "           ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║     " + cardType[symbol] + "      ║" + "        ║     " + cardType1[symbol1] + "      ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║           " + randomNumber +"║" + "        ║           " + randomNumber1 +"║" +
                          "\n     ╚════════════╝" + "        ╚════════════╝" +
                          "\n\n                           [ Your card ] Winner";
                 
                 //If the dealer wins
                 String revealDealerWins = 
                          "\n    [ Dealer's card ] Winner" +
                          "\n\n     ╔════════════╗" + "        ╔════════════╗" +
                          "\n     ║" + randomNumber + "           ║"  + "        ║" + randomNumber1 + "           ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║     " + cardType[symbol] + "      ║" + "        ║     " + cardType1[symbol1] + "      ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║           " + randomNumber +"║" + "        ║           " + randomNumber1 +"║" +
                          "\n     ╚════════════╝" + "        ╚════════════╝" +
                          "\n\n                           [ Your card ]";
                          
                 //If draw
                 String revealDraw = 
                          "\n    [ Dealer's card ]" +
                          "\n\n     ╔════════════╗" + "        ╔════════════╗" +
                          "\n     ║" + randomNumber + "           ║"  + "        ║" + randomNumber1 + "           ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║     " + cardType[symbol] + "      ║" + "        ║     " + cardType1[symbol1] + "      ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║            ║" + "        ║            ║" +
                          "\n     ║           " + randomNumber +"║" + "        ║           " + randomNumber1 +"║" +
                          "\n     ╚════════════╝" + "        ╚════════════╝" +
                          "\n\n                           [ Your card ]" + 
                          "\n\n                     Draw";
                          
                 if(select.equals("f")) {
                     System.out.print("Place your bet: ");
                     int bet = s.nextInt();
                     
                     if(bet < 101) {
                         System.out.println("\n                      ㊗");
                         System.out.print("\n> Reveal cards: ");
                         revealCards = input.nextLine();
                         
                         if(revealCards.equals(">")) {
                             System.out.print("\n           Revealing the cards");
                             for(int x = 3; x > 0; x--) {
                             System.out.print(".");
                             Thread.sleep(500);
                             }
                             System.out.println("\n\n________________[Reveal phase]_______________");
                             
                             if(randomNumber1 > randomNumber) {
                                 System.out.println(revealUserWins);
                                 System.out.println("Money: " + (Math.round(money +=(bet*2))));
                             }
                             if(randomNumber1 < randomNumber) {
                                 System.out.println(revealDealerWins);
                                 System.out.println("Money: " + (Math.round(money -=bet)));
                             }
                             if(randomNumber1 == randomNumber) {
                                 System.out.println(revealDraw);
                             }
                         }
                         
                     }
                     if((bet < 301) && (bet > 100)) {
                         System.out.println("\n                    ㊗㊗" +
                         "\n                     ㊗");
                         System.out.print("\n> Reveal cards: ");
                         revealCards = input.nextLine();
                         
                         if(revealCards.equals(">")) {
                             System.out.print("\n           Revealing the cards");
                             for(int x = 3; x > 0; x--) {
                             System.out.print(".");
                             Thread.sleep(500);
                             }
                             System.out.println("\n\n________________[Reveal phase]_______________");
                             
                             if(randomNumber1 > randomNumber) {
                                 System.out.println(revealUserWins);
                                 System.out.println("Money: " + (Math.round(money +=(bet*2))));
                             }
                             if(randomNumber1 < randomNumber) {
                                 System.out.println(revealDealerWins);
                                 System.out.println("Money: " + (Math.round(money -=bet)));
                             }
                             if(randomNumber1 == randomNumber) {
                                 System.out.println(revealDraw);
                             }
                         }
                     }
                     if((bet < 501) && (bet > 300)) {
                         System.out.println("\n                    ㊗㊗" +
                         "\n                     ㊗㊗" +
                         "\n                   ㊗");
                         System.out.print("\n> Reveal cards: ");
                         revealCards = input.nextLine();
                         if(revealCards.equals(">")) {
                             System.out.print("\n           Revealing the cards");
                             for(int x = 3; x > 0; x--) {
                             System.out.print(".");
                             Thread.sleep(500);
                             }
                             System.out.println("\n\n________________[Reveal phase]_______________");
                             
                             if(randomNumber1 > randomNumber) {
                                 System.out.println(revealUserWins);
                                 System.out.println("Money: " + (Math.round(money +=(bet*2))));
                             }
                             if(randomNumber1 < randomNumber) {
                                 System.out.println(revealDealerWins);
                                 System.out.println("Money: " + (Math.round(money -=bet)));
                             }
                             if(randomNumber1 == randomNumber) {
                                 System.out.println(revealDraw);
                             }
                         }
                     }
                     if((bet < 701) && (bet > 500)) {
                         System.out.println("\n                   ㊗㊗ ㊗" +
                         "\n                 ㊗ ㊗㊗" +
                         "\n                     ㊗");
                         System.out.print("\n> Reveal cards: ");
                         revealCards = input.nextLine();
                         if(revealCards.equals(">")) {
                             System.out.print("\n           Revealing the cards");
                             for(int x = 3; x > 0; x--) {
                             System.out.print(".");
                             Thread.sleep(500);
                             }
                             System.out.println("\n\n________________[Reveal phase]_______________");
                             
                             if(randomNumber1 > randomNumber) {
                                 System.out.println(revealUserWins);
                                 System.out.println("Money: " + (Math.round(money -=bet)));
                             }
                             if(randomNumber1 < randomNumber) {
                                 System.out.println(revealDealerWins);
                                 System.out.println("Money: " + (money -=bet));
                             }
                             if(randomNumber1 == randomNumber) {
                                 System.out.println(revealDraw);
                             }
                         }
                     }
                     if((bet < 901) && (bet > 700)) {
                         System.out.println("\n                  ㊗㊗ ㊗" +
                         "\n                 ㊗  ㊗ ㊗" +
                         "\n                    ㊗" +
                         "\n                   ㊗  ㊗");
                         System.out.print("\n> Reveal cards: ");
                         revealCards = input.nextLine();
                         if(revealCards.equals(">")) {
                             System.out.print("\n           Revealing the cards");
                             for(int x = 3; x > 0; x--) {
                             System.out.print(".");
                             Thread.sleep(500);
                             }
                             System.out.println("\n\n________________[Reveal phase]_______________");
                             
                             if(randomNumber1 > randomNumber) {
                                 System.out.println(revealUserWins);
                                 System.out.println("Money: " + (Math.round(money +=(bet*2))));
                             }
                             if(randomNumber1 < randomNumber) {
                                 System.out.println(revealDealerWins);
                                 System.out.println("Money: " + (Math.round(money -=bet)));
                             }
                             if(randomNumber1 == randomNumber) {
                                 System.out.println(revealDraw);
                             }
                         }
                     }
                     if((bet < 1001) && (bet > 900)) {
                         System.out.println("\n                  ㊗ ㊗" +
                         "\n                   ㊗ ㊗" +
                         "\n                ㊗  ㊗ ㊗ ㊗" +
                         "\n                    ㊗" +
                         "\n                       ㊗");
                         System.out.print("\n> Reveal cards: ");
                         revealCards = input.nextLine();
                         if(revealCards.equals(">")) {
                             System.out.print("\n           Revealing the cards");
                             for(int x = 3; x > 0; x--) {
                             System.out.print(".");
                             Thread.sleep(500);
                             }
                             System.out.println("\n\n________________[Reveal phase]_______________");
                             
                             if(randomNumber1 > randomNumber) {
                                 System.out.println(revealUserWins);
                                 System.out.println("Money: " + (Math.round(money +=(bet*2))));
                            
                             }
                             if(randomNumber1 < randomNumber) {
                                 System.out.println(revealDealerWins);
                                 System.out.println("Money: " + (Math.round(money -=bet)));
                             }
                             if(randomNumber1 == randomNumber) {
                                 System.out.println(revealDraw);
                             }
                         }
                     }
                     
                 }
             }
         }
         while(true);
    }
}
