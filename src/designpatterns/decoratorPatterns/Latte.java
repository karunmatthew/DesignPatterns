package designpatterns.decoratorPatterns;

public class Latte extends Beverage{

	@Override
	public double cost() {
		return 45;
	}
	
	@Override
	public String getDesc(){
		return "Latte";
	}

	@Override
	public Beverage getBeverage() {
		return this;
	}

}
