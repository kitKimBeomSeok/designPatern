package hp.dp.strategyPattern;

public class Mallarduck extends Duck{
    public Mallarduck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
