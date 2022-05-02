package this_keyword;

class student 
{
	int rn;
	String nm;
	float fee;
	student(int rn,String nm,float fee)
	{
		this.rn=rn;
		this.nm=nm;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rn+" "+nm+" "+fee);
	}


	public static void main(String args[])
	{
			student s1=new student(111,"Ram",40000f);
			student s2=new student(112,"shyam",50000f);
			s1.display();
			s2.display();
	}
}


