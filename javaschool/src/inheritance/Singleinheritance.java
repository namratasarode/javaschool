//Single Inheritance
package inheritance;
class One
{
	void disp1()
	{
		System.out.println("one");
		
	}
}
class Two extends One
{
	void disp2()
	{
		System.out.println("Two");
		
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two obj=new Two();
		obj.disp1();
		obj.disp2();
	}

}
