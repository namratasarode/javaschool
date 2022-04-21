//Polymorphism
package com;

public class Polymorphism
{
	void add(int x,int y)
	{
		System.out.println("add 2 nos= "+(x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("add 3 nos= "+(x+y+z));
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Polymorphism obj=new Polymorphism();
		obj.add(4,5);
		obj.add(3,5,2);
	}

}
