package Interface;

public class Truck implements Trackable{

    @Override
    public void Track() {
        System.out.println(getClass().getSimpleName() + " 's coordinates were recorded");
    }
}
