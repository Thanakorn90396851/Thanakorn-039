import java.util.Scanner;

public class Tax {
    public static void main(String[] argx) {
        Scanner scanner = new Scanner(System.in);
        double tax = 0.1;

        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();
        
        double totaltax = salary * tax;

        System.out.println("Your Tax is = " + totaltax);
    }
}
