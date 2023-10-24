package hp.dp.strategyPattern;

public class RedheadDuck extends Duck {
    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Redhead Duck");
    }
}
