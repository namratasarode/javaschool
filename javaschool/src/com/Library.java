package com;

public class Library
{
	int acc_num;
	String book_title;
	String Author_nm;
	void input()
	{
		System.out.println("Enter the accession number of book "+acc_num);
		System.out.println("Enter title of book "+book_title);
		System.out.println("Enter the Author of book "+Author_nm);
	}
	void compute()
	{
		
		
	}
	void display()
	{
		System.out.println("accession number of book "+acc_num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj=new Library();
		obj.input();
		obj.display();
	}

}
