import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack basket = new Stack();
        System.out.println("Catch and eat any of these fruits: " + "('apple','orange','mango','guava')");
        System.out.print("How many fruits would you like to catch? ");
        int num = s.nextInt();
        s.nextLine();//To take the new line in the buffer
        System.out.println("Choose a fruit to catch. Press A, O, M, or G");
        for(int i=1;i<=num;i++){
          /*to loop the statement getting
            the user's input based on how many 
            times he want (minimum:1|maximum:4)*/
            System.out.print("Fruit "+i+" of "+num+": ");
            String fruit = s.nextLine();
            /*user's input will convert into 
             upper cased letter*/
            switch(fruit.toUpperCase()) {
                case "A": //Press A for apple
                    basket.push("apple");
                    break;
                case "O": //Press O for orange
                    basket.push("orange");
                    break;
                case "M": //Press M for mango
                    basket.push("mango");
                    break;
                case "G": //Press G for guava
                    basket.push("guava");
                    break;
                default: 
                  /*If the user didn't input
                    anything or the user input 
                    an unexpected input, then
                    this statement will be printed*/
                    System.out.println(">_<");
            }
        }
        /*then the basket be displayed
          which contains the element(s)
          the the user inputed*/
        System.out.println("Your basket now has: "+basket);
        for(int j=1;j<=num;j++) {
          /*the statement will loop based
            on how many elements that the 
            stack has*/
            System.out.print("Press E to eat a fruit. ");
            String e = s.nextLine();
            /*the input which is e will be
              converted into upper cased letter*/
            if(e.toUpperCase().equals("E")) {
              /*will pop the last element in the
                stack*/
                basket.pop();
                if(basket.size()==0) {
                  /*this statement will print
                    which indicates that the stack
                    is empty*/
                    System.out.println("No more fruits.");
                }
                else {
                /*if the stack is not empty, this'll
                  continue to be printed*/
                System.out.println
                 ("Fruit(s) in the basket: "+basket);
                }
            }
        }
    }
}
