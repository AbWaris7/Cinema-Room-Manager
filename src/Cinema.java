import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Get the number of rows and seats per row from user input
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = input.nextInt();

        // Step 2: Display cinema seating arrangement
        System.out.println("Cinema:");
        System.out.print("  "); // for aligning the seat numbers

        // Print the seat numbers for each column
        for (int i = 1; i <= seatsPerRow; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print the seating arrangement with 'S' for each seat
        for (int i = 1; i <= rows; i++) {
            System.out.print(i); // Row number
            for (int j = 1; j <= seatsPerRow; j++) {
                System.out.print(" S"); // Seat representation
            }
            System.out.println();
        }

        // Step 3: Calculate total seats in the theater
        int totalSeats = rows * seatsPerRow;

        // Step 4: Determine the pricing based on the total seats
        int totalIncome;
        if (totalSeats <= 60) {
            // If there are 60 or fewer seats, each ticket costs $10
            totalIncome = totalSeats * 10;
        } else {
            // Correct splitting of rows into front half and back half
            int frontHalfRows = rows / 2;  // First half (round up for odd number of rows)
            int backHalfRows = rows - frontHalfRows;         // Second half

            // Income from the first half of rows (front half) at $10 per seat
            int incomeFrontHalf = frontHalfRows * seatsPerRow * 10;

            // Income from the second half of rows (back half) at $8 per seat
            int incomeBackHalf = backHalfRows * seatsPerRow * 8;

            // Total income is the sum of both parts
            totalIncome = incomeFrontHalf + incomeBackHalf;
        }

        // Step 5: Output the result
        System.out.println("Total income:");
        System.out.println("$" + totalIncome);
    }
}
