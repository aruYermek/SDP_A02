public class SyrupDecorator extends Decorator{
    public SyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeType() {
        return super.getCoffeeType() + " with syrup";
    }

    @Override
    public double cost() {
        return coffee.cost() + 350;
    }
}
