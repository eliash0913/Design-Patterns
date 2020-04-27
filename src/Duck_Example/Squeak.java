package Duck_Example;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("SQUEAK");
    }
}
