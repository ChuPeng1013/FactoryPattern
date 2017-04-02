package com.designPatter.chupeng.method;

import com.designPatter.chupeng.pizza.NYCheesePizza;
import com.designPatter.chupeng.pizza.NYPepperPizza;
import com.designPatter.chupeng.pizza.Pizza;

public class NYOrderPizza extends OrderPizza 
{
	@Override
	Pizza createPizza(String ordertype) 
	{
		Pizza pizza = null;
		if (ordertype.equals("cheese")) 
		{
			pizza = new NYCheesePizza();
		} 
		else if (ordertype.equals("pepper")) 
		{
			pizza = new NYPepperPizza();
		}
		return pizza;
	}
}
