public class MilkDecorator extends Decorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeType() {
        return coffee.getCoffeeType() + " with milk.";
    }

    @Override
    public double cost() {
        return coffee.cost() + 200;
    }
}
