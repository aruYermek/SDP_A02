public class Decorator extends Coffee {
    protected Coffee coffee;
    public Decorator(Coffee coffee) {
        super(coffee.getCoffeeType());
        this.coffee=coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
