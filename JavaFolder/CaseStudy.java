import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Username up = new Username();

        up.username_pass();
    }
}

class Username extends MainClass {
    String regex = "[0-9]+";
    String user_name = "STI";
    int maxattempt = 3;
    String username;
    String password;

    public void username_pass() throws InterruptedException {
        do {
            System.out.print("Username: "); // numbers only are not allowed
            username = s.nextLine();
            maxattempt--;
            if (username.length() == 0) {
                for (int p = 1; p > 0; p--) {
                    System.out.print("P");
                    Thread.sleep(200);
                    for (int r = 1; r > 0; r--) {
                        System.out.print("r");
                        Thread.sleep(200);
                        for (int o = 1; o > 0; o--) {
                            System.out.print("o");
                            Thread.sleep(200);
                            for (int c = 1; c > 0; c--) {
                                System.out.print("c");
                                Thread.sleep(200);
                                for (int e = 1; e > 0; e--) {
                                    System.out.print("e");
                                    Thread.sleep(200);
                                    for (int s = 1; s > 0; s--) {
                                        System.out.print("s");
                                        Thread.sleep(200);
                                        for (int a = 1; a > 0; a--) {
                                            System.out.print("s");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int n = 1; n > 0; n--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int g = 1; g > 0; g--) {
                                                        System.out.print("g");
                                                        Thread.sleep(200);
                                                        for (int b = 5; b > 0; b--) {
                                                            System.out.print(".");
                                                            Thread.sleep(500);
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
                if (maxattempt == 1) {
                    System.out.println("\n\nPlease input a username.\n");
                    System.out.println("Remaining attempt: " + maxattempt);
                    System.out.println("Try again > | < Cancel "); // ask the user to try again
                    System.out.print("Select: ");
                    String tryAgain = s.nextLine();

                    if (tryAgain.equals(">")) { // the program will loop
                        System.out.println("====================================");
                        username_pass();
                    }
                    if (tryAgain.equals("<")) { // the program will be terminated
                        System.out.println("\nProgram Exit.");
                        System.exit(0);
                    }
                }
                if (maxattempt == 0) {
                    System.out.println("\n\nRemaining attempt: " + maxattempt);
                    System.out.println("\nProgram stopped."); // maximum attempts (3) reached
                    System.exit(maxattempt);
                }
                System.out.println("\n\nPlease input a username.\n");
                System.out.println("Remaining attempts: " + maxattempt);
                System.out.println("Try again > | < Cancel "); // ask the user to try again
                System.out.print("Select: ");
                String tryAgain = s.nextLine();

                if (tryAgain.equals(">")) { // the program will loop
                    System.out.println("====================================");
                    username_pass();
                }
                if (tryAgain.equals("<")) { // the program will be terminated
                    System.out.println("\nProgram Exit.");
                    System.exit(0);
                }
            }
            if (username.matches(regex)) {
                for (int p = 1; p > 0; p--) {
                    System.out.print("P");
                    Thread.sleep(200);
                    for (int r = 1; r > 0; r--) {
                        System.out.print("r");
                        Thread.sleep(200);
                        for (int o = 1; o > 0; o--) {
                            System.out.print("o");
                            Thread.sleep(200);
                            for (int c = 1; c > 0; c--) {
                                System.out.print("c");
                                Thread.sleep(200);
                                for (int e = 1; e > 0; e--) {
                                    System.out.print("e");
                                    Thread.sleep(200);
                                    for (int s = 1; s > 0; s--) {
                                        System.out.print("s");
                                        Thread.sleep(200);
                                        for (int a = 1; a > 0; a--) {
                                            System.out.print("s");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int n = 1; n > 0; n--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int g = 1; g > 0; g--) {
                                                        System.out.print("g");
                                                        Thread.sleep(200);
                                                        for (int b = 5; b > 0; b--) {
                                                            System.out.print(".");
                                                            Thread.sleep(500);
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
                if (maxattempt == 1) {
                    System.out.println("\n\nInvalid Username.\n");
                    System.out.println("Remaining attempt: " + maxattempt);
                    System.out.println("Try again > | < Cancel "); // ask the user to try again
                    System.out.print("Select: ");
                    String tryAgain = s.nextLine();

                    if (tryAgain.equals(">")) { // the program will loop
                        System.out.println("====================================");
                        username_pass();
                    }
                    if (tryAgain.equals("<")) { // the program will be terminated
                        System.out.println("Invalid Username.");
                        System.out.println("Remaining attempts: " + maxattempt);
                        System.out.println("\nProgram Exit.");
                        System.exit(0);
                    }
                }
                if (maxattempt == 0) {
                    System.out.println("\n\nRemaining attempt: " + maxattempt);
                    System.out.println("\nProgram stopped."); // maximum attempts (3) reached
                    System.out.println("Numbers are not allowed.");
                    System.out.println("Remaining attempts: " + maxattempt);
                    System.exit(maxattempt);
                }
                System.out.println("\n\nInvalid Username.\n");
                System.out.println("Remaining attempts: " + maxattempt);
                System.out.println("Try again > | < Cancel "); // ask the user to try again
                System.out.print("Select: ");
                String tryAgain = s.nextLine();

                if (tryAgain.equals(">")) { // the program will loop
                    System.out.println("====================================");
                    username_pass();
                }
                if (tryAgain.equals("<")) { // the program will be terminated
                    System.out.println("\nProgram Exit.");
                    System.exit(0);
                }
            }
            if (username.length() < 3) {
                for (int p = 1; p > 0; p--) {
                    System.out.print("P");
                    Thread.sleep(200);
                    for (int r = 1; r > 0; r--) {
                        System.out.print("r");
                        Thread.sleep(200);
                        for (int o = 1; o > 0; o--) {
                            System.out.print("o");
                            Thread.sleep(200);
                            for (int c = 1; c > 0; c--) {
                                System.out.print("c");
                                Thread.sleep(200);
                                for (int e = 1; e > 0; e--) {
                                    System.out.print("e");
                                    Thread.sleep(200);
                                    for (int s = 1; s > 0; s--) {
                                        System.out.print("s");
                                        Thread.sleep(200);
                                        for (int a = 1; a > 0; a--) {
                                            System.out.print("s");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int n = 1; n > 0; n--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int g = 1; g > 0; g--) {
                                                        System.out.print("g");
                                                        Thread.sleep(200);
                                                        for (int b = 5; b > 0; b--) {
                                                            System.out.print(".");
                                                            Thread.sleep(500);
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
                if (maxattempt == 1) {
                    System.out.println("\n\nInvalid Username.\n");
                    System.out.println("Remaining attempt: " + maxattempt);
                    System.out.println("Try again > | < Cancel "); // ask the user to try again
                    System.out.print("Select: ");
                    String tryAgain = s.nextLine();

                    if (tryAgain.equals(">")) { // the program will loop
                        System.out.println("====================================");
                        username_pass();
                    }
                    if (tryAgain.equals("<")) { // the program will be terminated
                        System.out.println("\nProgram Exit.");
                        System.exit(0);
                    }
                }
                if (maxattempt == 0) {
                    System.out.println("\n\nRemaining attempt: " + maxattempt);
                    System.out.println("\nProgram stopped."); // maximum attempts (3) reached
                    System.exit(maxattempt);
                }
                System.out.println("\n\nInvalid Username\n");
                System.out.println("Remaining attempts: " + maxattempt);
                System.out.println("Try again > | < Cancel "); // ask the user to try again
                System.out.print("Select: ");
                String tryAgain = s.nextLine();

                if (tryAgain.equals(">")) { // the program will loop
                    System.out.println("====================================");
                    username_pass();
                }
                if (tryAgain.equals("<")) { // the program will be terminated
                    System.out.println("\nProgram Exit.");
                    System.exit(0);
                }
            } else {
                password_app();
            }
        } while (false);
    }

    public void password_app() throws InterruptedException {
        Compilation comp = new Compilation();
        String password_ = "sti";
        char password[] = null;
        try {
            password = PasswordField.getPassword(System.in, "Password: ");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        if (password == null) {
            for (int a = 1; a > 0; a--) {
                System.out.print("L");
                Thread.sleep(200);
                for (int b = 1; b > 0; b--) {
                    System.out.print("o");
                    Thread.sleep(200);
                    for (int c = 1; c > 0; c--) {
                        System.out.print("g");
                        Thread.sleep(200);
                        for (int d = 1; d > 0; d--) {
                            System.out.print("g");
                            Thread.sleep(200);
                            for (int e = 1; e > 0; e--) {
                                System.out.print("i");
                                Thread.sleep(200);
                                for (int f = 1; f > 0; f--) {
                                    System.out.print("n");
                                    Thread.sleep(200);
                                    for (int g = 1; g > 0; g--) {
                                        System.out.print("g");
                                        Thread.sleep(200);
                                        for (int h = 1; h > 0; h--) {
                                            System.out.print(" ");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int j = 1; j > 0; j--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int k = 5; k > 0; k--) {
                                                        System.out.print(".");
                                                        Thread.sleep(200);
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
            if (maxattempt == 1) {
                System.out.println("\n\nPlease input a Password.\n");
                System.out.println("Remaining attempt: " + maxattempt);
                System.out.println("Try again > | < Cancel "); // ask the user to try again
                System.out.print("Select: ");
                String tryAgain = s.nextLine();

                if (tryAgain.equals(">")) { // the program will loop
                    System.out.println("====================================");
                    username_pass();
                }
                if (tryAgain.equals("<")) { // the program will be terminated
                    System.out.println("\nProgram Exit.");
                    System.exit(0);
                }
            }
            if (maxattempt == 0) {
                System.out.println("\n\nRemaining attempt: " + maxattempt);
                System.out.println("\nProgram stopped."); // maximum attempts (3) reached
                System.exit(maxattempt);
            }
            System.out.println("\n\nPlease input a Password.\n");
            System.out.println("Remaining attempts: " + maxattempt);
            System.out.println("Try again > | < Cancel "); // ask the user to try again
            System.out.print("Select: ");
            String tryAgain = s.nextLine();

            if (tryAgain.equals(">")) { // the program will loop
                System.out.println("====================================");
                username_pass();
            }
            if (tryAgain.equals("<")) { // the program will be terminated
                System.out.println("\nProgram Exit.");
                System.exit(0);
            }
        }
        if (username.matches(user_name) && String.valueOf(password).matches(password_)) {
            for (int a = 1; a > 0; a--) {
                System.out.print("L");
                Thread.sleep(200);
                for (int b = 1; b > 0; b--) {
                    System.out.print("o");
                    Thread.sleep(200);
                    for (int c = 1; c > 0; c--) {
                        System.out.print("g");
                        Thread.sleep(200);
                        for (int d = 1; d > 0; d--) {
                            System.out.print("g");
                            Thread.sleep(200);
                            for (int e = 1; e > 0; e--) {
                                System.out.print("i");
                                Thread.sleep(200);
                                for (int f = 1; f > 0; f--) {
                                    System.out.print("n");
                                    Thread.sleep(200);
                                    for (int g = 1; g > 0; g--) {
                                        System.out.print("g");
                                        Thread.sleep(200);
                                        for (int h = 1; h > 0; h--) {
                                            System.out.print(" ");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int j = 1; j > 0; j--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int k = 5; k > 0; k--) {
                                                        System.out.print(".");
                                                        Thread.sleep(200);

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

                System.out.println("\n\nSuccessfully Logged in.");
                System.out.print("Press ENTER to continue");
                String enter = s.nextLine();
                System.out.print("\nAccessing COMPILATION OF PROGRAMS");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(1000); // time duration (1000/1 second)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                comp.compilation();
            }
        }
        if (username != (user_name) && String.valueOf(password).matches(password_)) {
            for (int a = 1; a > 0; a--) {
                System.out.print("L");
                Thread.sleep(200);
                for (int b = 1; b > 0; b--) {
                    System.out.print("o");
                    Thread.sleep(200);
                    for (int c = 1; c > 0; c--) {
                        System.out.print("g");
                        Thread.sleep(200);
                        for (int d = 1; d > 0; d--) {
                            System.out.print("g");
                            Thread.sleep(200);
                            for (int e = 1; e > 0; e--) {
                                System.out.print("i");
                                Thread.sleep(200);
                                for (int f = 1; f > 0; f--) {
                                    System.out.print("n");
                                    Thread.sleep(200);
                                    for (int g = 1; g > 0; g--) {
                                        System.out.print("g");
                                        Thread.sleep(200);
                                        for (int h = 1; h > 0; h--) {
                                            System.out.print(" ");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int j = 1; j > 0; j--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int k = 5; k > 0; k--) {
                                                        System.out.print(".");
                                                        Thread.sleep(200);

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
            if (maxattempt == 1) {
                System.out.println("\n\nIncorrect Username.\n");
                System.out.println("Remaining attempt: " + maxattempt);
                System.out.println("Try again > | < Cancel "); // ask the user to try again
                System.out.print("Select: ");
                String tryAgain = s.nextLine();

                if (tryAgain.equals(">")) { // the program will loop
                    System.out.println("====================================");
                    username_pass();
                }
                if (tryAgain.equals("<")) { // the program will be terminated
                    System.out.println("\nProgram Exit.");
                    System.exit(0);
                }
            }
            if (maxattempt == 0) {
                System.out.println("\n\nRemaining attempt: " + maxattempt);
                System.out.println("\nProgram stopped."); // maximum attempts (3) reached
                System.exit(maxattempt);
            }
            System.out.println("\n\nIncorrect Username.\n");
            System.out.println("Remaining attempts: " + maxattempt);
            System.out.println("Try again > | < Cancel "); // ask the user to try again
            System.out.print("Select: ");
            String tryAgain = s.nextLine();

            if (tryAgain.equals(">")) { // the program will loop
                System.out.println("====================================");
                username_pass();
            }
            if (tryAgain.equals("<")) { // the program will be terminated
                System.out.println("\nProgram Exit.");
                System.exit(0);
            }
        }
        if (username.matches(user_name) && String.valueOf(password) != (password_)) {
            for (int a = 1; a > 0; a--) {
                System.out.print("L");
                Thread.sleep(200);
                for (int b = 1; b > 0; b--) {
                    System.out.print("o");
                    Thread.sleep(200);
                    for (int c = 1; c > 0; c--) {
                        System.out.print("g");
                        Thread.sleep(200);
                        for (int d = 1; d > 0; d--) {
                            System.out.print("g");
                            Thread.sleep(200);
                            for (int e = 1; e > 0; e--) {
                                System.out.print("i");
                                Thread.sleep(200);
                                for (int f = 1; f > 0; f--) {
                                    System.out.print("n");
                                    Thread.sleep(200);
                                    for (int g = 1; g > 0; g--) {
                                        System.out.print("g");
                                        Thread.sleep(200);
                                        for (int h = 1; h > 0; h--) {
                                            System.out.print(" ");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int j = 1; j > 0; j--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int k = 5; k > 0; k--) {
                                                        System.out.print(".");
                                                        Thread.sleep(200);
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
            if (maxattempt == 1) {
                System.out.println("\n\nIncorrect Password.\n");
                System.out.println("Remaining attempt: " + maxattempt);
                System.out.println("Try again > | < Cancel "); // ask the user to try again
                System.out.print("Select: ");
                String tryAgain = s.nextLine();

                if (tryAgain.equals(">")) { // the program will loop
                    System.out.println("====================================");
                    username_pass();
                }
                if (tryAgain.equals("<")) { // the program will be terminated
                    System.out.println("\nProgram Exit.");
                    System.exit(0);
                }
            }
            if (maxattempt == 0) {
                System.out.println("\n\nRemaining attempt: " + maxattempt);
                System.out.println("\nProgram stopped."); // maximum attempts (3) reached
                System.exit(maxattempt);
            }
            System.out.println("\n\nIncorrect Password.\n");
            System.out.println("Remaining attempts: " + maxattempt);
            System.out.println("Try again > | < Cancel "); // ask the user to try again
            System.out.print("Select: ");
            String tryAgain = s.nextLine();

            if (tryAgain.equals(">")) { // the program will loop
                System.out.println("====================================");
                username_pass();
            }
            if (tryAgain.equals("<")) { // the program will be terminated
                System.out.println("\nProgram Exit.");
                System.exit(0);
            }
        }
        if (username != (user_name) && String.valueOf(password) != (password_)) {
            for (int a = 1; a > 0; a--) {
                System.out.print("L");
                Thread.sleep(200);
                for (int b = 1; b > 0; b--) {
                    System.out.print("o");
                    Thread.sleep(200);
                    for (int c = 1; c > 0; c--) {
                        System.out.print("g");
                        Thread.sleep(200);
                        for (int d = 1; d > 0; d--) {
                            System.out.print("g");
                            Thread.sleep(200);
                            for (int e = 1; e > 0; e--) {
                                System.out.print("i");
                                Thread.sleep(200);
                                for (int f = 1; f > 0; f--) {
                                    System.out.print("n");
                                    Thread.sleep(200);
                                    for (int g = 1; g > 0; g--) {
                                        System.out.print("g");
                                        Thread.sleep(200);
                                        for (int h = 1; h > 0; h--) {
                                            System.out.print(" ");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int j = 1; j > 0; j--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int k = 5; k > 0; k--) {
                                                        System.out.print(".");
                                                        Thread.sleep(200);
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
            if (maxattempt == 1) {
                System.out.println("\n\nIncorrect Username and Password.\n");
                System.out.println("Remaining attempt: " + maxattempt);
                System.out.println("Try again > | < Cancel "); // ask the user to try again
                System.out.print("Select: ");
                String tryAgain = s.nextLine();

                if (tryAgain.equals(">")) { // the program will loop
                    System.out.println("====================================");
                    username_pass();
                }
                if (tryAgain.equals("<")) { // the program will be terminated
                    System.out.println("\nProgram Exit.");
                    System.exit(0);
                }
            }
            if (maxattempt == 0) {
                System.out.println("\n\nRemaining attempt: " + maxattempt);
                System.out.println("\nProgram stopped."); // maximum attempts (3) reached
                System.exit(maxattempt);
            }
            System.out.println("\n\nIncorrect Username and Password.\n");
            System.out.println("Remaining attempts: " + maxattempt);
            System.out.println("Try again > | < Cancel "); // ask the user to try again
            System.out.print("Select: ");
            String tryAgain = s.nextLine();

            if (tryAgain.equals(">")) { // the program will loop
                System.out.println("====================================");
                username_pass();
            }
            if (tryAgain.equals("<")) { // the program will be terminated
                System.out.println("\nProgram Exit.");
                System.exit(0);
            }
        }
        if (username.matches(user_name) && String.valueOf(password) != (password_)) {
            for (int a = 1; a > 0; a--) {
                System.out.print("L");
                Thread.sleep(200);
                for (int b = 1; b > 0; b--) {
                    System.out.print("o");
                    Thread.sleep(200);
                    for (int c = 1; c > 0; c--) {
                        System.out.print("g");
                        Thread.sleep(200);
                        for (int d = 1; d > 0; d--) {
                            System.out.print("g");
                            Thread.sleep(200);
                            for (int e = 1; e > 0; e--) {
                                System.out.print("i");
                                Thread.sleep(200);
                                for (int f = 1; f > 0; f--) {
                                    System.out.print("n");
                                    Thread.sleep(200);
                                    for (int g = 1; g > 0; g--) {
                                        System.out.print("g");
                                        Thread.sleep(200);
                                        for (int h = 1; h > 0; h--) {
                                            System.out.print(" ");
                                            Thread.sleep(200);
                                            for (int i = 1; i > 0; i--) {
                                                System.out.print("i");
                                                Thread.sleep(200);
                                                for (int j = 1; j > 0; j--) {
                                                    System.out.print("n");
                                                    Thread.sleep(200);
                                                    for (int k = 5; k > 0; k--) {
                                                        System.out.print(".");
                                                        Thread.sleep(200);
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

        if (maxattempt == 1) {
            System.out.println("\n\nIncorrect Password..\n");
            System.out.println("Remaining attempt: " + maxattempt);
            System.out.println("Try again > | < Cancel "); // ask the user to try again
            System.out.print("Select: ");
            String tryAgain = s.nextLine();

            if (tryAgain.equals(">")) { // the program will loop
                System.out.println("====================================");
                username_pass();
            }
            if (tryAgain.equals("<")) { // the program will be terminated
                System.out.println("\nProgram Exit.");
                System.exit(0);
            }
        }
        if (maxattempt == 0) {
            System.out.println("\n\nRemaining attempt: " + maxattempt);
            System.out.println("\nProgram stopped."); // maximum attempts (3) reached
            System.exit(maxattempt);
        }
        System.out.println("\n\nIncorrect Password.\n");
        System.out.println("Remaining attempts: " + maxattempt);
        System.out.println("Try again > | < Cancel "); // ask the user to try again
        System.out.print("Select: ");
        String tryAgain = s.nextLine();

        if (tryAgain.equals(">")) { // the program will loop
            System.out.println("====================================");
            username_pass();
        }
        if (tryAgain.equals("<")) { // the program will be terminated
            System.out.println("\nProgram Exit.");
            System.exit(0);
        }
    }
}

class MaskingThread extends Thread {
    private volatile boolean stop;
    private char echochar = '*';

    public MaskingThread(String prompt) {
        System.out.print(prompt);
    }

    public void run() {

        int priority = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        try {
            stop = true;
            while (stop) {
                System.out.print("\010" + echochar);
                try {
                    // attempt masking at this rate
                    Thread.currentThread().sleep(1);
                } catch (InterruptedException iex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } finally { // restore the original priority
            Thread.currentThread().setPriority(priority);
        }
    }

    /**
     * Instruct the thread to stop masking.
     */
    public void stopMasking() {
        this.stop = false;
    }
}

class PasswordField {

    public static final char[] getPassword(InputStream in, String prompt) throws IOException {
        MaskingThread maskingthread = new MaskingThread(prompt);
        Thread thread = new Thread(maskingthread);
        thread.start();

        char[] lineBuffer;
        char[] buf;
        int i;

        buf = lineBuffer = new char[128];

        int room = buf.length;
        int offset = 0;
        int c;

        loop: while (true) {
            switch (c = in.read()) {
                case -1:
                case '\n':
                    break loop;

                case '\r':
                    int c2 = in.read();
                    if ((c2 != '\n') && (c2 != -1)) {
                        if (!(in instanceof PushbackInputStream)) {
                            in = new PushbackInputStream(in);
                        }
                        ((PushbackInputStream) in).unread(c2);
                    } else {
                        break loop;
                    }

                default:
                    if (--room < 0) {
                        buf = new char[offset + 128];
                        room = buf.length - offset - 1;
                        System.arraycopy(lineBuffer, 0, buf, 0, offset);
                        Arrays.fill(lineBuffer, ' ');
                        lineBuffer = buf;
                    }
                    buf[offset++] = (char) c;
                    break;
            }
        }
        maskingthread.stopMasking();
        if (offset == 0) {
            return null;
        }
        char[] ret = new char[offset];
        System.arraycopy(buf, 0, ret, 0, offset);
        Arrays.fill(buf, ' ');
        return ret;
    }
}

class Compilation extends MainClass { // Main MENU
    Compilations_of_Programs compilation_of_programs = new Compilations_of_Programs();

    public void compilation() { // Contains the compilation of programs
        ExitMenu exit = new ExitMenu();
        Logout log = new Logout();
        System.out.println("\n====================================");
        System.out.println("COMPILATION of PROGRAMS");
        System.out.println("[1] Sample Programs" +
                "\n[2] Laboratory Activities" +
                "\n[3] Application Program");

        System.out.println("\nSelect numbers from 1-3 | x Log out");
        System.out.print("Option: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            compilation_of_programs.sample_programs(); // Redirect to the periods for the Sample Programs
        }
        if (select.equals("2")) {
            compilation_of_programs.laboratory_activities(); // Redirect to the periods for the Laboratory Activities
        }
        if (select.equals("3")) {
            compilation_of_programs.application();
        }
        if (select.equalsIgnoreCase("x")) { // If the user wants to return to the Account configuration menu
            log.logout();
        }
    }
}

class Compilations_of_Programs extends MainClass { // Sample Programs class
    Prelim_SP prelim_sample_programs = new Prelim_SP();
    Midterm_SP midterm_sample_programs = new Midterm_SP();
    PreFinal_SP preFinals_sample_programs = new PreFinal_SP();
    Finals_SP finals_sample_programs = new Finals_SP();
    PreFinal_LA prefinals_laboratory = new PreFinal_LA();
    Application_Program1 ap = new Application_Program1();

    public void sample_programs() {
        System.out.println("====================================");
        System.out.println("PERIODS for SAMPLE PROGRAMS: ");
        periods();
    }

    public void laboratory_activities() {
        System.out.println("====================================");
        System.out.println("PERIODS for LABORATORY ACTIVITIES: ");
        periods2();
    }

    public void application() {
        System.out.println("====================================");
        System.out.println("APPLICATION PROGRAM: ");
        System.out.println();
        ap.Interface();
        // applicationProgram();
    }

    public void periods() { // PERIODS FOR SAMPLE PROGRAMS
        Compilation compilation = new Compilation();
        Logout log = new Logout();
        System.out.println("[1] Prelim" +
                "\n[2] Midterm" +
                "\n[3] Pre-final" +
                "\n[4] Finals");

        System.out.println("\nSelect numbers from 1-4 | < Go back | x Log out");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            prelim_sample_programs.prelim_sp();
        }
        if (select.equals("2")) {
            midterm_sample_programs.midterm_sp();
        }
        if (select.equals("3")) {
            preFinals_sample_programs.preFinal_sp();
        }
        if (select.equals("4")) {
            finals_sample_programs.finals_sp();
        }
        if (select.equals("<")) {
            compilation.compilation();
        }
        if (select.equalsIgnoreCase("x")) {
            log.logout();
        }
    }

    public void periods2() { // PERIODS FOR LABORATORY ACTIVITIES
        Compilation compilation = new Compilation();
        Prelim_LA prelim_laboratory_activities = new Prelim_LA();
        Midterm_LA midterm_laboratory_activities = new Midterm_LA();
        PreFinal_LA prefinal_laboratory = new PreFinal_LA();
        Finals_LA finals_laboratory = new Finals_LA();
        Logout log = new Logout();
        System.out.println("[1] Prelim" +
                "\n[2] Midterm" +
                "\n[3] Pre-final" +
                "\n[4] Finals");

        System.out.println("\nSelect numbers from 1-4 | < Go back | x Log out");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            prelim_laboratory_activities.prelim_la(); // Contains all the activities in the PRELIM PERIOD
        }
        if (select.equals("2")) { // Contains all the activities in the MIDTERM PERIOD
            midterm_laboratory_activities.midterm_la();
        }
        if (select.equals("3")) { // Contains all the activities in the PRE-FINAL PERIOD
            prefinal_laboratory.preFinal_la();
        }
        if (select.equals("4")) { // Contains all the activtieis in the FINALS PERIOD
            finals_laboratory.finals_la();
        }
        if (select.equals("<")) {
            compilation.compilation();
        }
        if (select.equalsIgnoreCase("x")) {
            log.logout();
        }
    }
}

// -----------------------------------------------------------------------------------------------------------
// START OF PRELIM (SAMPLE PROGRAM)
class Prelim_SP extends MainClass { // contains all the Sample Programs for the Prelim period, in chronological
    // order
    public void prelim_sp() {
        Compilations_of_Programs sample_programs = new Compilations_of_Programs();
        Logout log = new Logout();
        System.out.println("====================================");
        System.out.println("PRELIM");
        System.out.println("\nNo content(s) available");

        System.out.println("\n< Go back");
        System.out.print("Select: ");
        String back = s.nextLine();

        if (back.equals("<")) {
            sample_programs.sample_programs();
        }
        if (back.equalsIgnoreCase("x")) {
            log.logout();
        }
    }
}

// END OF PRELIM (SAMPLE PROGRAM)
// -----------------------------------------------------------------------------------------------------------
// START OF PRELIM (SAMPLE PROGRAM)
class Midterm_SP extends MainClass { // contains all the Sample Programs for the Midterm period, in chronological
    // order
    PathSample path_sample = new PathSample();

    public void midterm_sp() {
        Compilations_of_Programs sample_programs = new Compilations_of_Programs();
        Logout log = new Logout();
        System.out.println("====================================");
        System.out.println("MIDTERM");
        System.out.println("[1] Sample Program #1");
        System.out.println("\n< Go back");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            System.out.println("========================================");
            System.out.println("06 File Input and Output (Midterm)");
            System.out.println("\nSample Program #1\n ");
            path_sample.PathSample();

            System.out.println("\n< Go back | << Go back to Period MENU");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                midterm_sp(); // MENU for MIDTERM
            }
            if (back.equals("<<")) {
                sample_programs.sample_programs(); // MENU for PERIODS under the Sample Programs
            }
            if (back.equalsIgnoreCase("x")) {
                log.logout();
            }
        }
        if (select.equals("<")) {
            sample_programs.sample_programs(); // Back to MENU for PERIODS under the Sample Programs
        }
        if (select.equalsIgnoreCase("x")) {
            log.logout();
        }
    }
}

class PathSample { // Sample Program #1
    public void PathSample() {

        Path filePath = Paths.get("C:\\Java\\Chapter8\\sample.txt");
        int count = filePath.getNameCount();
        System.out.println("Path is " + filePath.toString());
        System.out.println("File name is " + filePath.getFileName());
        System.out.println("There are " + count + " elements in the file path");

        for (int x = 0; x < count; x++)
            System.out.println("Element " + x + " is " + filePath.getName(x));

        System.out.println("\nProcess Completed.");
    }
}

// END OF MIDTERM (SAMPLE PROGRAM)
// -----------------------------------------------------------------------------------------------------------
// START OF PRE-FINAL (SAMPLE PROGRAM)
class PreFinal_SP extends MainClass { // contains all the Sample Programs for the Pre-Final period, in chronological
    // order
    public void preFinal_sp() {
        Compilations_of_Programs sample_programs = new Compilations_of_Programs();
        Logout log = new Logout();
        System.out.println("====================================");
        System.out.println("PRE-FINAL");
        System.out.println("\nNo content(s) available");
        System.out.println("\n< Go back");
        System.out.print("Select: ");
        String back = s.nextLine();

        if (back.equals("<")) {
            sample_programs.sample_programs();
        }
        if (back.equalsIgnoreCase("x")) {
            log.logout();
        }
    }
}

// END OF PRE-FINAL(SAMPLE PROGRAM)
// -----------------------------------------------------------------------------------------------------------
// START OF FINALS (SAMPLE PROGRAM)
class Finals_SP extends MainClass { // contains all the Sample Programs for the Finals period, in chronological
    // order
    public void finals_sp() {
        Compilations_of_Programs sample_programs = new Compilations_of_Programs();
        Logout log = new Logout();
        System.out.println("====================================");
        System.out.println("FINALS");
        System.out.println("\nNo content(s) available");
        System.out.println("\n< Go back");
        System.out.print("Select: ");
        String back = s.nextLine();

        if (back.equals("<")) {
            sample_programs.sample_programs();
        }
        if (back.equalsIgnoreCase("x")) {
            log.logout();
        }
    }
}

// END OF FINALS (SAMPLE PROGRAM)
// -----------------------------------------------------------------------------------------------------------
// START OF PRELIM (LABORATORY ACTIVITIES)
class Prelim_LA extends MainClass { // contains all the Laboratory Activities for the Prelim period, in
    // chronological order
    public void prelim_la() {
        Compilations_of_Programs cop = new Compilations_of_Programs();
        LabExer1A lab_exer_1a = new LabExer1A();
        LabExer1B lab_exer_1b = new LabExer1B();
        LabExer2 lab_exer_2 = new LabExer2();
        Logout log = new Logout();
        System.out.println("====================================");
        System.out.println("PRELIM");
        System.out.println("[1] 01 Hands-on Activity 1" +
                "\n[2] 01 Hands-on Activity 2" +
                "\n[3] 02 Hands-on Activity 1");
        System.out.println("\n< Go back");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            System.out.println("================================================");
            System.out.println("01 Object-Oriented Programming Concepts (Prelim)");
            System.out.println("\n01 Hands-on Activity 1\n");
            lab_exer_1a.LabExer1A();

            System.out.println("\n< Go back | << Go back to Period MENU");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                prelim_la(); // MENU for PRELIM
            }
            if (back.equals("<<")) {
                cop.laboratory_activities();
            }
            if (back.equalsIgnoreCase("x")) {
                log.logout();
            }
        }
        if (select.equals("<")) {
            cop.laboratory_activities();
        }
        if (select.equals("2")) {
            System.out.println("================================================");
            System.out.println("01 Object-Oriented Programming Concepts (Prelim)");
            System.out.println("\n01 Hands-on Activity 2\n");
            lab_exer_1b.LabExer1B();

            System.out.println("\n< Go back | << Go back to Period MENU");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                prelim_la(); // MENU for PRELIM
            }
            if (back.equals("<<")) {
                cop.laboratory_activities();
            }
            if (select.equalsIgnoreCase("x")) {
                log.logout();
            }
        }
        if (select.equals("3")) {
            System.out.println("======================================================");
            System.out.println("02 Classes and Methods (Prelim)");
            System.out.println("\n02 Hands-on Activity 1\n");
            lab_exer_2.LabExer2();

            System.out.println("\n\n< Go back | << Go back to Period MENU");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                prelim_la(); // MENU for PRELIM
            }
            if (back.equals("<<")) {
                cop.laboratory_activities();
            }
            if (select.equals("x")) {
                log.logout();
            }
        }
        if (select.equalsIgnoreCase("x")) {
            log.logout();
        }
    }
}

class LabExer1A { // 01 Hands-on Activity 1
    public void LabExer1A() {
        int faveNumber = 3;
        String faveCartChar = "L";
        String firstName = "Carl Jason";
        String lastName = "Lazaro";
        char mi = 'J';
        char nickNameArray[] = {
                'C',
                'a',
                'r',
                'l'
        };

        System.out.println(faveNumber + " is my favorite number."); // print favorite number
        System.out.println("I love " + faveCartChar + "!"); // print favorite cartoon character
        System.out.println("My name is " + firstName + " " + mi + " " + lastName + "."); // print fullname
        System.out.println(
                "You can call me " + nickNameArray[0] + nickNameArray[1] + nickNameArray[2] + nickNameArray[3] + "."); // print
        // nickname
    }
}

class LabExer1B extends MainClass { // 01 Hands-on Activity 2
    public void LabExer1B() {

        int inputNumber = 0;

        System.out.print("Enter an integer: ");
        inputNumber = s.nextInt();

        showNumberPlus10(inputNumber);
        showNumberPlus100(inputNumber);
        showNumberPlus1000(inputNumber);
    }

    public static int showNumberPlus10(int inputNumber) {
        int firstNumber = 10;
        int inputNumber_firstNumber = inputNumber + firstNumber; // add the input and the first number
        System.out.println(inputNumber + " plus " + firstNumber + " is " + inputNumber_firstNumber + ".");
        return 0;
    }

    public static int showNumberPlus100(int inputNumber) {
        int secondNumber = 100;
        int inputNumber_secondNumber = inputNumber + secondNumber; // add the input and the second number
        System.out.println(inputNumber + " plus " + secondNumber + " is " + inputNumber_secondNumber + ".");
        return 0;
    }

    public static int showNumberPlus1000(int inputNumber) {
        int thirdNumber = 1000;
        int inputNumber_thirdNumber = inputNumber + thirdNumber; // add the input and the third number
        System.out.println(inputNumber + " plus " + thirdNumber + " is " + inputNumber_thirdNumber + ".");
        return 0;
    }
}

class LabExer2 extends MainClass { // 02 Hands-on Activity 1
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private static double amountDue;

    public void setItemName(String newItemName) {
        itemName = newItemName;
    }

    public void setTotalCost(int quantity, double price) {
        itemQuantity = quantity;
        price = amountDue;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalCost() {
        return amountDue;
    }

    public void readInput() {

        LabExer2 LabExer = new LabExer2();
        System.out.println("Enter the name of the item you are purchasing.");
        String itemName = s.nextLine();
        LabExer.setItemName(itemName);
        System.out.println("Enter the quantity and price separated by a space.");
        int itemQuantity = s.nextInt();
        LabExer.setItemQuantity(itemQuantity);
        double itemPrice = s.nextDouble();
        LabExer.setItemPrice(itemPrice);
        amountDue = itemPrice * itemQuantity;
        LabExer.writeOutput();
        System.out.printf("Amount due is " + "%.2f", amountDue);
    }

    public void writeOutput() {
        System.out.println("You are purchasing " + getItemQuantity() + " " + getItemName() + "(s)" + " at " +
                getItemPrice() + " each.");
    }

    public void setItemPrice(double price) {
        itemPrice = price;
    }

    public void setItemQuantity(int quantity) {
        itemQuantity = quantity;
    }

    public void LabExer2() {
        readInput();
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}

// END OF PRELIM (LABORATORY ACTIVITIES)
// -----------------------------------------------------------------------------------------------------------
// START OF MIDTERM (LABORATORY ACTIVITIES)
class Midterm_LA extends MainClass { // contains all the Laboratory Activities for the Midterm period, in
    // chronological order
    public void midterm_la() {
        GuessingGame guessing_game = new GuessingGame();
        QuizBee quizbee = new QuizBee();
        LabExer6A labexer6a = new LabExer6A();
        Compilations_of_Programs cop = new Compilations_of_Programs();
        Logout log = new Logout();
        System.out.println("====================================");
        System.out.println("MIDTERM");
        System.out.println("[1] 05 Hands-on Activity 1" +
                "\n[2] 05 Hands-on Activity 2" +
                "\n[3] 06 Hands-on Activity 1");
        System.out.println("\n< Go back");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            System.out.println("======================================================");
            System.out.println("05 Exception Handling (Midterm)");
            System.out.println("\n05 Hands-on Activity 1\n");
            guessing_game.GuessingGame();
        }
        if (select.equals("2")) {
            System.out.println("======================================================");
            System.out.println("05 Exception Handling (Midterm)");
            System.out.println("\n05 Hands-on Activity 2\n");
            quizbee.quizbee();

            System.out.println("\n< Go back | << Go back to Period MENU | x Log out");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                midterm_la(); // MENU for MIDTERM
            }
            if (back.equals("<<")) {
                cop.laboratory_activities();
            }
            if (back.equalsIgnoreCase("x")) {
                log.logout();
            }
        }
        if (select.equals("3")) {
            System.out.println("======================================================");
            System.out.println("06 File Input and Output (Midterm)");
            System.out.println("\n06 Hands-on Activity 1\n");
            labexer6a.LabExer6A();

            System.out.println("\n< Go back | << Go back to Period MENU");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                midterm_la(); // MENU for MIDTERM
            }
            if (back.equals("<<")) {
                cop.laboratory_activities();
            }
            if (back.equalsIgnoreCase("x")) {
                log.logout();
            }
        }
        if (select.equalsIgnoreCase("x")) {
            log.logout();
        }
        if (select.equals("<")) {
            cop.laboratory_activities();
        }
    }
}

class GuessingGame extends MainClass { // 05 Hands-on Activity 1
    nextForGuessingGame next = new nextForGuessingGame();
    static int attempts = 1;

    public void GuessingGame() {

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(50) + 1;
        new GuessingGame(randomNumber);
    }

    public GuessingGame(int randomNumber) {
        try (Scanner s = new Scanner(System.in)) {

            System.out.println("Guess a number from 1 to 50!");

            int guess;
            try {
                do {
                    guess = s.nextInt();
                    if (guess == randomNumber) {
                        System.out.println("You got it in " + attempts + " attempt(s)!");

                        next.next();
                    } else if (guess < randomNumber) {
                        System.out.println("Too low. Try again.");
                        attempts++;
                    } else if (guess > randomNumber) {
                        System.out.println("Too high. Try again.");
                        attempts++;
                    }
                } while (true);
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input.");
                new GuessingGame(randomNumber);
            }
        }
    }

    public GuessingGame() {
        // Constructor
    }
}

class nextForGuessingGame extends Midterm_LA { // Extension only for GuessingGame class
    public void next() {
        Compilations_of_Programs cop = new Compilations_of_Programs();
        System.out.println("\n< Go back | << Go back to Period MENU");
        Logout log = new Logout();
        System.out.print("Select: ");
        String back = s.nextLine();

        if (back.equals("<")) {
            midterm_la(); // MENU for PRELIM
        }
        if (back.equals("<<")) {
            cop.laboratory_activities();
        }
        if (back.equalsIgnoreCase("x")) {
            log.logout();
        }
    }
}

class QuizBee extends MainClass { // 05 Hands-on Activity 2
    public void quizbee() {
        String question[] = new String[10];

        String answer;
        char Answer;
        int correct = 0;
        int x = 0;

        question[0] = "Who creates the Vitruvian Man?";
        question[1] = "Who was the first man to step into the moon?";
        question[2] = "Who is the real inventor of telescope?";
        question[3] = "What is the real name of Buddha?";
        question[4] = "Who designed Java?";
        question[5] = "Who invented the elevator?";
        question[6] = "In which European country you would find Orly airport?";
        question[7] = "In Java, Array index start with?";
        question[8] = "Who wrote Hamlet?";
        question[9] = "Who painted the Starry Night?";

        String choiceA[] = { "Wolfram von Eschenbach", "Neil Armstrong", "Felix Ulf Kjellberg", "Siddharta Taugama",
                "James Gosling", "Joseph Stalin", "Russia", "0", "Donatello", "Vincent Van Gogh" };

        String choiceB[] = { "Leonardo da Vinci", "Isaac Newton", "William Dafoe", "Mohandas Karamchand Gandhi",
                "Java Man",
                "Elisha Otis", "Paris", "1", "Raffaello Sanzio da Urbino", "Vincent Manansala" };

        String choiceC[] = { "Michaelangelo Bounarotti", "Adolf Hitler", "Galileo Galilei", "SiddhÄrtha Gautama",
                "Java D'oro",
                "Vladimir Lenin", "Poland", "a", "William Shakespeare", "Vince Vaughn" };

        String CorrectAnswer[] = { "B", "A", "C", "C", "A", "B", "B", "A", "C", "A"
        };

        do {
            try {
                System.out.print((x + 1) + ". ");
                System.out.println("" + question[x]);
                System.out.println("");
                System.out.println("A. " + choiceA[x]);
                System.out.println("B. " + choiceB[x]);
                System.out.println("C. " + choiceC[x]);
                System.out.print("\nAnswer: ");
                answer = s.nextLine();
                System.out.println("");
                Answer = answer.charAt(0);

                if (answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B") || answer.equalsIgnoreCase("C")) {
                    if (answer.equalsIgnoreCase(CorrectAnswer[x])) {
                        correct++;
                    }
                } else if (answer.equals("") || (answer.length() == 0)) {
                    throw new Exception("No answer" + "\n");
                } else if (!((Answer >= 65 && Answer <= 90) || (Answer >= 97 && Answer <= 122))) {
                    throw new SpecialCharacter();
                } else {
                    throw new InvalidLetter();
                }
                x++;
            } catch (SpecialCharacter ex) {
                System.out.print(ex.getMessage() + "\n");
            } catch (InvalidLetter il) {
                System.out.println(il.getMessage() + "\n");
            } catch (Exception sc) {
                System.out.println(sc.getMessage() + "\n");
            }
        } while (x < 10);
        System.out.print("SCORE: " + correct + "/10");

    }

    public void quizBee() {
        new QuizBee();
    }
}

class SpecialCharacter extends Exception {
    public SpecialCharacter() {
        super("Invalid input!" + "\nNumber or any special character are invalid" + "\nTRY AGAIN\n");
    }
}

class InvalidLetter extends Exception {
    public InvalidLetter() {
        super("Invalid input!" + "\nOut of range");
    }
}

class LabExer6A extends MainClass { // 06 Hands-on Activity 1
    public void LabExer6A() {

        String fileName = "d:\\words.txt";
        Path path = Paths.get(fileName.toString());
        String temporaryArray[] = new String[10];
        String newArray[];
        Random rnd = new Random();

        String hiddednWord;
        String displayedWord;

        int counter = 0;

        try {
            InputStream input = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String word = null;

            while ((word = reader.readLine()) != null) {
                temporaryArray[counter] = word;
                counter++;
            }
            newArray = new String[counter];
            newArray = temporaryArray;

            hiddednWord = newArray[rnd.nextInt(counter)];
            displayedWord = hiddednWord;

            for (int x = 0; x < hiddednWord.length() - 2; x++) {
                displayedWord = displayedWord.replace(displayedWord.charAt(rnd.nextInt(displayedWord.length())), '?');
            }
            boolean True = true;
            boolean Found = false;

            do {
                System.out.println(displayedWord.toUpperCase());

                System.out.print("Enter your guess word or letter: ");
                String guess = s.nextLine();

                if (guess.length() > 1) {
                    if (guess.equalsIgnoreCase(hiddednWord)) {
                        System.out.println("CONGRATULATIONS! You got it.");
                        break;
                    } else {
                        System.out.println("WRONG! Try again.");
                    }
                } else {
                    Found = false;
                    for (int x = 0; x < hiddednWord.length(); x++) {
                        if (guess.equalsIgnoreCase(String.valueOf(hiddednWord.charAt(x)))) {
                            displayedWord = displayedWord.substring(0, x) + guess + displayedWord.substring(x + 1);
                            Found = true;
                        }
                    }
                }
                if (Found == true) {
                    System.out.println(guess.toUpperCase() + " letter is found!" + "\nKeep going" + "\n");
                } else {
                    System.out.println(
                            "Your guessed letter" + " (" + guess.toUpperCase() + ")" + " is not in the word!" + "\n");
                }
            } while (True);

        } catch (IOException ex) {

        }
    }

    public static void main(String[] args) {
        new LabExer6A();
    }
}

// END OF MIDTERM (LABORATORY ACTIVITIES)
// -----------------------------------------------------------------------------------------------------------
// START OF PRE-FINAL (LABORATORY ACTIVITIES)
class PreFinal_LA extends MainClass { // contains all the Laboratory Activities for the Pre-Final period, in
    // chronological order
    public void preFinal_la() {
        CarDemo car_demo = new CarDemo();
        studentNumber student_number = new studentNumber();
        Compilations_of_Programs cop = new Compilations_of_Programs();
        Logout log = new Logout();
        System.out.println("====================================");
        System.out.println("PRE-FINAL");
        System.out.println("[1] 07 Hands-on Activity 1" +
                "\n[2] 08 Hands-on Activity 1");
        System.out.println("\n< Go back | x Log out");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            System.out.println("======================================================");
            System.out.println("07 Enumerations and Nested Classes (Pre-final)");
            System.out.println("\n07 Hands-on Activity 1\n");

            car_demo.CarDemo();

            System.out.println("< Go back | << Go back to Period MENU");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                preFinal_la();
            }
            if (back.equals("<<")) {
                cop.laboratory_activities();
            }
            if (back.equalsIgnoreCase("x")) {
                log.logout();
            }
        }
        if (select.equals("2")) {
            System.out.println("====================================");
            System.out.println("08 Regular Expressions (Pre-final)");
            System.out.println("\n08 Hands-on Activity 1\n");

            student_number.main();

            System.out.println("\n< Go back | << Go back to Period MENU");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                preFinal_la();
            }
            if (back.equals("<<")) {
                cop.laboratory_activities();
            }
            if (back.equalsIgnoreCase("x")) {
                log.logout();
            }
        }
        if (select.equals("<")) {
            cop.laboratory_activities();
        }
        if (select.equalsIgnoreCase("x")) {
            log.logout();
        }
    }
}

class Color { // 07 Hands-on Activity 1
    enum color {
        VANTABLACK, WHITE, MAROON, PURPLE, YELLOW, BROWN
    };
}

class Model {
    enum model {
        SEDAN, SUV, CONVERTIBLE, HATCHBACK
    };
}

class Car {
    private int year;
    private Model.model model;
    private Color.color color;

    Car(int yr, Model.model m, Color.color c) {
        year = yr;
        model = m;
        color = c;
    }

    public void display() {
        System.out.println("MODEL: " + model + " | YEAR: " + year + " | COLOR: " + color + "\n");
    }
}

class CarDemo {
    public void CarDemo() {
        Car car1 = new Car(2021, Model.model.SUV, Color.color.WHITE);
        Car car2 = new Car(2016, Model.model.SEDAN, Color.color.VANTABLACK);

        car1.display();
        car2.display();
    }
}

class studentNumber extends MainClass { // 08 Hands-on Activity 1
    public void studentNumber() {
        try {
            System.out.print("Enter you student number: ");
            String studentNumber = s.nextLine();

            Pattern pattern = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{3}");
            Matcher matcher = pattern.matcher(studentNumber);

            if (matcher.matches() == true) {
                System.out.println("You have successfully logged in.");
            } else {
                System.out.println("An error has occured.");
                String answer;
                System.out.println("Try again? Yes|No");
                answer = s.nextLine();

                if (answer.equalsIgnoreCase("Yes")) {
                    line();
                    studentNumber();
                }
                if (answer.equalsIgnoreCase("No")) {
                    System.out.println("Program Exit.");
                }
                if (answer.equals("")) {
                    System.out.println("An error has occured.");
                }
            }
        } catch (Exception ex) {
            System.out.println("An error has occured");
        }
    }

    private void format() {
        System.out.println("Format: 0000-00-000");
        System.out.println("=====================================");
    }

    private static void line() {
        System.out.println("=====================================");
    }

    public void main() {
        format();
        studentNumber();
    }
}

// END OF PRE-FINAL (LABORATORY ACTIVITIES)
// -----------------------------------------------------------------------------------------------------------
// START OF FINALS (LABORATORY ACTIVITIES)
class Finals_LA extends MainClass { // contains all the Laboratory Activities for the Finals period, in
    // chronological order
    public void finals_la() {
        Compilations_of_Programs cop = new Compilations_of_Programs();
        Logout log = new Logout();
        ThreadActivity thread = new ThreadActivity();
        System.out.println("====================================");
        System.out.println("FINALS");
        System.out.println("[1] 09 Hands-on Activity 1");
        System.out.println("\n< Go back | x Log out");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            System.out.println("======================================================");
            System.out.println("07 Enumerations and Nested Classes (Pre-final)");
            System.out.println("\n07 Hands-on Activity 1\n");
            thread.thread_activity();

            System.out.println("\n< Go back | << Go back to Period MENU");
            System.out.print("Select: ");
            String back = s.nextLine();

            if (back.equals("<")) {
                finals_la();
            }
            if (back.equals("<<")) {
                cop.laboratory_activities();
            }
            if (back.equalsIgnoreCase("x")) {
                log.logout();
            }
            if (back.equalsIgnoreCase("x")) {
                log.logout();
            }
        }
        if (select.equals("<")) {
            cop.laboratory_activities();
        }
        if (select.equals("x")) {
            log.logout();
        }
    }
}

class ThreadActivity extends Thread {
    public void thread_activity() {

        Scanner s = new Scanner(System.in);
        ThreadActivity thread1 = new ThreadActivity();
        ThreadActivity thread2 = new ThreadActivity();

        String thread1Name, thread2Name;

        System.out.print("Name your first thread: ");
        thread1Name = s.nextLine();
        System.out.print("Name your second thread: ");
        thread2Name = s.nextLine();

        thread1.setName(thread1Name);
        thread2.setName(thread2Name);

        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());

        System.out.println("\n\nStarting the threads...");
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\nAfter sleep...");
        System.out.println(thread1.getName() + " is " + Thread.State.TERMINATED);
        System.out.println(thread2.getName() + " is " + Thread.State.TERMINATED);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().getState());
    }
}

// END OF FINALS (LABORATORY ACTIVITIES)
// -----------------------------------------------------------------------------------------------------------
// START OF APPLICATION PROGRAM
class Application_Program {
    public void application_program() {
        Compilations_of_Programs cop = new Compilations_of_Programs();
        Logout log = new Logout();
    }
}

class Application_Program1 extends MainClass {
    Logout log = new Logout();
    Scanner input = new Scanner(System.in);
    // PRICES
    int silentHill = 599;
    int silentHill2 = 759;
    int silentHill3 = 898;
    int rdr = 1150;
    int rdr2 = 2300;
    int got = 2999;
    int er = 2990;
    int bb = 1795;
    int ssdt = 1595;

    public void intro() {
        System.out.println("\nWelcome to Game Stop\n");
        Interface();
    }

    public void Interface() {
        System.out.println("Services\n[1] Buy a Game\n[2] Buy a console | PC parts");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals("1")) {
            System.out.println("\nChoose a genre");
            genre();
        }
        if (option.equals("2")) {
            Techs();
        }
    }

    public void genre() {
        System.out.println("[1] Horror\n[2] Action\n[3] Action/Role-playing \n						[<] Back");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals("1")) {
            Horror();
        }
        if (option.equals("2")) {
            Action();
        }
        if (option.equals("3")) {
            Souls();
        }
        if (option.equals("<")) {
            System.out.println();
            Interface();
        }
    }

    public void Horror() {
        System.out.println("\nCategory: Horror      Price");
        System.out.println("\n[1] Silent Hill       " + silentHill + " Php");
        System.out.println("[2] Silent Hill 2     " + silentHill2 + " Php");
        System.out.println("[3] Silent Hill 3     " + silentHill3 + " Php");
        System.out.println("						[<] Back");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            SilentHill();
        }
        if (select.equals("2")) {
            SilentHill2();
        }
        if (select.equals("3")) {
            SilentHill3();
        }
        if (select.equals("<")) {
            genre();
        }
    }

    // UNDER THE HORROR CATEGORY
    public void SilentHill() {
        System.out.println("\nTotal Bill: " + silentHill);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < silentHill) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                SilentHill();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == silentHill) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > silentHill) {
            System.out.println("Change: " + (payment - silentHill));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void SilentHill2() {
        System.out.println("\nTotal Bill: " + silentHill2);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < silentHill2) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                SilentHill2();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == silentHill2) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > silentHill2) {
            System.out.println("Change: " + (payment - silentHill2));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void SilentHill3() {
        System.out.println("\nTotal Bill: " + silentHill3);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < silentHill3) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                SilentHill3();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == silentHill3) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > silentHill3) {
            System.out.println("Change: " + (payment - silentHill3));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void Action() {
        System.out.println("\nCategory: Action              Price");
        System.out.println("\n[1] Red Dead Redemption       " + rdr + " Php");
        System.out.println("[2] Red Dead Redemption 2     " + rdr2 + " Php");
        System.out.println("[3] Ghost of Tsushima         " + got + " Php");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            RDR();
        }
        if (select.equals("2")) {
            RDR2();
        }
        if (select.equals("3")) {
            GOT();
        }
    }

    // UNDER THE ACTION CATEGORY
    public void RDR() {
        System.out.println("\nTotal Bill: " + rdr);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < rdr) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                RDR();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == rdr) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > rdr) {
            System.out.println("Change: " + (payment - rdr));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void RDR2() {
        System.out.println("\nTotal Bill: " + rdr2);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < rdr2) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                RDR2();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == rdr2) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > rdr2) {
            System.out.println("Change: " + (payment - rdr2));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void GOT() {
        System.out.println("\nTotal Bill: " + got);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < got) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                GOT();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == got) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > got) {
            System.out.println("Change: " + (payment - got));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void Souls() {
        System.out.println("\nCategory: Action/Role-playing        Price");
        System.out.println("\n[1] Elden Ring                       " + er + " Php");
        System.out.println("[2] Sekiro: Shadows Die Twice        " + ssdt + " Php");
        System.out.println("[3] Bloodborne                       " + bb + " Php");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            ER();
        }
        if (select.equals("2")) {
            SSDT();
        }
        if (select.equals("3")) {
            BB();
        }
    }

    // UNDER THE SOULS CATEGORY
    public void ER() {
        System.out.println("\nTotal Bill: " + er);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < er) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                ER();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == er) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > er) {
            System.out.println("Change: " + (payment - er));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void BB() {
        System.out.println("\nTotal Bill: " + bb);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < bb) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                BB();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == bb) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > bb) {
            System.out.println("Change: " + (payment - bb));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void SSDT() {
        System.out.println("\nTotal Bill: " + ssdt);
        System.out.print("Input Payment: ");
        int payment = s.nextInt();

        if (payment < ssdt) {
            System.out.println("Not enough cash");
            System.out.println("> Try again | x Log out");
            System.out.print("Select: ");
            String tryagain = input.nextLine();

            if (tryagain.equals(">")) {
                SSDT();
            }
            if (tryagain.equals("x")) {
                log.logout();
            }
        }
        if (payment == ssdt) {
            System.out.println("Change: ---");
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
        if (payment > ssdt) {
            System.out.println("Change: " + (payment - ssdt));
            System.out.print("Processing payment");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // Set time duration (500 half a seconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nPayment Successful");
            System.out.println();
            log.logout1();
        }
    }

    public void Techs() {
        System.out.println("\n[1] Consoles\n[2] PC Parts");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals("1")) {
            consoles();
        }
        if (option.equals("2")) {
            PCParts();
        }
    }

    public void PCParts() { // PC PARTS (UNDER MAINTENANCE)
        System.out.println("\nThis section is currently under maintenance");
        System.out.println("Please come back again");
        System.out.print("Press < to go back: ");
        String press = s.nextLine();
        if (press.equals("<")) {
            Techs();
        }
    }

    public void consoles() { // CONSOLES
        System.out.println(
                "\n[1] PlayStation 5\n[2] PlayStation 4 Pro\n[3] PlayStation 4\n[4] PlayStation 2\n[5] Xbox Series X" +
                        "\n[6] Nintendo Switch OLED\n[7] Nintendo Switch Lite ");
        System.out.println("Select a number from 1-7 | Press < to go back: ");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("1")) {
            Ps5();
        }
        if (select.equals("2")) {
            Ps4Pro();
        }
        if (select.equals("3")) {
            Ps4();
        }
        if (select.equals("4")) {
            Ps2();
        }
        if (select.equals("5")) {
            XboxSeriesX();
        }
        if (select.equals("6")) {
            NSOLED();
        }
        if (select.equals("7")) {
            NSL();
        }
        if (select.equals("<")) {
            Techs();
        }
    }

    public void XboxSeriesX() { // XBOX SERIES X
        int XboxSeriesXPrice = 32000;
        System.out.println("\nXbox Series X (Microsoft's latest offering)");
        System.out.println("\n> Purchase | Press < to go back | ? View specifications");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals(">")) {
            System.out.println("\nTotal Bill: " + XboxSeriesXPrice);
            System.out.print("Input Payment: ");
            int payment = s.nextInt();

            if (payment < XboxSeriesXPrice) {
                System.out.println("Not enough cash");
                System.out.println("> Try again | x Log out");
                System.out.print("Select: ");
                String tryagain = input.nextLine();

                if (tryagain.equals(">")) {
                    XboxSeriesX();
                }
                if (tryagain.equals("x")) {
                    log.logout();
                }
            }
            if (payment == XboxSeriesXPrice) {
                System.out.println("Change: ---");
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
            if (payment > XboxSeriesXPrice) {
                System.out.println("Change: " + (payment - XboxSeriesXPrice));
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
        }
        if (option.equals("?")) {
            XboxSeriesXSpecs();
        }
        if (option.equals("<")) {
            consoles();
        }
    }

    public void XboxSeriesXSpecs() { // XBOX SERIES X SPECS
        System.out.println("\nSpecifications: CPU: 8x Cores @ 3.8 GHz (3.6 GHz w/ SMT) Custom Zen 2 CPU" +
                "\nGPU: 12 TFLOPS, 52 CUs @ 1.825 GHz Custom RDNA 2 GPU" +
                "\nDie Size: 360.45 mm2Process: 7nm Enhanced\nMemory: 16 GB GDDR6 w/ 320b bus" +
                "\nMemory Bandwith: 10GB @ 560 GB/s, 6GB @ 336 GB/s" +
                "\nInternal Storage: 1TB Custom NVME SSD\nI/O Throughput: 2.4 GB/s (Raw), 4.8 GB/s" +
                "\nExpandable Storage: 1TB Expansion Card (matches internal storage exactly)" +
                "\nExternal Storage: USB 3.2 External HDD Support" +
                "\nOptical Drive: 4K UHD Blu-ray Drive");

        System.out.print("\nPress < to go back: ");
        String press = s.nextLine();

        if (press.equals("<")) {
            XboxSeriesX();
        }
    }

    public void NSOLED() { // NINTENDO SWTICH OLED
        int NSOLEDPrice = 23595;
        System.out.println("\nNintendo Switch OLED (An upgraded classic)");
        System.out.println("\n> Purchase | Press < to go back | ? View specifications");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals(">")) {
            System.out.println("\nTotal Bill: " + NSOLEDPrice);
            System.out.print("Input Payment: ");
            int payment = s.nextInt();

            if (payment < NSOLEDPrice) {
                System.out.println("Not enough cash");
                System.out.println("> Try again | x Log out");
                System.out.print("Select: ");
                String tryagain = input.nextLine();

                if (tryagain.equals(">")) {
                    NSOLED();
                }
                if (tryagain.equals("x")) {
                    log.logout();
                }
            }
            if (payment == NSOLEDPrice) {
                System.out.println("Change: ---");
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
            if (payment > NSOLEDPrice) {
                System.out.println("Change: " + (payment - NSOLEDPrice));
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
        }
        if (option.equals("?")) {
            NSOLEDSpecs();
        }
        if (option.equals("<")) {
            consoles();
        }
    }

    public void NSOLEDSpecs() {
        System.out.println("\nSpecifications: \nDimensions: 4 x 9.5 x 5.4 inch(W x L x H) with Joy-Cons" +
                "\nGPU: 768MHz (docked)/307.2MHz (undocked) Nvidia custom Tegra SOC" +
                "\nRAM: 4 GB\nMax Resolution: docked 720p, undocked 1080p" +
                "\nOptical Drive: NoneStorage: 32GB (expandable)\nPortable battery life: approx 3 - 7 hours");

        System.out.print("\nPress < to go back: ");
        String press = s.nextLine();

        if (press.equals("<")) {
            NSOLED();
        }
    }

    public void NSL() { // NINTENDO SWITCH LITE
        int NSLPrice = 10780;
        System.out.println("\nNintendo Switch Lite (A dedicated handheld)");
        System.out.println("\n> Purchase | Press < to go back | ? View specifications");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals(">")) {
            System.out.println("\nTotal Bill: " + NSLPrice);
            System.out.print("Input Payment: ");
            int payment = s.nextInt();

            if (payment < NSLPrice) {
                System.out.println("Not enough cash");
                System.out.println("> Try again | x Log out");
                System.out.print("Select: ");
                String tryagain = input.nextLine();

                if (tryagain.equals(">")) {
                    NSL();
                }
                if (tryagain.equals("x")) {
                    log.logout();
                }
            }
            if (payment == NSLPrice) {
                System.out.println("Change: ---");
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
            if (payment > NSLPrice) {
                System.out.println("Change: " + (payment - NSLPrice));
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
        }
        if (option.equals("?")) {
            NSLSpecs();
        }
        if (option.equals("<")) {
            consoles();
        }
    }

    public void NSLSpecs() { // NINTENDO SWITCH LITE SPECS
        System.out.println("\nSpecifications: \nDimensions: 3.6 x 8.2 x .55 inch\nGPU: NVIDIA Custom Tegra processor" +
                "\nScreen: Capacitive touch screen / 5.5 inch LCD / 1280x720 resolution" +
                "\nStorage: 32GB (expandable)\nPortable battery life: approx 3 - 7 hours");

        System.out.print("\nPress < to go back: ");
        String press = s.nextLine();

        if (press.equals("<")) {
            NSL();
        }
    }

    public void Ps2() { // PS2
        int ps2Price = 16988;
        System.out.println("\nPlayStation 2");
        System.out.println("\n> Purchase | Press < to go back | ? View specifications");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals(">")) {
            System.out.println("\nTotal Bill: " + ps2Price);
            System.out.print("Input Payment: ");
            int payment = s.nextInt();

            if (payment < ps2Price) {
                System.out.println("Not enough cash");
                System.out.println("> Try again | x Log out");
                System.out.print("Select: ");
                String tryagain = input.nextLine();

                if (tryagain.equals(">")) {
                    Ps2();
                }
                if (tryagain.equals("x")) {
                    log.logout();
                }
            }
            if (payment == ps2Price) {
                System.out.println("Change: ---");
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
            if (payment > ps2Price) {
                System.out.println("Change: " + (payment - ps2Price));
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
        }
        if (option.equals("?")) {
            Ps2Specs();
        }
        if (option.equals("<")) {
            consoles();
        }
    }

    public void Ps2Specs() { // PS2 SPECS
        System.out.println("\nSpecifications: \nStorage: None\nCPU Cores: 1\nGPU Clock Speed: 147.0 MHz" +
                "\nGPU Speed: 0.3 GHz\nCPU Model: 1 Core 64-bit (Emotion Engine) clocked at 294.912 MHz" +
                "\nGPU Name: Graphics Synthesizer\nRAM Memory: 32 MB");

        System.out.print("\nPress < to go back: ");
        String press = s.nextLine();

        if (press.equals("<")) {
            Ps2();
        }
    }

    public void Ps4() { // PS4
        int Ps4Price = 29853;
        System.out.println("\nPlayStation 4");
        System.out.println("\n> Purchase | Press < to go back | ? View specifications");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals(">")) {
            System.out.println("\nTotal Bill: " + Ps4Price);
            System.out.print("Input Payment: ");
            int payment = s.nextInt();

            if (payment < Ps4Price) {
                System.out.println("Not enough cash");
                System.out.println("> Try again | x Log out");
                System.out.print("Select: ");
                String tryagain = input.nextLine();

                if (tryagain.equals(">")) {
                    Ps4();
                }
                if (tryagain.equals("x")) {
                    log.logout();
                }
            }
            if (payment == Ps4Price) {
                System.out.println("Change: ---");
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
            if (payment > Ps4Price) {
                System.out.println("Change: " + (payment - Ps4Price));
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
        }
        if (option.equals("?")) {
            Ps4Specs();
        }
        if (option.equals("<")) {
            consoles();
        }
    }

    public void Ps4Specs() { // PS4 SPECS
        System.out.println("\nSpecifications: \nDimensions: 11 x 10 x 1.5 inch(W x L x H)" +
                "\nGPU: 1.84 TFLOPS, AMD Radeon™ based graphics engine\nRAM: 8 GB of GDDR5Max Resolution: 1080p" +
                "\nOptical Drive: DVD/Blu-ray\nStorage: 500GB or 1TB (expandable)");

        System.out.print("\nPress < to go back: ");
        String press = s.nextLine();

        if (press.equals("<")) {
            Ps4();
        }
    }

    public void Ps4Pro() { // PS4 PRO
        int Ps4ProPrice = 26399;
        System.out.println("\nPlayStation 4 Pro");
        System.out.println("\n> Purchase | Press < to go back | ? View specifications");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals(">")) {
            System.out.println("\nTotal Bill: " + Ps4ProPrice);
            System.out.print("Input Payment: ");
            int payment = s.nextInt();

            if (payment < Ps4ProPrice) {
                System.out.println("Not enough cash");
                System.out.println("> Try again | x Log out");
                System.out.print("Select: ");
                String tryagain = input.nextLine();

                if (tryagain.equals(">")) {
                    Ps4Pro();
                }
                if (tryagain.equals("x")) {
                    log.logout();
                }
            }
            if (payment == Ps4ProPrice) {
                System.out.println("Change: ---");
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
            if (payment > Ps4ProPrice) {
                System.out.println("Change: " + (payment - Ps4ProPrice));
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
        }
        if (option.equals("?")) {
            Ps4ProSpecs();
        }
        if (option.equals("<")) {
            consoles();
        }
    }

    public void Ps4ProSpecs() { // PS4 PRO SPECS
        System.out.println("\nSpecifications: \nDimensions: 12.8 x 11.6 x 2.1 inch (W x L x H)" +
                "\nGPU: 4.20 TFLOPS, AMD Radeon™ based graphics engine" +
                "\nRAM: 8 GB of GDDR5, 1 GB DDR3\nMax Resolution: 2160p\nOptical Drive: DVD/Blu-ray" +
                "\nStorage: 1TB (expandable)");

        System.out.print("\nPress < to go back: ");
        String press = s.nextLine();

        if (press.equals("<")) {
            Ps4Pro();
        }
    }

    public void Ps5() { // PS5
        int Ps5Price = 38990;
        System.out.println("\nPlayStation 5 (Sony's latest offering)");
        System.out.println("\n> Purchase | Press < to go back | ? View specifications");
        System.out.print("Option: ");
        String option = s.nextLine();

        if (option.equals(">")) {
            System.out.println("\nTotal Bill: " + Ps5Price);
            System.out.print("Input Payment: ");
            int payment = s.nextInt();

            if (payment < Ps5Price) {
                System.out.println("Not enough cash");
                System.out.println("> Try again | x Log out");
                System.out.print("Select: ");
                String tryagain = input.nextLine();

                if (tryagain.equals(">")) {
                    Ps5();
                }
                if (tryagain.equals("x")) {
                    log.logout();
                }
            }
            if (payment == Ps5Price) {
                System.out.println("Change: ---");
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
            if (payment > Ps5Price) {
                System.out.println("Change: " + (payment - Ps5Price));
                System.out.print("Processing payment");
                for (int i = 5; i > 0; i--) {
                    System.out.print(".");
                    try {
                        Thread.sleep(500); // Set time duration (500 half a seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n\nPayment Successful");
                System.out.println();
                log.logout1();
            }
        }
        if (option.equals("?")) {
            Ps5Specs();
        }
        if (option.equals("<")) {
            consoles();
        }
    }

    public void Ps5Specs() { // PS5 SPECS
        System.out.println("\nSpecifications: \nCPU: AMD Zen 2-based CPU with 8 cores at 3.5GHz (variable frequency)" +
                "\nGPU: 10.28 TFLOPs, 36 CUs at 2.23GHz (variable frequency)\nGPU Architecture: Custom RDNA 2" +
                "\nMemory interface: 16GB GDDR6 / 256-bit\nMemory bandwidth: 448GB/s" +
                "\nInternal storage: Custom 825GB SSD\nUsable storage: 667.2GB" +
                "\nIO throughput: 5.5GB/s (raw), typical 8-9GB/s (compressed)" +
                "\nExpandable storage: NVMe SSD slot\nExternal storage: USB HDD support (PS4 games only)" +
                "\nOptical Drive: 4K UHD Blu-ray Drive (for standard edition)");

        System.out.print("\nPress < to go back: ");
        String press = s.nextLine();

        if (press.equals("<")) {
            Ps5();
        }
    }
}

// END OF APPLICATION PROGRAM
// -----------------------------------------------------------------------------------------------------------
// EXIT MENU
class ExitMenu extends MainClass {
    public void exit_menu() {
        Username username_password = new Username();
        System.out.println("\nStop the program? \nPress > to confirm");
        System.out.print("Select: ");
        String yesOrNo = s.nextLine();

        if (yesOrNo.equals(">")) {
            System.out.println("\nProgram stopped.");
            System.exit(0);
        }
        if (yesOrNo.length() == 0) {
            System.out.println("\nProgram stopped.");
            System.exit(0);
        }
    }

    public void exit_menu2() {
        System.out.print("Press x to stop the Program: ");
        String stop = s.nextLine();

        if (stop.equals("x")) {
            System.out.println("\nProgram stopped.");
            System.exit(0);
        }
        if (stop.length() == 0) {
            System.out.println("\nProgram stopped.");
            System.exit(0);
        }
    }
}

// LOG OUT MENU
class Logout extends MainClass {
    public void logout() {
        Compilation comp = new Compilation();
        System.out.println("\nAre you sure you want to Log out?");
        System.out.println("> Proceed to Log out | < Cancel");
        System.out.print("Select: ");
        String log = s.nextLine();

        if (log.equals(">")) {
            System.out.print("\nLogging out");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // time duration (500/half a second)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n\nSuccessfully logged out");
            System.exit(0);
        }
        if (log.equals("<")) {
            System.out.print("\nRedirecting you to MENU");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                try {
                    Thread.sleep(500); // time duration (500/half a second)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("\n");
            comp.compilation();
        }
    }

    // EXTENSION FOR LOG OUT MENU
    public void logout1() {
        Application_Program1 app = new Application_Program1();
        Compilation comp = new Compilation();

        System.out.println("<< Go back to MENU | x Log out");
        System.out.print("Select: ");
        String select = s.nextLine();

        if (select.equals("<<")) {
            System.out.println();
            app.Interface();
        }
        if (select.equalsIgnoreCase("x")) {
            logout();
        }
    }
}
