package designpatterns.decoratorPatterns;

public abstract class Beverage {
	
	//String desc;

	public abstract String getDesc();

	//public void setDesc(String desc) {
	//	this.desc = desc;
	//}
	
	public abstract double cost();
	
	
	public abstract Beverage getBeverage();
	

}
