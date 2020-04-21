package Practice;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No way to fly!");
    }
}
