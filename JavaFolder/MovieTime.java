import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class MovieTime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Queue <String> movies = new LinkedList <String> ();
        Queue <String> snacks = new LinkedList <String> ();
        for(int i=1;i<=3;i++) {
            System.out.print("Enter movie " + i + " of " + 3 + ": ");
            String movie = s.nextLine();
            movies.offer(movie);
        }
        for(int j=1;j<=3;j++) {
            System.out.print("Enter snack " + j + " of " + 3 + ": ");
            String snack = s.nextLine();
            snacks.offer(snack);
        }
        System.out.println("Movies to watch are: "+movies);
        System.out.println("Snacks available are: "+snacks);
        System.out.println("Press S each time you finish a snack");
        for(int x=0;x<3;x++) {
            String eat = s.nextLine();
            snacks.poll();
            if(snacks.size() == 0) {
            System.out.println("No more snacks.");
            }
            else {
                System.out.println("Snacks available are: "+snacks);
            }
        }
    }
}
