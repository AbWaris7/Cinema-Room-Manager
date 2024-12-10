import java.util.Arrays;
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

        String[][] tickets = new String[rows][columns];


        int totalSeats = rows * columns;
        int totalIncome = 0;
        int singleTicketPrice = 0;

        if(totalSeats <60) {
            totalIncome = totalSeats * 10;
        } else {
            int firstHalfRows = rows / 2;
            int secondHalfRows = rows - firstHalfRows;
            totalIncome = (firstHalfRows * columns * PREMIUM_TICKET_PRICE) + (secondHalfRows * columns * DISCOUNT_TICKET_PRICE);
        }

        System.out.println("Cinema:");
        for(int i = 1; i <=columns; i++) {
            System.out.print(" "+i);
        }
        System.out.println();

        for(int i = 1; i <=rows; i++) {
            System.out.print(i);
            for(int j = 1; j <=columns; j++) {
                tickets[i-1][j-1] = "S";
                System.out.print(" "+tickets[i-1][j-1]);
            }
            System.out.println();
        }

        System.out.println("Enter a row number:");
        int BuyRow = input.nextInt();
        System.out.println("Enter a seat number in that row:");
        int BuyColumn = input.nextInt();

        if(totalSeats <=60) {
            singleTicketPrice = 10;
        } else {

            int frontHalfRows = rows / 2;
            if (BuyRow <= frontHalfRows) {
                singleTicketPrice = 10;  // Front half
            } else {
                singleTicketPrice = 8;   // Back half
            }
        }
        System.out.println("Ticket price $"+singleTicketPrice);

        tickets[BuyRow - 1][BuyColumn - 1] = "B";
        System.out.println("Cinema:");
        for(int i = 1; i <=columns; i++) {
            System.out.print(" "+i);
        }
        System.out.println();

        for(int i = 1; i <=rows; i++) {
            System.out.print(i);
            for(int j = 1; j <=columns; j++) {

                System.out.print(" "+tickets[i-1][j-1] );

            }

            System.out.println();
        }

    }
}
