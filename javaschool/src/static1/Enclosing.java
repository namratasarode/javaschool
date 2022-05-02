//Nested Class
package static1;

public class Enclosing 
{
	private static int x=1;
	public static class StaticNested
	{
		private void run()
		{
			System.out.println("value is x="+x);
			System.out.println("Running");
		}
	}
	public void test()
	{
		Enclosing.StaticNested nested=new Enclosing.StaticNested();
		nested.run();
		
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Enclosing obj=new Enclosing();
		obj.test();
		
	}
}
