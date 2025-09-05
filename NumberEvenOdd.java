import java.util.Scanner;

public class NumberEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int integer = sc.nextInt();

        if (integer % 2 == 0) {
            System.out.println(integer + " is Even");
        } else {
            System.out.println(integer + " is Odd");
        }
    }
}