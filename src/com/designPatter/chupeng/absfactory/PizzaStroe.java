package com.designPatter.chupeng.absfactory;

public class PizzaStroe 
{
	public static void main(String[] args) 
	{
		OrderPizza mOrderPizza = new OrderPizza(new LDFactory());
	}
}
