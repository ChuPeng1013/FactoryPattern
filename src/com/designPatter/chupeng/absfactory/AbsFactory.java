package com.designPatter.chupeng.absfactory;

import com.designPatter.chupeng.pizza.Pizza;

public interface AbsFactory 
{
	public Pizza CreatePizza(String ordertype) ;
}
