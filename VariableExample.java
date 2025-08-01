public class VariableExample {
    public static void main(String[] args) {
        //1.1 ตัวแปรที่จะใช้เก็บค่าของขนาดของเสื้อผ้า ซึ่งมีขนาดเป็น s, m หรือ l
        char clothingSize = 's'; // สามารถเป็น 's', 'm', หรือ 'l'

        int websiteVisitors = 0; // จำนวนคนที่เข้าชมเว็บไซต์

        char studentGrade = 'A';

        double studentGPA = 4.0;

        final double PI = 3.14159;

        float annualExpenses = 15000.00f;

        final int MONTHS_IN_YEAR = 12;
        System.out.println("Clothing Size" + clothingSize);
        System.out.println("Website Visitors" + websiteVisitors);
        System.out.println("Student Grade" + studentGrade);
        System.out.println("Student GPA" + studentGPA);
        System.out.println("Value of Pi : " + PI);
        System.out.println("Annual Expenses" + annualExpenses);
        System.out.println("Months in a Year" + MONTHS_IN_YEAR);

    }
}
