import java.util.Scanner;
public class Bmi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight : ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height : ");
        double height = scanner.nextDouble();

        double bmi = weight / ( height * height );

        System.out.println("Your Bmi for weight = " + weight + " and hight = " + height + " is: " + bmi);
    }
}