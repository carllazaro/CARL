 import java.util.*;
 class Employee {
     private String name;

     public Employee(String name) {
         setName(name);
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }
 }
 class FullTimeEmployee extends Employee {
     private double monthlySalary;

     public FullTimeEmployee(String name) {
         super(name);
     }

     public void setMonthlySalary(double salary) {
         monthlySalary = salary;
     }

     public double getMonthlySalary() {
         return monthlySalary;
     }

     public String toString() {
         return ("Name: " + getName() + "\nMonthly Salary: " + monthlySalary);
     }
 }
 class PartTimeEmployee extends Employee {
     private double ratePerHour;
     private int hoursWorked;
     private double wage;
     public PartTimeEmployee(String name) {
         super(name);
     }

     public void setWage(double rate, int hours) {
         ratePerHour = rate;
         hoursWorked = hours;
         wage = Math.round((ratePerHour * hoursWorked) * 100.0) / 100.0;
     }

     public double getWage() {
         return wage;
     }

     public String toString() {
         return ("Name: " + getName() + "\nWage: " + wage);
     }
 }
 public class RunEmployee {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter name: ");
         String name = input.nextLine();

         System.out.println("Press F for Full Time or P for Part Time");
         System.out.print("");
         String type = input.nextLine();
         if (type.compareToIgnoreCase("F") == 0) {
             FullTimeEmployee employee = new FullTimeEmployee(name);

             System.out.println("Enter monthly salary: ");
             employee.setMonthlySalary(input.nextDouble());

             System.out.println(employee);
         } else if (type.compareToIgnoreCase("P") == 0) {
             PartTimeEmployee employee = new PartTimeEmployee(name);

             System.out.println("Enter rate per hour and no. of hours worked separated by space: ");
             double rate = input.nextDouble();
             employee.setWage(rate, input.nextInt());

             System.out.println(employee);
         }
     }
 }
