import java.util.Scanner;

public class number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        double number = sc.nextDouble();
        if(number > 0) {
            System.out.println("Positive integer");
        } else if (number < 0) {
            System.out.println("Negative integer");
        } else { 
            System.out.println("Zero");
        }      
    }
}
