import java.util.Scanner;

public class Temperaturestatus {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = sc.nextDouble();

        System.out.println("Temperature: " + temperature +" C");

        if (temperature < 20) {
            System.out.println("Status: Cold");
        } else if (temperature >= 20 && temperature <= 35) {
            System.out.println("Status: Normal");
        } else if (temperature >= 35 && temperature <= 45) {
            System.out.println("Status: Hot");
        } else {
            System.out.println("Status: So Hot");
        }
     }
}