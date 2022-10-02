//Mutual recursion
import java.util.Scanner;
public class MyClass {
    static boolean is_even(int num) {
        if(num == 0) {
            return true;
        }
        else {
            return is_odd(num - 1);
        }
    }
    static boolean is_odd(int num) {
        if(num == 0) {
            return false;
        }
        else {
            return is_even(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        
        if(is_even(num)) {
            System.out.println(num + " is an even number.");
        }
        else {
            System.out.println(num + " is an odd number.");
        }
    }
}
