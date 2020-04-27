package Duck_Example;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK");
    }
}
