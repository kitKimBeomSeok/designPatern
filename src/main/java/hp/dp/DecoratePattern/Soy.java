package hp.dp.DecoratePattern;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage3) {
        super();
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";

    }
}
