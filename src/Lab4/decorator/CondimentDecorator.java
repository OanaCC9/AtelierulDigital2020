package Lab4.decorator;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(String description, int cost, Beverage beverage) {
        super(description, cost);
        this.beverage = beverage;
    }
}

