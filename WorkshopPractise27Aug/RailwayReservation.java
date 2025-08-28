import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ThankYou For Choosing Indian Railways!");
        String[] trains = {"Rajdhani Express", "Shatabdi Express", "Garib Rath"};
        int[] fares = {1500, 1000, 700};


        int totalSeats = 5;
        String[] passengers = new String[totalSeats];
        int bookedSeats = 0;

        int waitingList = 3;
        String[] waitingPassengers = new String[waitingList];
        int waitingCount = 0;

        int trainChoice;
        System.out.println("Available trains");

        for(int i=0;i<trains.length;i++){
            System.out.println((i + 1) + ". " + trains[i] + " (Fare: ₹" + fares[i] + ")");
        }

        System.out.println("Choose a train (1-3):");
        trainChoice = sc.nextInt();

        switch (trainChoice){
            case 1:
            System.out.println("You selected"+trains[0]+"fares = "+fares[0]);
            break;

            case 2:
            System.out.println("You selected"+trains[1]+"fares = "+fares[1]);
            break;

            case 3:
            System.out.println("You selected"+trains[2]+"fares = "+fares[2]);
            break;

            default:
            System.out.println("Invalid choice! Defaulting to Rajdhani Express.");
            trainChoice = 1;
        }
        // booking process
        char moreBooking;
        do { 
            if(bookedSeats < totalSeats) {
                System.out.print("Enter passenger name: ");
                String name = sc.next();
                passengers[bookedSeats] = name;
                bookedSeats++;
                System.out.println("✅ Seat booked for " + name + " (Seat No: " + bookedSeats + ")");
            }
            else if (waitingCount < waitingList) {
                System.out.print("Seats full! Enter name for waiting list: ");
                String name = sc.next();
                waitingPassengers[waitingCount] = name;
                waitingCount++;
                System.out.println("⏳ " + name + " added to waiting list (Position: " + waitingCount + ")");
            } else {
                System.out.println("❌ Sorry, no seats or waiting list available!");
                break;
            }

            System.out.println("Do you want to book another ticket? (y/n)");
            moreBooking=sc.next().charAt(0);


        } while (moreBooking == 'y' || moreBooking == 'Y'); 

        System.out.println("\n--- Booking Summary ---");
        System.out.println("Train: " + trains[trainChoice - 1]);
        System.out.println("Booked Passengers:");
        for (int i = 0; i < bookedSeats; i++) {
            System.out.println("Seat " + (i + 1) + ": " + passengers[i]);
        }

        System.out.println("\nWaiting List:");
        for (int i = 0; i < waitingCount; i++) {
            System.out.println("WL " + (i + 1) + ": " + waitingPassengers[i]);
        }
        
    }
}
