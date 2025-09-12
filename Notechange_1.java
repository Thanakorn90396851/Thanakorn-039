import java.util.Scanner;

public class Notechange_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int money_received = 1000;

        System.out.print("Enter moneyt ot pay: ");
        int money_to_pay = sc.nextInt();

        int changemoney = money_received - money_to_pay;
        System.out.println("Change is: " + changemoney + " Baht");

        int fivehundred = changemoney / 500;
        changemoney = changemoney % 500;

        int hundred = changemoney / 100;
        changemoney = changemoney % 100;

        int fifty = changemoney / 50;
        changemoney = changemoney % 50;

        int twenty = changemoney / 20;
        changemoney = changemoney % 20;

        int ten = changemoney / 10;
        changemoney = changemoney % 10;

        int five = changemoney / 5;
        changemoney = changemoney % 5;

        int two = changemoney / 2;
        changemoney = changemoney % 2;

        System.out.println("Five-Hundred note: " + fivehundred + " note(s)");
        System.out.println("One-Hundred note: " + hundred + " note(s)");
        System.out.println("Fifty note: " + fifty + " note(s)");
        System.out.println("Twenty note: " + twenty + " note(s)");
        System.out.println("Ten note: " + ten + " note(s)");
        System.out.println("Five note: " + five + " note(s)");
        System.out.println("Two note: " + two + " note(s)");
        System.out.println("One note: " + changemoney + " note(s)");
    }
}