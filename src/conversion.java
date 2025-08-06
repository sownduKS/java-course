import java.util.Scanner;
public class conversion {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("Choose 1 to convert lbs to kgs");
        System.out.println("Choose 2 to convert kgs to lbs");

        System.out.println("Enter your choice(1/2): ");
        choice = scanner.nextInt();

        if(choice==1){
            System.out.print("Enter weight in lbs");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("Your weight in kgs: %.2f" + newWeight);
        }
        else if(choice==2){
            System.out.print("Enter weight in kgs");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("Your weight in lbs: %.2f" + newWeight);
        }
        else {
            System.out.println("That is not a valid choice");
        }


        scanner.close();
    }
}
