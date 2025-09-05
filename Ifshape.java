import java.util.Scanner;

public class Ifshape{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        double number = sc.nextDouble();

        if (number == 1) {
            System.out.println("You select Calculate the area of a triangle");

            System.out.print("Enter the base of the triangle: ");
            double base = sc.nextDouble();

            System.out.print("Enter the height of the triangle: ");
            double height = sc.nextDouble();

            double area = 0.5 * base * height;

            System.out.println("Area of the triangle: " + area + " square units");
        } else if (number == 2) {
            System.out.println("You select Calculate BMI");

            System.out.print("Enter your weight in kilograms: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your height in meter: ");
            double height = sc.nextDouble();

            double bmi = weight / (height * height);

            System.out.println("Your BMI for weight = " + weight + " kg and height = " + height + " meters is: " + bmi + " bmi");
        } else {
            System.out.println("Error Choice You can only choose 1 or 2");
        }
    }
}