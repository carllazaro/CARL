import java.util.Scanner;
public class Main extends Thread {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Main thread1 = new Main();
		Main thread2 = new Main();
		
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
