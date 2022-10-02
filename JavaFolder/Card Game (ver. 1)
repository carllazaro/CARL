import java.util.Scanner;
import java.util.Random;
public class MyClass {
  static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
       
        
        System.out.println("          Guess the Card Number");
        System.out.println("             By Carl Lazaro");
        System.out.println("                                 _____");
        System.out.println("     _____                _____ |6    |");
        System.out.println("    |2    | _____        |5    || & & |");
        System.out.println("    |  &  ||3    | _____ | & & || & & |");
        System.out.println("    |     || & & ||4    ||  &  || & & |");
        System.out.println("    |  &  ||     || & & || & & ||____9|");
        System.out.println("    |____Z||  &  ||     ||____S|       ");
        System.out.println("           |____E|| & & |   ");
        System.out.println("                  |____h|              ");
        System.out.println("\n             > • [1] Start");
        System.out.println("             > • [2] Rules");
        System.out.print("Select: ");
        String select = s.nextLine();
        
        if(select.equals("1")) {
            System.out.print("Loading");
            for(int x = 5; x > 0; x--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            difficulty();
        }
        else if(select.equals("2")) {
          System.out.println("here are the rules:");
          System.out.println("1.\n2.\n3.\n4.\n5.");
          System.out.print("< Back: ");
          String back = s.nextLine();
          
          if(back.equals("<")) {
            main(null);
          }
        }
    }
    public static void difficulty() throws InterruptedException {
        System.out.println("\n----------------------------------------");
        System.out.println("SELECT DIFFICULTY:");
        System.out.println("[1] Rookie\n[2] Pro\n[3] Veteran\n[?] Details");
        System.out.print("Select: ");
        String select = s.nextLine();
        
        System.out.print("Setting up the table");
        for(int x = 5; x > 0; x--) {
          System.out.print(".");
          Thread.sleep(1000);
        }
        if(select.equals("1")) {
            rookie();
        }
        if(select.equals("2")) {
            pro();
        }
        if(select.equals("3")) {
            veteran();
        }
        if(select.equals("?")) {
            
        }
        
    }
    public static void rookie() throws InterruptedException {
        Random rnd = new Random();
        int capital = 1000;
        int minimum = 1;
        int maximum = 10;
        System.out.println("\n----------------------------------------");
        System.out.println("\nCapital: " + (Math.round(capital)));
        do {
        int bet;
        System.out.println("                  _____ ");
        System.out.println("                 |?    |");
        System.out.println("                 |  &  |");
        System.out.println("                 |     |");
        System.out.println("                 |  &  |");
        System.out.println("                 |____¿|");
        System.out.print("\nGuess the number: ");
        int guess = s.nextInt();
        System.out.print("Place your bet: ");
        bet = s.nextInt();
        
        int randomNumber = rnd.nextInt(maximum - minimum + 1) + minimum;
        
        if((guess == randomNumber) && (randomNumber > 9)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            //System.out.println("\n\n             ---> " + randomNumber + " <---");
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "   |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |___" + randomNumber + "|");
            System.out.println("\n               You got it.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital +=(bet*2)));
            
        }
        if((guess == randomNumber) && (randomNumber < 10)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            //System.out.println("\n\n             ---> " + randomNumber + " <---");
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "    |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |____" + randomNumber + "|");
            System.out.println("\n               You got it.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital +=(bet*2)));
            
        }
        if((guess != randomNumber) && (randomNumber < 10)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "    |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |____" + randomNumber + "|");
            System.out.println("\n             Sorry. Wrong.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital -=bet));
            
            if(capital < 1) {
                System.out.print("\n              ");
                for(int a = 1; a > 0; a--) {
                    System.out.print("G");
                    Thread.sleep(500);
                    for(int b = 1; b > 0; b--) {
                    System.out.print("A");
                    Thread.sleep(500);
                    for(int c = 1; c > 0; c--) {
                    System.out.print("M");
                    Thread.sleep(500);
                    for(int d = 1; d > 0; d--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int e = 1; e > 0; e--) {
                    System.out.print(" ");
                    Thread.sleep(500);
                    for(int f = 1; f > 0; f--) {
                    System.out.print("O");
                    Thread.sleep(500);
                    for(int g = 1; g > 0; g--) {
                    System.out.print("V");
                    Thread.sleep(500);
                    for(int h = 1; h > 0; h--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int i = 1; i > 0; i--) {
                    System.out.print("R");
                    Thread.sleep(500);
                    System.exit(0);
                }
                }
                }
                }
                }
                }
                }
                }
                }
            }
        }
        if((guess != randomNumber) && (randomNumber > 9)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "   |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |___" + randomNumber + "|");
            System.out.println("\n             Sorry. Wrong.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital -=bet));
            
            
            if(capital < 1) {
                System.out.print("\n              ");
                for(int a = 1; a > 0; a--) {
                    System.out.print("G");
                    Thread.sleep(500);
                    for(int b = 1; b > 0; b--) {
                    System.out.print("A");
                    Thread.sleep(500);
                    for(int c = 1; c > 0; c--) {
                    System.out.print("M");
                    Thread.sleep(500);
                    for(int d = 1; d > 0; d--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int e = 1; e > 0; e--) {
                    System.out.print(" ");
                    Thread.sleep(500);
                    for(int f = 1; f > 0; f--) {
                    System.out.print("O");
                    Thread.sleep(500);
                    for(int g = 1; g > 0; g--) {
                    System.out.print("V");
                    Thread.sleep(500);
                    for(int h = 1; h > 0; h--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int i = 1; i > 0; i--) {
                    System.out.print("R");
                    Thread.sleep(500);
                    System.exit(0);
                }
                }
                }
                }
                }
                }
                }
                }
                }
            }
            }
        }
        while(true);
    }
    public static void pro() throws InterruptedException {
        Random rnd = new Random();
        int capital = 1300;
        int minimum = 1;
        int maximum = 16;
        System.out.println("\n----------------------------------------");
        System.out.println("\nCapital: " + (Math.round(capital)));
        do {
        int bet;
        System.out.println("                  _____ ");
        System.out.println("                 |?    |");
        System.out.println("                 |  &  |");
        System.out.println("                 |     |");
        System.out.println("                 |  &  |");
        System.out.println("                 |____¿|");
        System.out.print("\nGuess the number: ");
        int guess = s.nextInt();
        System.out.print("Place your bet: ");
        bet = s.nextInt();
        
        int randomNumber = rnd.nextInt(maximum - minimum + 1) + minimum;
        
        if((guess == randomNumber) && (randomNumber > 9)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            //System.out.println("\n\n             ---> " + randomNumber + " <---");
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "   |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |___" + randomNumber + "|");
            System.out.println("\n               You got it.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital +=(bet*3)));
            
        }
        if((guess == randomNumber) && (randomNumber < 10)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            //System.out.println("\n\n             ---> " + randomNumber + " <---");
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "    |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |____" + randomNumber + "|");
            System.out.println("\n               You got it.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital +=(bet*3)));
            
        }
        if((guess != randomNumber) && (randomNumber < 10)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "    |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |____" + randomNumber + "|");
            System.out.println("\n             Sorry. Wrong.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital -=bet));
            
            if(capital < 1) {
                System.out.print("\n              ");
                for(int a = 1; a > 0; a--) {
                    System.out.print("G");
                    Thread.sleep(500);
                    for(int b = 1; b > 0; b--) {
                    System.out.print("A");
                    Thread.sleep(500);
                    for(int c = 1; c > 0; c--) {
                    System.out.print("M");
                    Thread.sleep(500);
                    for(int d = 1; d > 0; d--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int e = 1; e > 0; e--) {
                    System.out.print(" ");
                    Thread.sleep(500);
                    for(int f = 1; f > 0; f--) {
                    System.out.print("O");
                    Thread.sleep(500);
                    for(int g = 1; g > 0; g--) {
                    System.out.print("V");
                    Thread.sleep(500);
                    for(int h = 1; h > 0; h--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int i = 1; i > 0; i--) {
                    System.out.print("R");
                    Thread.sleep(500);
                    System.exit(0);
                }
                }
                }
                }
                }
                }
                }
                }
                }
            }
        }
        if((guess != randomNumber) && (randomNumber > 9)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "   |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |___" + randomNumber + "|");
            System.out.println("\n             Sorry. Wrong.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital -=bet));
            
            
            if(capital < 1) {
                System.out.print("\n              ");
                for(int a = 1; a > 0; a--) {
                    System.out.print("G");
                    Thread.sleep(500);
                    for(int b = 1; b > 0; b--) {
                    System.out.print("A");
                    Thread.sleep(500);
                    for(int c = 1; c > 0; c--) {
                    System.out.print("M");
                    Thread.sleep(500);
                    for(int d = 1; d > 0; d--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int e = 1; e > 0; e--) {
                    System.out.print(" ");
                    Thread.sleep(500);
                    for(int f = 1; f > 0; f--) {
                    System.out.print("O");
                    Thread.sleep(500);
                    for(int g = 1; g > 0; g--) {
                    System.out.print("V");
                    Thread.sleep(500);
                    for(int h = 1; h > 0; h--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int i = 1; i > 0; i--) {
                    System.out.print("R");
                    Thread.sleep(500);
                    System.exit(0);
                }
                }
                }
                }
                }
                }
                }
                }
                }
            }
            }
        }
        while(true);
    }
    public static void veteran() throws InterruptedException {
        Random rnd = new Random();
        int capital = 900;
        int minimum = 1;
        int maximum = 25;
        System.out.println("\n----------------------------------------");
        System.out.println("\nCapital: " + (Math.round(capital)));
        do {
        int bet;
        System.out.println("                  _____ ");
        System.out.println("                 |?    |");
        System.out.println("                 |  &  |");
        System.out.println("                 |     |");
        System.out.println("                 |  &  |");
        System.out.println("                 |____¿|");
        System.out.print("\nGuess the number: ");
        int guess = s.nextInt();
        System.out.print("Place your bet: ");
        bet = s.nextInt();
        
        int randomNumber = rnd.nextInt(maximum - minimum + 1) + minimum;
        
        if((guess == randomNumber) && (randomNumber > 9)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            //System.out.println("\n\n             ---> " + randomNumber + " <---");
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "   |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |___" + randomNumber + "|");
            System.out.println("\n               You got it.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital +=(bet*15)));
            
        }
        if((guess == randomNumber) && (randomNumber < 10)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            //System.out.println("\n\n             ---> " + randomNumber + " <---");
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "    |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |____" + randomNumber + "|");
            System.out.println("\n               You got it.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital +=(bet*15)));
            
        }
        if((guess != randomNumber) && (randomNumber < 10)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "    |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |____" + randomNumber + "|");
            System.out.println("\n             Sorry. Wrong.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital -=(bet * 10)));
            
            if(capital < 1) {
                System.out.print("\n              ");
                for(int a = 1; a > 0; a--) {
                    System.out.print("G");
                    Thread.sleep(500);
                    for(int b = 1; b > 0; b--) {
                    System.out.print("A");
                    Thread.sleep(500);
                    for(int c = 1; c > 0; c--) {
                    System.out.print("M");
                    Thread.sleep(500);
                    for(int d = 1; d > 0; d--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int e = 1; e > 0; e--) {
                    System.out.print(" ");
                    Thread.sleep(500);
                    for(int f = 1; f > 0; f--) {
                    System.out.print("O");
                    Thread.sleep(500);
                    for(int g = 1; g > 0; g--) {
                    System.out.print("V");
                    Thread.sleep(500);
                    for(int h = 1; h > 0; h--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int i = 1; i > 0; i--) {
                    System.out.print("R");
                    Thread.sleep(500);
                    System.exit(0);
                }
                }
                }
                }
                }
                }
                }
                }
                }
            }
        }
        if((guess != randomNumber) && (randomNumber > 9)) {
            System.out.print("\n        Revealing the number");
            for(int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println("\n                  _____ ");
            System.out.println("                 |" + randomNumber + "   |");
            System.out.println("                 |  &  |");
            System.out.println("                 |     |");
            System.out.println("                 |  &  |");
            System.out.println("                 |___" + randomNumber + "|");
            System.out.println("\n             Sorry. Wrong.");
            System.out.println("----------------------------------------");
            System.out.println("\nCapital: " + (capital -=(bet * 10)));
            
            
            if(capital < 1) {
                System.out.print("\n              ");
                for(int a = 1; a > 0; a--) {
                    System.out.print("G");
                    Thread.sleep(500);
                    for(int b = 1; b > 0; b--) {
                    System.out.print("A");
                    Thread.sleep(500);
                    for(int c = 1; c > 0; c--) {
                    System.out.print("M");
                    Thread.sleep(500);
                    for(int d = 1; d > 0; d--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int e = 1; e > 0; e--) {
                    System.out.print(" ");
                    Thread.sleep(500);
                    for(int f = 1; f > 0; f--) {
                    System.out.print("O");
                    Thread.sleep(500);
                    for(int g = 1; g > 0; g--) {
                    System.out.print("V");
                    Thread.sleep(500);
                    for(int h = 1; h > 0; h--) {
                    System.out.print("E");
                    Thread.sleep(500);
                    for(int i = 1; i > 0; i--) {
                    System.out.print("R");
                    Thread.sleep(500);
                    System.exit(0);
                }
                }
                }
                }
                }
                }
                }
                }
                }
            }
            }
        }
        while(true);
    }
}
