package hp.dp.DecoratePattern;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 2.55;
    }
}
