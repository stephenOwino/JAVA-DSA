package Interface;

public class Jet implements FlightEnabled, Trackable{

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");

    }

    @Override
    public void fly() {

        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void Track() {
        System.out.println(getClass().getSimpleName() + " 's coordinates were recorded");
    }
}
