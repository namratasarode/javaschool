//Data Abstraction
package com;

abstract class atm1
{
	abstract void Withdraw();
}
public class DataAbstraction extends atm1
{
	void Withdraw()
	{
		System.out.println("Withdraw Successfully");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DataAbstraction obj=new DataAbstraction();
		obj.Withdraw();
	}

}
