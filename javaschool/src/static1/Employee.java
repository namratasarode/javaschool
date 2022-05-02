//Static Method
package static1;

class Employee {

	int id;
	String nm;
	static String company="WIT";
	static void change()
	{
		company="SRT";
	}
	Employee(int i,String n)
	{
		id=i;
		nm=n;
		
	}
	void dispaly()
	{
		System.out.println(id+" "+nm+" "+company);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.change();
		Employee e1=new Employee(111,"john");
		Employee e2=new Employee(123,"Alex");
		e1.dispaly();
		e2.dispaly();
	}

}
