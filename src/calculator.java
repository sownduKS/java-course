import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.println("Enter number 1: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter number 2: ");
        num2 = scanner.nextDouble();

        System.out.println("Enter operator: ");
        operator = scanner.next().charAt(0);
        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> result = num1 / num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1,num2);

        }


        System.out.println(result);

        scanner.close();
    }
}
