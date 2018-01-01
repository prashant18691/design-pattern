package com.factoryDesign;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFactoy {

	@Test
	public  void testFactory() {
		// TODO Auto-generated method stub
		Creator factory = new ConcreteCreator();
		Product a = factory.factoryCreator("A");
		Product b = factory.factoryCreator("B");
		
		/*System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());*/
		
		assertEquals("com.factoryDesign.ConcreteProductA",a.getClass().getName());
		assertEquals("com.factoryDesign.ConcreteProductB",b.getClass().getName());
		

	}

}
