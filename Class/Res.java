import java.util.ArrayList;
import java.util.Scanner;

public class Res {

    public static void main(String[] args) {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1. Burger - $5.99");
        menu.add("2. Pizza - $8.99");
        menu.add("3. Pasta - $6.49");
        menu.add("4. Salad - $4.99");
        menu.add("5. Steak - $12.99");
        menu.add("6. Ice Cream - $3.99");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> order = new ArrayList<>();
        
        System.out.println("Welcome to the Restaurant!");
        System.out.println("Menu:");
        for (String item : menu) {
            System.out.println(item);
        }
        
        while (true) {
            System.out.print("Enter item number to order (or 0 to finish): ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= menu.size()) {
                order.add(menu.get(choice - 1));
            } else {
                System.out.println("Invalid choice. Please select a valid item.");
            }
        }
        
        double totalBill = 0;
        System.out.println("\nYour Order:");
        for (String item : order) {
            System.out.println(item);
            totalBill += getPriceFromItem(item);
        }
        
        System.out.println("\nTotal Bill: $" + totalBill);
        
        scanner.close();
    }

    private static double getPriceFromItem(String item) {
        int index = item.lastIndexOf("$");
        return Double.parseDouble(item.substring(index + 1));
    }
}

