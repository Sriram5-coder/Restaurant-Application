import java.util.Scanner;

public class PizzaOrderingChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect customer information
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Please enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Please enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Welcome, " + name + "! D Pizza is the favorite pizza store around your place.");

        // Pizza ordering process
        boolean addAnotherPizza = true;
        double totalAmount = 0.0;

        while (addAnotherPizza) {
            System.out.println("What would you like to order?");
            System.out.print("Veg / Non Veg: ");
            String pizzaType = scanner.nextLine();

            System.out.println("What would you like to have?");
            if (pizzaType.equalsIgnoreCase("Veg")) {
                System.out.print("Veg Deluxe / Veg Supreme: ");
            } else {
                System.out.print("Non Veg Pizza Options: ");
            }
            String pizzaName = scanner.nextLine();

            System.out.println("What crust would you like?");
            System.out.print("Thin / Pan: ");
            String crustType = scanner.nextLine();

            System.out.println("What size would you like?");
            System.out.print("Medium / Large: ");
            String size = scanner.nextLine();

            // Calculate price based on pizza type and size
            double price = calculatePrice(pizzaType, size);

            System.out.println(
                    "You have selected " + pizzaName + " -> " + size + " size with a " + crustType + " crust.");
            System.out.println("Price is Rs " + price);

            totalAmount += price;

            System.out.print("Would you like to add another pizza? (Yes/No): ");
            String addAnotherPizzaInput = scanner.nextLine();

            if (addAnotherPizzaInput.equalsIgnoreCase("No")) {
                addAnotherPizza = false;
            }
        }

        // Display order summary
        System.out.println("Pizza will be delivered in 30 minutes to the following address:");
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Total Amount: Rs " + totalAmount);

        System.out.println("Thank you for choosing D Pizza! Enjoy your meal.");
    }

    private static double calculatePrice(String pizzaType, String size) {
        double basePrice = 0.0;

        if (pizzaType.equalsIgnoreCase("Veg")) {
            basePrice = 500.0;
        } else {
            basePrice = 600.0;
        }

        if (size.equalsIgnoreCase("Large")) {
            basePrice += 100.0;
        }

        return basePrice;
    }
}
