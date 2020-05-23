package Pizza_Example_Factory;

public abstract class OldPizzaStore {
    public OldPizza orderPizza(String type) {
        OldPizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract OldPizza createPizza(String type);
}
