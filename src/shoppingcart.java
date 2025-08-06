import java.util.Scanner;
public class shoppingcart {
    public static void main(String[]agrs){

        Scanner scanner =  new Scanner(System.in);


        String item;
        int quantity;
        double price;
        double total;


        System.out.println("What do you want to buy? ");
        item = scanner.nextLine();
        System.out.println("How many of them? ");
        quantity = scanner.nextInt();
        System.out.println("What is the cost? ");
        price = scanner.nextDouble();
        total = quantity * price;
        System.out.println("You have brought "+ quantity + " " + item + "/s, which costs " + price + " each." );
        System.out.println("Your total is : "+ total);
        scanner.close();

    }
}
