import java.util.Scanner;
public class condition {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Your age:");
        age = scanner.nextInt();

        System.out.println("are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();


        if(name.isEmpty()){
            System.out.println("you didnt enter your name");
        }
        else{
            System.out.println("hello " + name );
        }


        if(age>=18){
            System.out.println("you are an adult");
        }
        else if(age<18){
            System.out.println("you are a child");
        }
        else if(age>=70){
            System.out.println("you are a senior citizen");
        }

        if(isStudent){
            System.out.println("you are a student!");
        }
        else{
            System.out.println("you are not a student");
        }
    }
}
