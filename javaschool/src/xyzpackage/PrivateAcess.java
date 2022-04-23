//Private access Specifier

package xyzpackage;
class Abc
{
	private int num=10;
	private int square(int a)
	{
		return a*a;
	}
}

public class PrivateAcess 
{

	public static void main(String args[])
	{
		Abc obj=new Abc();
		System.out.println(obj.num);
		System.out.println(obj.square(10));
    }
	
}
