//5. Write a program in Java for Railway management using Multilevel inheritance with at least 3 classes all classes must have two-member variable and two -member method.

// Base class: Train
class Train {
    String tname;
    int tno;

    Train(String tname, int tno) {
        this.tname = tname;
        this.tno = tno;
    }

    void showTrainDetails() {
        System.out.println("Train Name: " + tname);
        System.out.println("Train Number: " + tno);
    }
}

// Intermediate class: Route (inherits Train)
class Route extends Train {
    String source;
    String dest;

    Route(String tname, int tno, String source, String dest) {
        super(tname, tno);
        this.source = source;
        this.dest = dest;
    }

    void showRoute() {
        System.out.println("Source Station: " + source);
        System.out.println("Destination Station: " + dest);
    }

    int getDistance() {
        if (source.equalsIgnoreCase("Kolkata") && dest.equalsIgnoreCase("Siliguri")) {
            return 100;
        } else {
            return 150;
        }
    }
}

// Derived class: Passenger (inherits Route)
class Passenger extends Route {
    String pname;
    String seatType;
    int age;
    String date;
    Passenger(String tname, int tno, String source, String dest,
              String pname, int age, String date, String seatType) {
        super(tname, tno, source, dest);
        this.pname = pname;
        this.age = age;
        this.date = date;
        this.seatType = seatType;
    }

    void showPassengerDetails() {
        System.out.println("Passenger Name: " + pname);
        System.out.println("Passenger Age: " + age);
        System.out.println("Reservation Date: " + date);
        System.out.println("Seat Type: " + seatType);
    }

    int getFare() {
        
        int fare=0;
        int distance = getDistance();
        if (distance == 100) {
            if(seatType.equalsIgnoreCase("AC"))
            {
                fare=distance*4;
            }
            else
            {
                fare=distance*2;
            }
        } else if (distance!=100){
            if(seatType.equalsIgnoreCase("AC"))
            {
                fare=distance*4;
            }
            else
            {
                fare=distance*2;
            }
        }
        return fare;
    }
}

// Main class
public class Rail {
    public static void main(String[] args) {
        // Create a passenger which includes train and route details
        Passenger passenger = new Passenger(
            "Darjeeling Mail", 10010,
            "Kolkata", "Siliguri",
            "Sampurna Kundu", 21,
            "2025-02-15", "AC"
        );

        passenger.showTrainDetails();
        passenger.showRoute();
        passenger.showPassengerDetails();
        System.out.println("Fare: " + passenger.getFare());

        Passenger passenger1 = new Passenger(
            "Rajdhani Mail", 10110,
            "Kolkata", "Delhi",
            "Tumpa Kundu", 49,
            "2025-02-15", "Non AC"
        );
        passenger1.showTrainDetails();
        passenger1.showRoute();
        passenger1.showPassengerDetails();
        System.out.println("Fare: " + passenger1.getFare());
    }
}
