public class SugarDecorator extends Decorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeType() {
        return coffee.getCoffeeType() + " with sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 50;
    }
}
