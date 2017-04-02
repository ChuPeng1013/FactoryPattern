package com.designPatter.chupeng.pizza;

public abstract class Pizza 
{
	protected String name;
	//准备
	public abstract void prepare();
	//烘烤
	public void bake()
	{
		System.out.println(name+" baking;");
	}
	//切割
	public void cut()
	{
		System.out.println(name+" cutting;");
	}
	//打包
	public void box()
	{
		System.out.println(name+" boxing;");
	}
	public void setname(String name)
	{
		this.name=name;
	}
}