package Scanner;

import java.util.Scanner;

public class ElectricityBill {
    private String customerName;
    private int unitsConsumed;

    //constructor
    public ElectricityBill(String customerName, int unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public int calculateBill() {

        int bill = 0;
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 5;
        } else if (unitsConsumed <= 200) {
            bill = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            bill = (100 * 5) + (100 * 7) + ((unitsConsumed - 200) * 10);
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        ElectricityBill bill = new ElectricityBill(name, units);
        System.out.println("Customer: " + bill.customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill:" + bill.calculateBill());
        sc.close();
    }
}

