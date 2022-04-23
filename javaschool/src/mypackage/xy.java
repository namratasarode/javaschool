package mypackage;

class AcessSpe 
{
	protected String nm="Ram";
	 void display()
	 {
	
		 System.out.println("nm is"+nm);
	 }
}
public class xy extends AcessSpe
{
		public void disp()
		 {
			 System.out.println("nm is"+nm);
		 }	 


public static void main(String[] args) 
	{
		xy obj=new xy();
		obj.display();
		obj.disp();
		// TODO Auto-generated method stub

	}

}

