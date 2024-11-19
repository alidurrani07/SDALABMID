import java.util.Scanner;

// Main Class to Start the Program
public class HostelSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Eligibility
        System.out.println("Welcome to Comsats University Hostel System.");
        System.out.print("Enter your University name: ");
        String universityName = scanner.nextLine();

        System.out.print("Enter your home distance from the university (in km): ");
        int distanceFromHome = scanner.nextInt();

        System.out.print("Enter your current semester (1 to 8): ");
        int semester = scanner.nextInt();

        // Eligibility Filter
        EligibilityFilter eligibilityFilter = new EligibilityFilter();
        if (!eligibilityFilter.checkEligibility(universityName, distanceFromHome, semester)) {
            System.out.println("You are not eligible for the hostel. Thank you!");
            return; // Exit if not eligible
        }

        // Payment Filter
        PaymentFilter paymentFilter = new PaymentFilter();
        if (!paymentFilter.checkPayment()) {
            System.out.println("Payment not completed. Cannot proceed further.");
            return; // Exit if payment not done
        }

        // Service Availing Filter
        ServiceFilter serviceFilter = new ServiceFilter();
        serviceFilter.selectService();

        System.out.println("You have successfully applied for the hostel. Thank you!");
        scanner.close();
    }
}

// Eligibility Filter Class
class EligibilityFilter {
    private int availableRooms = 5; // Room availability handled by system

    public boolean checkEligibility(String university, int distance, int semester) {
        System.out.println("Checking eligibility...");
        if (!university.equalsIgnoreCase("Comsats University")) {
            System.out.println("You are not from Comsats University.");
            return false;
        }

        if (distance < 10) {
            System.out.println("You are not eligible as your home is within 10 km.");
            return false;
        }

        if (semester != 1 && availableRooms <= 0) {
            System.out.println("Rooms are full, and you are not in the 1st semester.");
            return false;
        }

        System.out.println("Eligibility criteria fulfilled.");
        return true;
    }
}

// Payment Filter Class
class PaymentFilter {
    public boolean checkPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide fee receipt for payment.");
        System.out.print("Do you have the fee receipt? (yes/no): ");
        String feeReceipt = scanner.nextLine();
        if (feeReceipt.equalsIgnoreCase("yes")) {
            System.out.println("Payment completed successfully.");
            return true;
        } else {
            System.out.println("Payment is incomplete.");
            return false;
        }
    }
}

// Service Filter Class
class ServiceFilter {
    public void selectService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the type of service you want: ");
        System.out.println("1. Luxury (Includes AC, Heater, Comfortable Bed, Study Table, Closet)");
        System.out.println("2. Normal");
        System.out.print("Enter your choice (1 for Luxury, 2 for Normal): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You have chosen Luxury service.");
        } else if (choice == 2) {
            System.out.println("You have chosen Normal service.");
        } else {
            System.out.println("Invalid choice. Defaulting to Normal service.");
        }
    }
}
