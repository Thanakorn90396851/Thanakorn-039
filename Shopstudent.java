import java.util.Scanner;

public class Shopstudent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Product Name1: ");
        String productname1 = sc.nextLine();
        System.out.print("Price Product1: ");
        double priceproduct1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Product Name2: ");
        String productname2 = sc.nextLine();
        System.out.print("Price Product2: ");
        double priceproduct2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Product Name3: ");
        String productname3 = sc.nextLine();
        System.out.print("Price Product3: ");
        double priceproduct3 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Costumer Paid Money: ");
        double costumer_paid = sc.nextDouble();

        double total_price = priceproduct1 + priceproduct2 + priceproduct3;
        double vat = total_price * 0.07;
        double net_price = total_price + vat;
        double total_paid = costumer_paid;
        double change = total_paid - net_price;

        System.out.println("Product Name: " + productname1 + " Price: " + priceproduct1);
        System.out.println("Product Name: " + productname2 + " Price: " + priceproduct2);
        System.out.println("Product Name: " + productname3 + " Price: " + priceproduct3);
        System.out.println("Costumer paid money : " + costumer_paid);
        System.out.println("Total Price Before Tax : " + total_price);
        System.out.println("Vat : " + vat);
        System.out.println("Net Price : " + net_price);
        System.out.println("Total Paid : " + total_paid);
        System.out.println("Change : " + change);
    }
}