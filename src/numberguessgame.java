import java.util.Scanner;
import java.util.Random;

public class numberguessgame {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int randomNumber = random.nextInt(1,11);
        int attempts=0;

        System.out.println("Number guessing game");
        System.out.println("Enter a number between 1 to 10");
        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess>randomNumber){
                System.out.println("HINT: The number is below that");
            }
            else if(guess<randomNumber) {
                System.out.println("HINT: The number is above that");
            }
            else{
                System.out.println("CORRECT!! The number was "+ guess);
                System.out.println("ATTEMPTS TRIED: " + attempts);
            }

        }while(guess != randomNumber);



        scanner.close();
    }
}
