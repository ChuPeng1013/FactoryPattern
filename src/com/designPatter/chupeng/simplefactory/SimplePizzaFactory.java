package com.designPatter.chupeng.simplefactory;

import com.designPatter.chupeng.pizza.CheesePizza;
import com.designPatter.chupeng.pizza.GreekPizza;
import com.designPatter.chupeng.pizza.PepperPizza;
import com.designPatter.chupeng.pizza.Pizza;

public class SimplePizzaFactory 
{
	public Pizza CreatePizza(String ordertype) 
	{
		Pizza pizza = null;
		if (ordertype.equals("cheese")) 
		{
			pizza = new CheesePizza();
		} 
		else if (ordertype.equals("greek")) 
		{
			pizza = new GreekPizza();
		} 
		else if (ordertype.equals("pepper")) 
		{
			pizza = new PepperPizza();
		}
		return pizza;
	}
}