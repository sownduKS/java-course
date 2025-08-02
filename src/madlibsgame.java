import java.util.Scanner;

public class madlibsgame {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String verb;
        String adjective2;
        String noun;

        System.out.println("Type an adjective (describe): ");
        adjective1 = scanner.nextLine();
        System.out.println("Type an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Type an noun (animal): ");
        noun = scanner.nextLine();
        System.out.println("Type an verb (in ed): ");
        verb = scanner.nextLine();




        System.out.println("The lazy " + adjective1 + " " + noun + " wore a "+ adjective2+ " hat. ");
        System.out.println("It "+ verb + " on a table in a fancy restaurant.");
        System.out.println("Nobody stopped it—they were too shocked to move.");

        scanner.close();



    }
}

