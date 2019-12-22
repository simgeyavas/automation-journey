package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String args[]) {

        double besKurus = .05;
        double onKurus = .10;
        double yirmibesKurus = .25;
        double elliKurus = .50;
        int tl = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many beş kuruş would you like?");
        int bes = scanner.nextInt();

        System.out.println("How many on kuruş would you like?");
        int on = scanner.nextInt();

        System.out.println("How many yirmi beş kuruş would you like?");
        int yirmibes = scanner.nextInt();

        System.out.println("How many elli kuruş would you like?");
        int elli = scanner.nextInt();

        scanner.close();

        double total = bes * besKurus + on * onKurus + yirmibes * yirmibesKurus + elli * elliKurus;

        if(total > tl) {
            double artan = total-tl;
            System.out.println("Sorry! It's more than one dollar. You went over " +String.format("%.2f", artan)+ " kuruş.");
        }
        else if(total<tl) {
            double kalan = total-tl;
            System.out.println("Sorry! t's less than one dollar, You went under " +String.format("%.2f", kalan)+ "kuruş.");
        }
        else
            System.out.println("Congrats! It's exactly one dollar. You win the game!");

        }
    }

