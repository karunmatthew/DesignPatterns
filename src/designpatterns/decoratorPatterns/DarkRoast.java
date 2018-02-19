package designpatterns.decoratorPatterns;

public class DarkRoast extends Beverage{

	@Override
	public String getDesc() {
		return "Dark Roast";
	}

	@Override
	public double cost() {
		return 75;
	}

	public double getDiscount()
	{
		return -10;
	}

	@Override
	public Beverage getBeverage() {
		return this;
	}
}
