package static_variable;

public class Static_variable
{
	static int a=5;
	public static void  main(String args[])
	{
		Static_variable s1=new Static_variable();
		Static_variable s2=new Static_variable();
		System.out.println("s1.a value="+s1.a);
		System.out.println("s2.a value="+s2.a);
		
		s1.a=10;
		System.out.println("s1.a value="+s1.a);
		System.out.println("s2.a value="+s2.a);
		
	}

}
