package com;

import java.util.Scanner;

public class Library
{
	int acc_num;
	String book_title;
	String Author_nm;

	Scanner sc=new Scanner(System.in);
	
	void input()
	{
		
		System.out.println("Enter title of book ");
		book_title=sc.nextLine();
		System.out.println("Enter the Author of book ");
		Author_nm=sc.nextLine();
		System.out.println("Enter the accession number of book ");
		acc_num=sc.nextInt();
	}	

	void compute()
	{
		System.out.println("Enter the number of days late");
		int days=sc.nextInt();
		int fine=days*5;
		System.out.println("Fine=Rs."+fine +"\n");
	}
	void display()
	{
		System.out.println("accession number of book "+acc_num);
		System.out.println("book Title "+book_title);
		System.out.println("book Author name "+Author_nm);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library obj=new Library();
		obj.input();
		obj.compute();
		obj.display();
		
	}

}
