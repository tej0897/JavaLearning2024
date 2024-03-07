package InstanceVariable;

public class FlightTicket {

    public int flightNumber;
    public int seatNumber;
    public String ticketCategory;
    public int tickerID;

    //these are instance variables because the seat number is not common for all the passengers.

    public static int availableSeats=2;

    //this is static variable because the number of seats available will be common for all the passengers.

    public FlightTicket(int flightNumber, int seatNumber, String ticketCategory, int tickerID) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketCategory = ticketCategory;
        this.tickerID = tickerID;
    }

    public static void main(String[] args) {

        createTicket(123, 1, "Economy", 111);
        createTicket(123, 2, "Economy", 112);
        createTicket(123, 3, "Economy", 113);

    }
    private static void createTicket(int flightNumber, int seatNumber, String ticketCategory, int tickerID){
        if (availableSeats>0) {
            FlightTicket ticket = new FlightTicket(flightNumber, seatNumber, ticketCategory, tickerID);
            availableSeats--;
            System.out.println("Total remaining seats are: "+availableSeats);
        } else {
            System.out.println("Sorry, no more tickets available");
        }
    }
}
