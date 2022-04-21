//Inheritance
package com;

class Withdraw
{
	int amt_withdraw=20000;
}
public class Atm extends Withdraw
{
	int amt_left=5000;
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
		Atm obj=new Atm();
		System.out.println("Amount withdraw "+obj.amt_withdraw);
		System.out.println("Amount left "+obj.amt_left);
		
	}

}
