import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class LabExer6A {
    public LabExer6A() {
        String fileName = "d:\\words.txt";
        Path path = Paths.get(fileName.toString());
        String temporaryArray[] = new String[10];
        String newArray[];
        Random rnd = new Random();
        try (Scanner s = new Scanner(System.in)) {
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
                            System.exit(0);
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
                        System.out.println("Your guessed letter" + " (" + guess.toUpperCase() + ")" + " is not in the word! +" + "\n");
                    }
                } while (True);

            } catch (IOException ex) {

            }
        }
    }
    public static void main(String[] args) {
        new LabExer6A();
    }
}
