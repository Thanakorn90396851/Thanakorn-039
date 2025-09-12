import java.util.Scanner;

public class ScoreFinal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score midterm: ");
        double midtermscore = sc.nextDouble();

        System.out.print("Enter score final: ");
        double finalscore = sc.nextDouble();

        double scoretotal = midtermscore + finalscore;

        if (scoretotal < 50) {
            System.out.println("Your total score is " + scoretotal + " The result is Fail!!");
        } else if (scoretotal >= 50 && scoretotal <= 100) {
            System.out.println("Your total score is " + scoretotal + " The result is Pass!!");
        } else {
            System.out.println("Score error: " + scoretotal + " because no more than 100 points can be entered");
        }
    }
}