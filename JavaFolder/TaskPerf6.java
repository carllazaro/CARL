import java.util.InputMismatchException;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;
public class Account {
	Scanner s = new Scanner(System.in);
	String file = "C:\\Java\\Account\\records.txt";
	public Account() throws IOException {
		try {
			System.out.println("____________________________________________");
			System.out.println("\n		   WELCOME");
			System.out.println("____________________________________________");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.print("Select: ");
			String select = s.nextLine();
			
			if(select.contains("1")) {
				AccountRegistration();
			}
			else if(select.contains("2")) {
				AccountLogin();
			} else {
				System.out.println("\nAn error has occured");
				System.out.println("Press any key to continue");
				String con = s.nextLine();
				new Account();
			}
		}
		catch(InputMismatchException ex) {
			System.out.print("An error has occured");
		}
	}
	void AccountLogin() throws IOException {
		try {
			Path path = Paths.get(file.toString());
			InputStream inputData = Files.newInputStream(path);
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputData));
			System.out.println("Selected: Login");
			System.out.print("\nEnter username: ");
			String username = s.nextLine();
			System.out.print("Enter password: ");
			String password = s.nextLine();
			String temp = null;
			String user;
			String pass;
			boolean found = false;
			while((temp = inputReader.readLine()) != null) {
				String[] account = temp.split("/");
				user = account[0];
				pass = account[1];
				
				if(user.equals(username) && pass.equals(password)) {
					found = true;
				}
			}
			if(found == true) {
				System.out.println("Account successfully Logged in");
			}else {
				System.out.println("Account not found");
			}
			inputReader.close();
			System.out.println("Press any key to continue");
			String pressKey = s.nextLine();
			new Account();
		}
		catch(InputMismatchException ex) { 
			System.out.print("An error has occured");
		}
	}
	void AccountRegistration() throws IOException {
		try {
			Path path = Paths.get(file.toString());
			OutputStream outputData = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
			BufferedWriter writeData = new BufferedWriter(new OutputStreamWriter(outputData));
			System.out.println("Selected: Register");
			System.out.print("\nCreate username: ");
			String username = s.nextLine();
			System.out.print("Create password: ");
			String password = s.nextLine();
			
			String regex = "\\p{Alpha}+\\d+";
			
			if(username.matches(regex)) {
				writeData.write(username +  "/" + password);
				writeData.newLine();
				System.out.println("Account has been successfully registered.");
				writeData.close();
				outputData.close();
				
				System.out.println("Press any key to continue");
				String pressKey = s.nextLine();
				
				new Account();
			}
			else if(username.equals("") || (username.length()==0)) {
				System.out.println("Please input something");
				System.out.println("Press any key to continue");
				String pressKey = s.nextLine();
				new Account();
			}
			else {
			System.out.println("INVALID INPUT: Alphanumeric characters only!");
			System.out.println("Press any key to continue");
			String pressKey = s.nextLine();
			new Account();
			}
		}
		catch(InputMismatchException ex) {
			System.out.println("An error has occured");
		}
	}
	public static void main(String[] args) throws IOException {
		new Account();
	}
}
