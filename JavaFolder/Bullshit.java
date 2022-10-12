import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ENTER;
        String name;
        //Introduction
        String Line = "________________________________________________";
        System.out.print("----Press ENTER to continue dialogue----");
        ENTER = s.nextLine();
        System.out.print("\nHere are the RULES in playing this game...");
        ENTER = s.nextLine();
        System.out.print("Wait until each dialogue is done...");
        ENTER = s.nextLine();
        System.out.print("After the dialogue ends, you can now press ENTER key, which you can find in your keyboard.");
        ENTER = s.nextLine();
        System.out.print("Got it? Press ENTER if you got it.");
        ENTER = s.nextLine();
        
        System.out.print("Okay you got it! :)");
        ENTER = s.nextLine();
        
        //Phase 1 dialogue
        System.out.println("\n" + Line);
        System.out.print("\nStranger: Hello?");
        ENTER = s.nextLine();
        System.out.print("\nStranger: Hello!?");
        ENTER = s.nextLine();
        System.out.print("\nStranger: Is anybody there?!");
        ENTER = s.nextLine();
        System.out.print("\nStranger: Please!");
        ENTER = s.nextLine();
        System.out.print("\nStranger: Please!!!");
        ENTER = s.nextLine();
        System.out.print("\nStranger: If there is someone out there....");
        ENTER = s.nextLine();
        System.out.print("\nStranger: can you please respond?");
        ENTER = s.nextLine();
        
        //Choices
        String Yes = "Yes";
        String No = "No";
        
        //Narrator's question
        System.out.print("\n" + Line + "\n" + "Would you like to respond?");
        System.out.println("\n" + Yes + " or " + No);
        System.out.print("ENTER YOUR CHOICE: ");
        String response = s.nextLine();
        
        //Situation if the user select YES
        if(response.contains("Yes")) {
            System.out.println(Line);
            System.out.print("\nHello!");
            ENTER = s.nextLine();
            System.out.print("\nStranger: Finally!");
            ENTER = s.nextLine();
            System.out.print("\nStranger: Can you please help me get out of here?");
            ENTER = s.nextLine();
            System.out.print("\nSure");
            ENTER = s.nextLine();
            System.out.print("\nStranger: That's great!");
            ENTER = s.nextLine();
            System.out.println(Line);
            System.out.print("You helped the Stranger");
            ENTER = s.nextLine();
            System.out.println(Line);
            System.out.print("\nStranger: Hhhhhh");
            ENTER = s.nextLine();
            System.out.print("\nStranger: Finally, I got out of there");
            ENTER = s.nextLine();
            System.out.print("\nStranger: Thanks for helping me.");
            ENTER = s.nextLine();
            
            System.out.print("\n.....");
            ENTER = s.nextLine();
            
            System.out.println("\nStranger: You don't look familiar, so you're not from here.");
            ENTER = s.nextLine();
            System.out.println("\nStranger: What's your name?");
            System.out.print("\nENTER YOUR NAME: ");
            name = s.nextLine();
            
            System.out.print("\nStranger: So you're " + name);
            ENTER = s.nextLine();
            
            System.out.print("\nStranger: Again, thanks for helping me.");
            ENTER = s.nextLine();
    
            //Situation if the user select NO
        } else if(response.contains("No")) {
            System.out.println(Line);
            System.out.println("\n(You chose not to respond)\n.....");
            ENTER = s.nextLine();
            
            System.out.println("Stranger: I know there is someone out there!");
            ENTER = s.nextLine();
            System.out.println(".....");
            ENTER = s.nextLine();
            System.out.println("........");
            ENTER = s.nextLine();
            System.out.println(".........");
            ENTER = s.nextLine();
            System.out.println("Stranger: Dang it!");
            ENTER = s.nextLine();
            System.out.println("Stranger: Fine...");
            ENTER = s.nextLine();
            System.out.println("Stranger: I'll do it myself");
            ENTER = s.nextLine();
            
            System.out.println("The Stranger proceeds to climb.");
            ENTER = s.nextLine();
            System.out.println("Then the rock that the Stranger is climbing broke.");
            ENTER = s.nextLine();
            System.out.println("The Stranger seems struggling");
            ENTER = s.nextLine();
            
            System.out.print(Line + "\n" + "Would you like to help the stranger this time?");
            System.out.println("\n" + Yes + " or " + No);
            System.out.print("ENTER YOUR CHOICE: ");
            response = s.nextLine();
            
            //Situation if the user chose to help the Stranger
            if(response.contains("Yes")) {
                System.out.println("This time....You chose to help the Stranger...");
                ENTER = s.nextLine();
                System.out.println("You can't help the Stranger without using anything.");
                ENTER = s.nextLine();
                System.out.println("(Take a look what's inside your bag?)");
                System.out.println(Yes + " or " + No);
                String Bag = s.nextLine();
                
                String rope = "rope";
                String wood = "wood";
                
                if(Bag.contains("Yes")) {
                    System.out.println("Searching through your bag....");
                    ENTER = s.nextLine();
                    System.out.println("You only have a " + rope + " and a " + wood);
                    System.out.println("Which one do you want to use?");
                    System.out.print("ENTER YOUR CHOICE: ");
                    String wood_or_rope = s.nextLine();
                    
                    if(wood_or_rope.contains("rope")) {
                        System.out.println("You chose the rope.");
                        ENTER = s.nextLine();
                        System.out.println("Do you want to use the rope?");
                        System.out.println(Yes + " or " + No);
                        System.out.print("ENTER YOUR CHOICE: ");
                        response = s.nextLine();
                        
                        if(response.contains("Yes")) {
                            System.out.println("You use the rope....");
                        }
                        
                    }
                    
                }
                
            //Situation if the user chose NOT to help the Stranger
            }else if(response.contains("No")) {
                System.out.println("You chose not to help the Stranger...");
            }
            
        }
    }
}
