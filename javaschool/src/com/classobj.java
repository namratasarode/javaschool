package com;

public class classobj {
	int yearofpurchase;
	String model;
	double cost;
	public void display1()
	{
		System.out.println("year of purchase "+2001);
		System.out.println("make "+"suzuki");
	}
	public void display2()
	{
		System.out.println("model "+1999);
		System.out.println("cost "+200000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classobj obj1=new classobj();
		classobj obj2=new classobj();
		obj1.display1();
		obj2.display2();

	}

}
