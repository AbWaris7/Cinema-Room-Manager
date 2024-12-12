import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get cinema dimensions
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int columns = input.nextInt();

        // Initialize seating arrangement
        String[][] tickets = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tickets[i][j] = "S";
            }
        }

        while (true) {
            // Display menu options
            System.out.println("\n1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    showSeats(tickets);
                    break;
                case 2:
                    buyTicket(tickets);
                    break;
                case 3:
                    System.out.println("Statistics");
                case 0:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showSeats(String[][] tickets) {
        System.out.println("\nCinema:");

        // Print seat numbering
        System.out.print("  ");
        for (int i = 1; i <= tickets[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print rows and seats
        for (int i = 0; i < tickets.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tickets[i].length; j++) {
                System.out.print(tickets[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void buyTicket(String[][] tickets) {
        Scanner input = new Scanner(System.in);

        final int PREMIUM_TICKET_PRICE = 10;
        final int DISCOUNT_TICKET_PRICE = 8;
        int rows = tickets.length;
        int columns = tickets[0].length;

        while (true) {
            System.out.println("\nEnter a row number:");
            int buyRow = input.nextInt();
            System.out.println("Enter a seat number in that row:");
            int buyColumn = input.nextInt();

            // Validate input
            if (buyRow < 1 || buyRow > rows || buyColumn < 1 || buyColumn > columns) {
                System.out.println("Wrong input!");
                continue;
            }

            // Check if seat is already booked
            if ("B".equals(tickets[buyRow - 1][buyColumn - 1])) {
                System.out.println("That ticket has already been purchased!");
                continue;
            }

            // Calculate ticket price
            int totalSeats = rows * columns;
            int singleTicketPrice;

            if (totalSeats <= 60) {
                singleTicketPrice = PREMIUM_TICKET_PRICE;
            } else {
                int frontHalfRows = rows / 2;
                singleTicketPrice = (buyRow <= frontHalfRows) ? PREMIUM_TICKET_PRICE : DISCOUNT_TICKET_PRICE;
            }

            System.out.println("Ticket price: $" + singleTicketPrice);

            // Mark the seat as booked
            tickets[buyRow - 1][buyColumn - 1] = "B";
            break;
        }
    }
}
