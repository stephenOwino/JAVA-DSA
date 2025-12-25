package Interface;

public class main {
    static void main() {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flightEnabled = bird;
        Trackable trackable = bird;

        animal.move();

//        flightEnabled.fly();
//        flightEnabled.takeOff();
//        flightEnabled.land();
//
//        trackable.Track();

        inFlight(flightEnabled);
        inFlight(new Jet());

        Truck truck = new Truck();
        truck.Track();

    }
    private static void inFlight(FlightEnabled flightEnabled){
        flightEnabled.takeOff();
        flightEnabled.fly();

        if (flightEnabled instanceof Trackable tracked){
            tracked.Track();
        }
        flightEnabled.land();
    }
}
