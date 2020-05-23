package Pizza_Example_Factory;

public class ChicagoPizzaStore extends OldPizzaStore {
    @Override
    protected OldPizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if(type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if(type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if(type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
