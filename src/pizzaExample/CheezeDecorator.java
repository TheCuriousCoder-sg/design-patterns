package pizzaExample;

public class CheezeDecorator extends PizzaDecorator{

    public CheezeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheeze ";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }
}
