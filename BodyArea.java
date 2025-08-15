import java.util.Scanner;
public class BodyArea{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        byte width = scanner.nextByte();

        System.out.print("Enter length: ");
        byte length = scanner.nextByte();

        double body_area = width * length / 360.0;

        System.out.println("body surface area is = " + body_area );
    }
}