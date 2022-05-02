//Final Keyword

package final_keyword;

public class Bike {
	final int speedlimit=90;
	void run()
	{
		//error:-The final field Bike.speedlimit cannot be assigned
		//speedlimit=100;
		System.out.println("speedlimit "+speedlimit);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike();
		obj.run();
		

	}

}
