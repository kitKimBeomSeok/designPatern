package hp.dp.DecoratePattern;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage2) {
        super();
    }

    @Override
    public double cost() {
        return .40 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
