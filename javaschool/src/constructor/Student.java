//Default Constructor

package constructor;
class Student {
	int id;
	String name;
	Student()
	{
		id=11;
		name="Ram";
		System.out.println(id+" "+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.id=101;
		s1.name="sham";
		System.out.println(s1.id+" "+s1.name);
		
	}

}
