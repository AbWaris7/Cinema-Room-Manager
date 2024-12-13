# Cinema Booking System

A simple console-based cinema ticket booking system written in Java. This application allows users to manage a cinema seating arrangement, book tickets, and view statistics about ticket sales.

---

## Features

1. **Display Seats**:
   - View the current seating arrangement.
   - Booked seats are marked as `B` and available seats as `S`.

2. **Book a Ticket**:
   - Choose a specific seat to book.
   - Calculates ticket price based on seat location and cinema size.
   - Handles invalid or already booked seats gracefully.

3. **View Statistics**:
   - Number of purchased tickets.
   - Percentage of seats booked.
   - Current income from ticket sales.
   - Total potential income.

4. **Dynamic Pricing**:
   - For cinemas with 60 or fewer seats, all tickets cost $10.
   - For larger cinemas, tickets in the front half of rows cost $10, while the back half cost $8.

---

## How It Works

1. **Cinema Initialization**:
   - Input the number of rows and seats per row.
   - Seats are represented as a grid, initialized with all seats available (`S`).

2. **User Menu**:
   - A menu offers options to display seats, book tickets, view statistics, or exit.

3. **Ticket Purchase**:
   - Validates seat selection to ensure correct input and availability.
   - Updates seating grid and statistics upon successful booking.

4. **Statistics**:
   - Provides real-time insights into ticket sales and income.

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IDE or terminal for running Java code

### Running the Program

1. Clone the repository or copy the source code to your local machine.
2. Compile the program using the command:
   ```bash
   javac Cinema.java
