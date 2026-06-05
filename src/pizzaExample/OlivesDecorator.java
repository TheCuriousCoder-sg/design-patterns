package pizzaExample;

public class OlivesDecorator extends PizzaDecorator{
    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Olives ";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 100;
    }
}
