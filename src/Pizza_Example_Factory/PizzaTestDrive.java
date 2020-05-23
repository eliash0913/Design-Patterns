package Pizza_Example_Factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        OldPizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        OldPizza oldPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + oldPizza.getName() + "\n");
    }
}
