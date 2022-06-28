/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){
        System.out.println("Guess the number");
        int winCon = 0;
        int guessCount = 0;
        int lastGuess = 100;
        Random rand = new Random();
        int max = 10;
        int randNum = rand.nextInt(max);
        do {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

            if (lastGuess == num){
                System.out.println("You just guessed that");
            }
              else if (num < randNum) {
                System.out.println("Too Low");
                guessCount++;
                lastGuess = num;
            } else if (num > randNum) {
                System.out.println("Too High");
                guessCount++;
                lastGuess = num;
            } else {
                System.out.println("Correct!");
                guessCount++;
                System.out.println(guessCount + " Guesses");
                winCon = 1;
                in.close();
            }
        }while (winCon == 0);



    }
}
