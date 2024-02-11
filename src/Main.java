import java.util.Scanner;

class ShipCostCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What was the price of your order: $");
        double itemPrice = scanner.nextDouble();

        double[] result = calculateShippingCost(itemPrice);
        double shippingCost = result[0];
        double totalPrice = result[1];

        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);

        scanner.close();
    }

    public static double[] calculateShippingCost(double itemPrice) {
        double[] result = new double[2];
        if (itemPrice >= 100) {
            result[0] = 0;
        } else {
            result[0] = itemPrice * 0.02;
        }
        result[1] = itemPrice + result[0];

        return result;
    }
}
