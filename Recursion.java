//Linear recursion
import java.util.Scanner;
public class MyClass {
    static int factorial(int n) {
        if(n==0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to compute : ");
        int n = input.nextInt();
        
        System.out.println("The factorial of " + n + " is "+ factorial(n) + ".");
    }
}


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


//Binary recursion
import java.util.Scanner;
public class MyClass {
    static int fib(int num) {
        if(num <= 1) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number higher than 0 : ");
        int num = input.nextInt();
        
        for(int i = 0;i < num;i++) {
            System.out.println(i);
        }
    }
}


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
