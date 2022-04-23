//Default Access specifier 
package xyzpackage;
/*/We are importing the abcpackage  but still we will get error because 
 * the class we are trying to use has the default access modifier*/
import abcpackage.*;

public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Add obj=new Add();
		/*it will throw error because we are trying to access the default
		method in another package*/
		System.out.println("addition is "+obj.addTwoNumber(6,30));
	}

}
