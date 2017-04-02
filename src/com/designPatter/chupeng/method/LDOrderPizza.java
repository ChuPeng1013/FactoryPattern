package com.designPatter.chupeng.method;

import com.designPatter.chupeng.pizza.LDCheesePizza;
import com.designPatter.chupeng.pizza.LDPepperPizza;
import com.designPatter.chupeng.pizza.Pizza;

public class LDOrderPizza extends OrderPizza 
{
	@Override
	Pizza createPizza(String ordertype) 
	{
		Pizza pizza = null;
		if (ordertype.equals("cheese")) 
		{
			pizza = new LDCheesePizza();
		} 
		else if (ordertype.equals("pepper")) 
		{
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}
