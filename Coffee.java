public class Coffee {
    protected String coffeeType;
    protected double cost;

    public Coffee(String coffeeType) {
        this.coffeeType = coffeeType;
    }
    public double cost(){
        return cost;
    }
    public String getCoffeeType() {
        return coffeeType;
    }

}
