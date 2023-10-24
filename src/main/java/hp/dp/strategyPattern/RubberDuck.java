package hp.dp.strategyPattern;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Rubber Duck");
    }
}
