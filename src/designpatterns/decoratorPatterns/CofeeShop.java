package designpatterns.decoratorPatterns;

public class CofeeShop {

	public static void main(String[] args) {

		Beverage beverage = new Latte();
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDesc() + "   " + beverage.cost());
		// Adding one more mocha topping
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		if (beverage.getBeverage() instanceof DarkRoast) {
			System.out.println(beverage.getDesc() + "   " + beverage.cost()
					+ ((DarkRoast) beverage).getDiscount());
		}
		System.out.println(beverage.getDesc() + "   " + beverage.cost());
		
		
		
		
		
	    beverage = new DarkRoast();
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDesc() + "   " + beverage.cost());
		// Adding more mocha topping
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDesc() + "   " + beverage.cost());
		if (beverage.getBeverage() instanceof DarkRoast) {
			System.out.println(beverage.getDesc() + "   " + (beverage.cost()
					+ ((DarkRoast) beverage.getBeverage()).getDiscount()) + " DISCOUNTED RATE");
		}
		
	}
}
