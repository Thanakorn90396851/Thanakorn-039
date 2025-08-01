import java.util.Scanner;

public class Average {
    public static void main(String[] argx) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = scanner.nextInt();

        System.out.print("Enter num3 : ");
        int num3 = scanner.nextInt();

        System.out.print("Enter num4 : ");
        int num4 = scanner.nextInt();

        System.out.print("Enter num5 : ");
        int num5 = scanner.nextInt();

        System.out.print("Enter Amount : ");
        int amount = scanner.nextInt();

        double sum = num1+num2+num3+num4+num5;
        double average = sum/amount;

        System.out.println("Your average is = " + average);
    }
}
