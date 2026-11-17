
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units;
        double bill;

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter electricity units: ");
        units = sc.nextInt();

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = 200 + (units - 100) * 3;
        } else {
            bill = 500 + (units - 200) * 5;
        }

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Units Used: " + units);
        System.out.println("Total Bill: Rs." + bill);

        sc.close();
    }
}
