public class Latte extends Coffee{
    public Latte(String coffeeType) {
        super(coffeeType);
    }

    @Override
    public double cost() {
        return 950;
    }
}
