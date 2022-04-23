//Multilevel Inheritance
package inheritance;

class First
{
	void disp1()
	{
		System.out.println("one");
		
	}
}
class Second extends First
{
	void disp2()
	{
		System.out.println("Two");
		
	}
}
class Third extends Second
{
	void disp3()
	{
		System.out.println("three");
		
	}
}
class Fourth extends Third
{
	void disp4()
	{
		System.out.println("Four");
		
	}
}

public class MultilevelInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourth obj=new Fourth();
		obj.disp1();
		obj.disp2();
		obj.disp3();
		obj.disp4();
	}

}
