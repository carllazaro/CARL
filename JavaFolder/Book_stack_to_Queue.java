//imports
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Book_StackToQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<String>bookStack = new Stack<>();
        Queue<String>bookQueue = new LinkedList<>();
        System.out.println("Enter four book titles.");
        for(int i=1;i<=4;i++) {
            /*
            the incrementation of i corresponds
            the book number
            */
            System.out.print("Book "+i+": ");
            String bookTitle = s.nextLine();//Stores user input (book title)
            bookStack.push(bookTitle);//push the input to the stack
        }
        //System.out.println(bookStack);
        for(int j=0;j<4;j++) {
            /*
            as the elements in the Stack (bookStack) popped with the use of pop() method,
            it will be added to the Queue (bookQueue) with the use of offer() method
            */
            bookQueue.offer(bookStack.pop());
        }
        //the, the new order of the book will be printed (Queue format)
        System.out.println("New order of books:\n"+bookQueue);
        System.exit(0);
    }
}
