package Pizza_Example_Factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if(type.equals("veggie")) {
            return new VeggiePizza(ingredientFactory);
        } else if(type.equals("clam")) {
            return new ClamPizza(ingredientFactory);
        } else if(type.equals("pepperoni")) {
            return new PepperoniPizza(ingredientFactory);
        }
        return pizza;

        /*if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if(type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if(type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if(type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }*/
    }
}
