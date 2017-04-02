package com.designPatter.chupeng.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.designPatter.chupeng.pizza.Pizza;

public class OrderPizza 
{
	SimplePizzaFactory mSimplePizzaFactory;
	
	public OrderPizza(SimplePizzaFactory mSimplePizzaFactory) 
	{

		setFactory(mSimplePizzaFactory);
	}

	public void setFactory(SimplePizzaFactory mSimplePizzaFactory) 
	{
		Pizza pizza = null;
		String ordertype;
		this.mSimplePizzaFactory = mSimplePizzaFactory;
		do 
		{
			ordertype = gettype();
			//通过工厂类获取不同种类的Pizza实例
			pizza = mSimplePizzaFactory.CreatePizza(ordertype);
			if (pizza != null) 
			{
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}
		} while (true);
	}

	//通过控制台的输入获取客人的点餐信息
	private String gettype() 
	{
		try 
		{
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();
			return str;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			return "";
		}
	}
}