
import java.util.Scanner; //used for reading primitive data types such int, double or float

public class GroceryBudgetTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creates a scanner object
        
        System.out.println("This program will help you track your grocery spending over a week and then estimate your monthly grocery budget.");

        double totalSpent = 0;

        System.out.println("Enter  your name: "); // prompts user for name
        String name = scanner.nextLine(); // reads user input as a string for name

        System.out.println("Enter your age: "); // prompts user for age
        int age = scanner.nextInt(); // reads user input as an int

        for(String day : new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}){
            System.out.println("Enter the amount spent on groceries for " + day + "(enter as a dollar amount i.e. 38.25): " );
            totalSpent += scanner.nextDouble();
        }

        System.out.println("Enter the discount you expect to save on your groceries this week (enter it as a percentage i.e. 10 = 10%)");
        double discountRate = scanner.nextDouble();

        // Complete calculations
        double totalAfterDiscount = totalSpent * (1 - discountRate / 100);
        double averageDailySpending = totalAfterDiscount / 7;
        double estimatedMonthlyExpenditure = totalAfterDiscount * 4; // Assuming the week has 4 months

        // Output information entered by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Total spent on groceries for the week: $%.2f\n", totalAfterDiscount);
        System.out.printf("Average daily spending: $%.2f\n", averageDailySpending);
        System.out.printf("Estimated monthly expenditure on groceries: $%.2f\n", estimatedMonthlyExpenditure);

        scanner.close(); //Closes the scanner object

    }
    
}
