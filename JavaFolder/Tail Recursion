//Tail recursion
import java.util.Scanner;
public class MyClass {
    static int find_gcd(int n1, int n2)  {
        if(n1 % n2 == 0) {
            return n2;
        }
        return find_gcd(n2, n1%n2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = input.nextInt();
        
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + find_gcd(n1,n2) + ".");
    }
}
