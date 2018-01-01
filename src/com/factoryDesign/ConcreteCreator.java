package com.factoryDesign;

public class ConcreteCreator implements Creator{

	@Override
	public Product factoryCreator(String s) {
		if(s.equals("A"))
			return new ConcreteProductA();
		if(s.equals("B"))
			return new ConcreteProductB();
		return null;
	}

}
