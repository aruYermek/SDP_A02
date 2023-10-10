import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Order Coffee");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                orderCoffee(scanner);
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void orderCoffee(Scanner scanner) {
        System.out.println("Choose type of coffee (Espresso or Latte):");
        String clientCoffee = scanner.nextLine();

        Coffee clientOrder = null;

        if (clientCoffee.equalsIgnoreCase("Espresso")) {
            clientOrder = new Espresso("Espresso");
        } else if (clientCoffee.equalsIgnoreCase("Latte")) {
            clientOrder = new Latte("Latte");
        } else {
            System.out.println("Invalid coffee choice.");
            return;
        }

        System.out.println("Add sugar? (yes/no):");
        String addSugar = scanner.nextLine();
        if (addSugar.equalsIgnoreCase("yes")) {
            clientOrder = new SugarDecorator(clientOrder);
        }

        System.out.println("Add milk? (yes/no):");
        String addMilk = scanner.nextLine();
        if (addMilk.equalsIgnoreCase("yes")) {
            clientOrder = new MilkDecorator(clientOrder);
        }

        System.out.println("Add syrup? (yes/no):");
        String addSyrup = scanner.nextLine();
        if (addSyrup.equalsIgnoreCase("yes")) {
            clientOrder = new SyrupDecorator(clientOrder);

            System.out.println("Description: " + clientOrder.getCoffeeType());
            System.out.println("Cost: " + clientOrder.cost());
        }
    }
}
