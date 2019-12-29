package chapter4;
import java.util.Random;

public class RollTheDie {
    /*The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
    Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
    Random random = new Random();
    int die = random.nextInt(6) + 1;
    After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
    Repeat this 4 additional times, for 5 rolls in total.
    However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
    If they are greater than or less than 20 spaces exactly, they lose.
    Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.*/

    public static void main(String args[]){
        Random random = new Random();
        int move = 0;
        int total = 20;
        int maxRoll = 5;

        for(int i=1; i<=maxRoll; i++){
            int die = random.nextInt(6) + 1;
            move = move + die;
            System.out.println("Roll #" + i + ":You've rolled a " + die);

            if(move>total){
                System.out.println("You are now on space " + move + ". You've lost.");
                break;
            }
            else if(move==total){
                System.out.println("You are now on space " + move + ". Congrats, you win!");
                break;
            }
            else if(i==maxRoll && move<total){
                System.out.println("You are now on space " + move + ". You've lost.");
            }
            else {
                int remain = total - move;
                System.out.println("You are now on space " + move + " and have " + remain + " more to go.");
            }

            System.out.println();
        }
    }
}
