import java.util.Scanner;

public class Cinema {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Magic Numbers
        final int PREMIUM_TICKET_PRICE = 10;
        final int DISCOUNT_TICKET_PRICE = 8;

        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int columns = input.nextInt();

        int totalSeats = rows * columns;
        int totalIncome = 0;

        if(totalSeats <60) {
            totalIncome = totalSeats * 10;
        } else {
            int firstHalfRows = rows / 2;
            int secondHalfRows = rows - firstHalfRows;
            totalIncome = (firstHalfRows * columns * PREMIUM_TICKET_PRICE) + (secondHalfRows * columns * DISCOUNT_TICKET_PRICE);
        }
        System.out.println("Total income: ");
        System.out.println("$"+totalIncome);


    }
}
