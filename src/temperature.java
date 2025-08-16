import java.net.StandardProtocolFamily;
import java.util.Scanner;
public class temperature {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


        double temp;
        double currentTemp;
        String unit;

        System.out.println("Temperature conversion");
        System.out.println("Convert to Celsius or Fahrenheit (C/F): ");
        unit = scanner.next().toUpperCase();
        System.out.println("Enter your temperature: ");
        temp = scanner.nextDouble();

        currentTemp = (unit.equals("C")) ? (temp - 32)* 5 / 9 : (temp * 5  /9) + 32;
        System.out.println(currentTemp);



        scanner.close();
    }
}
