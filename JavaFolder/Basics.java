import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = "Hello World";
        System.out.println(word.indexOf("l"));
        String fullname;
        int age;
        String email;
        System.out.print("Enter full name : ");
        fullname = s.nextLine();
        System.out.print("Enter age : ");
        age = s.nextInt();
        s.nextLine();
        System.out.print("Enter email : ");
        email = s.nextLine();
        System.out.println("\nWelcome " + fullname + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println(email.concat("@gmail.com"));
    }
}
