class BookSeats {
    int total_seats = 8;

    synchronized void seatsBook(int seats) {  // synchronized method to control access
        if (total_seats >= seats) {
            System.out.println("Seats booked successfully: " + seats);
            total_seats = total_seats - seats;
            System.out.println("Total seats left: " + total_seats);
        } else {
            System.out.println("Sorry, seat booking failed");
            System.out.println("Total seats left: " + total_seats);
        }
    }
}

public class MovieBookApp extends Thread {

    static BookSeats b;
    int seats;

    public void run() {
        b.seatsBook(seats);
    }

    public static void main(String[] args) {
        b = new BookSeats();

        MovieBookApp sa = new MovieBookApp();
        sa.seats = 5;
        sa.start();

        MovieBookApp li = new MovieBookApp();
        li.seats = 9;
        li.start();
    }
}
