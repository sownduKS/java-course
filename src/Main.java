import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("What is your age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your age is:" + age);
        if (age>=18){
            System.out.println("You can vote!");
        }
        else{
            System.out.println("Sorry, You cannot vote!");
        }
        System.out.println("Your fav color:");
        String color = scanner.nextLine();
        System.out.println("Your name is " + name + ". Your age is " + age + ". You like the color " + color);

        scanner.close();
    }
}
