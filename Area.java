import java.util.Scanner;

public class Area {
    public static void main(String[] argx) {
        Scanner scanner = new Scanner(System.in);

        float Pi = 3.14f;

        System.out.println("Enter radius");
        int radius = scanner.nextInt();

        float sum = Pi * (radius * radius);

        System.err.println("area = " + sum);
    }
}
