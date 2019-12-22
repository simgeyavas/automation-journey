package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]) {

        //1.asks a user for a season of the year
        System.out.println("Which season of the year?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2.then a whole number
        System.out.println("How many cup?");
        int cupCount = scanner.nextInt();

        //3.then an adjective
        System.out.println("Type an adjective");
        String adjective = scanner.next();
        scanner.close();

        //4.And use the input to complete the sentence below.
        // On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee.
        System.out.println("On a " +adjective+ " " +season+ " day, I drink a minimum of " +cupCount+ " cups of coffee.");
    }
}
