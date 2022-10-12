import java.util.*;
public class QuizBee {
	public QuizBee() {
		String question[] = new String[10];
		try (Scanner s = new Scanner(System.in)) {
			
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
		    
			String choiceA[] = {"Wolfram von Eschenbach","Neil Armstrong","Felix Ulf Kjellberg","Siddharta Taugama","James Gosling","Arthur Morgan and John Marston","Russa","0","Donatello","Vincent Van Gogh"};
			String choiceB[] = {"Leonardo da Vinci","Isaac Newton","William Dafoe","Mohandas Karamchand Gandhi","Java Man","Elisha Otis","Paris","1","Raffaello Sanzio da Urbino","Vincent Manansala"};
			String choiceC[] = {"Michaelangelo Bounarotti","Adolf Hitler","Galileo Galilei","Siddhārtha Gautama","Java D'oro","Dutch van der Linde","Poland","a","William Shakespeare","Vince Vaughn"};
			String CorrectAnswer[] = {"B","A","C","C","A","B","B","A","C","A"};
			
			do {
				try {
					System.out.print((x + 1) + ". " );
					System.out.println("" + question[x]);
					System.out.println("");
					System.out.println("A. " + choiceA[x]);
					System.out.println("B. " + choiceB[x]);
					System.out.println("C. " + choiceC[x]);
					System.out.print("\nAnswer: ");
					answer = s.nextLine();
					System.out.println("");
					Answer = answer.charAt(0);
					
					if(answer.equalsIgnoreCase("A")||answer.equalsIgnoreCase("B")||answer.equalsIgnoreCase("C")) {
						if(answer.equalsIgnoreCase(CorrectAnswer[x])) {
							correct++;
						}
					}else if(answer.equals("") || (answer.length()==0)) {
						throw new Exception("No answer" + "\n");
					}else if(!((Answer>=65 && Answer <= 90) || (Answer>=97 && Answer <= 122))) {
						throw new SpecialCharacter();
					}else {
						throw new InvalidLetter();
					}
					x++;
				}catch(SpecialCharacter ex) {
					System.out.print(ex.getMessage() + "\n");
				}catch(InvalidLetter il) {
					System.out.println(il.getMessage() + "\n");
				}catch(Exception sc) {
					System.out.println(sc.getMessage() + "\n");
				}
			}while(x < 10);
			System.out.print("SCORE: " + correct + "/10");
		}
	}
	public static void main(String[] args) {
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
