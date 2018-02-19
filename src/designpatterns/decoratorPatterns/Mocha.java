package designpatterns.decoratorPatterns;

public class Mocha extends CondimentDecorator {

	Beverage beverage;

	Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + " Mocha ";
	}

	@Override
	public double cost() {
		return beverage.cost() + 20;
	}

	@Override
	public Beverage getBeverage() {
		return beverage.getBeverage();
	} 

}
