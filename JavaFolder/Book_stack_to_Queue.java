import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Book_stack_to_Queue {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      Stack<String> book_stack = new Stack<>();
      Queue<String> book_queue = new LinkedList<>();
      System.out.println("Enter four book titles");
      for(int i=1;i<=4;i++) {
          System.out.print("Book " + i + ": ");
          String book = s.nextLine();
          book_stack.push(book);
      }
      for(int j=0;j<=book_stack.size();j++) {
          book_queue.offer(book_stack.pop());
      }
      System.out.println("New order of books:");
      System.out.println(book_queue);
    }
}
