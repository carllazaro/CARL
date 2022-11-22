import java.util.Scanner;
public class GrossPayCalculator {
    public static void main(String[] args) {
        String EmployeeName; char EmployeeType;

        String bar = "_________________________________________";

        int WorkHours, overtimes; 
        double rate, BasicPay, otPay, GrossPay;
        Scanner tField = new Scanner(System.in);

            System.out.print("Please enter your name: ");

        EmployeeName = tField.nextLine().trim();

            System.out.print("Press F for full time or P for part time: ");

        EmployeeType = tField.next().charAt(0);

            if (EmployeeType == 'F') {
            System.out.println("---Full Time Employee---");
            System.out.print("Enter BasicPay: ");
            BasicPay = tField.nextInt();
            GrossPay = BasicPay;
            System.out.println(bar);
            System.out.println("Employee Name: " + EmployeeName);
            System.out.printf("Basic Pay: %.2f\n", BasicPay);
            System.out.println(bar);
            System.out.printf("Gross Pay: %.2f", GrossPay);
            
            }
            else if (EmployeeType == 'P') {
            System.out.println("---Part Time Employee---");
            System.out.print("Enter rate per hour: ");
            rate = tField.nextDouble();

            System.out.print("Enter no. of hours worked: ");
            WorkHours = tField.nextInt();

            System.out.print("Enter no of overtime: ");
            overtimes = tField.nextInt();

            otPay = overtimes * (rate * 1.25);
            BasicPay = rate * WorkHours;
            GrossPay = BasicPay + otPay;
            System.out.println(bar);
            System.out.printf("Basic Pay: %.2f\n", BasicPay);
            System.out.printf("Overtime Pay: %.2f\n", otPay);
            System.out.println(bar);
            System.out.printf("Gross Pay: %.2f", GrossPay);
            
            }
            else {
                System.out.println("Error");
                }
            tField.close();
        
    }
}
