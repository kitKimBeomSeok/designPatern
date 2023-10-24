package hp.dp.strategyPattern;

import hp.dp.example.MyHWInfo;

public class MiniDuckSimulator{
    public static void main(String [] args){
        MyHWInfo myHWInfo = new MyHWInfo();
        myHWInfo.printInfo();


        Duck mallard = new Mallarduck();
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
