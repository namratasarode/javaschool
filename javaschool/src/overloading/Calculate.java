package overloading;

class Calculate {
	void volume(int s)
	{
		int cube=s*s*s;
		System.out.println("area of cube="+cube);
	}
	void volume(int l,int b,int h)
	{
		int cuboid=l*b*h;
		System.out.println("area of cuboid="+cuboid);
	}
	
	void volume(double r)
	{
		double sphere=4/3*3.14*r*r*r;
		System.out.println("area of sphere="+sphere);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Calculate obj=new Calculate();
		obj.volume(3);
		obj.volume(2,4,3);
		obj.volume(2.0);
	}

}
