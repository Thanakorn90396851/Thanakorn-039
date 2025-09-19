import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = -1;

        while (score < 0 || score > 100) {
            System.out.print("Enter Student Name: ");
            String Studentname = sc.nextLine();

            System.out.print("Enter Score (0-100): ");
            score = sc.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Error: Score must be between 0 and 100 # Please enter the correct score again");
            } else {

                if (score >= 80 && score <= 100) {
                    System.out.println("Grade A");
                } else if (score >= 70 && score < 80) {
                    System.out.println("Grade B");
                } else if (score >= 60 && score < 70) {
                    System.out.println("Grade C");
                } else if (score >= 50 && score < 60) {
                    System.out.println("Grade D");
                } else if (score < 50) {
                    System.out.println("Grade E");
                }
            }
            sc.nextLine();
        }
    }
}
