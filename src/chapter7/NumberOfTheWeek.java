package chapter7;

import java.util.Scanner;

public class NumberOfTheWeek {

    public static void main(String args[]) {

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day corresponding to week:");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Day of the week: " + week[number-1]);

    }
}
