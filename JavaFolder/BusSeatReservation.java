import java.util.Scanner;
public class SeatReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bus Seat Reservation:");
        char matrix[][] = new char[11][10];

        //loop for columns
        for (int column_number = 1; column_number <= 4; column_number++) {
            System.out.print("    Col " + (column_number));
        }
        System.out.println();

        //loop for rows
        for (int row_number = 1; row_number <= 10; row_number++) {
            System.out.print("Row " + (row_number) + " | ");
            //loop for printing asterisk
            for (int column = 1; column <= 4; column++) {
                matrix[row_number][column] = '*';
                System.out.print(matrix[row_number][column] + "\t\t");
            }
            System.out.println();
        }
        while (true) {
            System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
            int x = input.nextInt();
            int y = input.nextInt();

            if ((x > 0 && y > 0)) {
                System.out.println("\nBus Seat Reservation:");

                for (int column_number = 1; column_number <= 4; column_number++) {
                    System.out.print("    Col " + (column_number));
                }
                System.out.println();

                for (int row_number = 1; row_number <= 10; row_number++) {
                    System.out.print("Row " + (row_number) + " | ");
                    for (int column = 1; column <= 4; column++) {
                        matrix[x][y] = 'X';
                        System.out.print(matrix[row_number][column] + "\t\t");
                    }
                    System.out.println();

                }
            } else {
                System.out.println("Program Exit!");
                break;
            }
        }
    }
}
