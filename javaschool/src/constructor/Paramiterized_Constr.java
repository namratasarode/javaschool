package constructor;

public class Paramiterized_Constr {
	Paramiterized_Constr()
	{
	System.out.println("Default Constructor");
	
	}
	Paramiterized_Constr(int i,int j)
	{
		System.out.println("Constructor with two parameters");
	}
	Paramiterized_Constr(int i,int j,int k)
	{
		System.out.println("Constructor with three parameters");
	}
	Paramiterized_Constr(int i,String nm)
	{
		System.out.println("Constructor with int and string parameter");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Paramiterized_Constr obj1=new Paramiterized_Constr();
		Paramiterized_Constr obj2=new Paramiterized_Constr(12,12);
		Paramiterized_Constr obj3=new Paramiterized_Constr(1,2,3);
		Paramiterized_Constr obj4=new Paramiterized_Constr(1,"BegginersBook");
	}

}
