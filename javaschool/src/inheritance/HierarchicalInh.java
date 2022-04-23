//Hierarchical Inheritance
package inheritance;

class First1
{
	void disp1()
	{
		System.out.println("one");
		
	}
}
class Second2 extends First1
{
	void disp2()
	{
		System.out.println("Two");
		
	}
}
class Third3 extends First1
{
	void disp3()
	{
		System.out.println("three");
		
	}
}
class Fourth4 extends First1
{
	void disp4()
	{
		System.out.println("Four");
		
	}
}
public class HierarchicalInh 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourth4 obj1=new Fourth4();
		obj1.disp1();
		obj1.disp4();
		
		Third3 obj2=new Third3();
		obj2.disp1();
		obj2.disp3();
		
		Second2 obj3=new Second2();
		obj3.disp1();
		obj3.disp2();

	}

}
