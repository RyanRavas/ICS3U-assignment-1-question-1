import java.util.Random;
import java.util.Scanner;

public class Main {

//  Ryan Ravas
//  4/4/2024

    public static void main(String[] args) {
//      initialize required variables
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int numOfRolls, die1, die2;
        String userInput;
        do {
//          ask user if they want to play
            System.out.println("It costs $5 per play, would you like to play? (yes or no)");
            userInput = input.next();
            if (userInput.equalsIgnoreCase("no")) {
                break;
            }
//          reset numOfRolls each loop
            numOfRolls = 0;
//          loops until doubles is "rolled"
            while (true) {
//              simulate two die rolls
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
//              increment number of rolls
                numOfRolls++;
//              user wins
                if (die1 == die2 && numOfRolls <= 5) {
                    System.out.printf("It took %d roll(s) to get doubles.\n", numOfRolls);
                    System.out.println("You win $10");
                    break;
                }
//              user loses
                else if (die1 == die2){
                    System.out.printf("It took %d rolls to get doubles\n", numOfRolls);
                    System.out.println("You lose. :(");
                    break;
                }
            }
        } while (true);
    }
}