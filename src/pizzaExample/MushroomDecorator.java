package pizzaExample;

public class MushroomDecorator extends PizzaDecorator{


    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Mushroom ";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }
}
