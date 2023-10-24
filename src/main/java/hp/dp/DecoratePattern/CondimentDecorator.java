package hp.dp.DecoratePattern;

public abstract class CondimentDecorator extends Beverage { //중간 부모는 꼭 abstract일 필요는 없음
    protected Beverage beverage; //재귀하는 방식으로 가지고 있음
    public abstract String getDescription();
}
