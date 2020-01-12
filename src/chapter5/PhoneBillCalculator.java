package chapter5;
import java.util.Scanner;
/*
Allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
I want you to create separate methods to calculate the tax, to calculate the overage fees and to calculate and print the final total.
*/
public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    static double chargeRate = 0.25;

    public static void main(String args[]) {

        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        double overageFee = calculateOverageFees(overageMinutes);
        double subTotal = planFee + overageFee;
        double tax = calculateTax(subTotal);
        calculatePrintTotal(planFee,overageFee,tax);
    }

    public static double calculateOverageFees(int overageMinutes){
        double overUsage = overageMinutes * chargeRate;
        return overUsage;
    }

    public static double calculateTax(double subTotal){
        double tax = subTotal * 0.15;
        return tax;
    }

    public static void calculatePrintTotal(double planFee, double overageFee, double tax){
        double total = planFee + overageFee + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}