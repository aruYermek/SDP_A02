public class Espresso extends Coffee{
    public Espresso(String coffeeType) {
        super(coffeeType);
    }

    @Override
    public double cost() {
        return 800;
    }
}
