package array;

import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[3];
		int len;
		Scanner sc=new Scanner(System.in);
		len=sc.nextInt();
		System.out.println("Enter the Array element");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array ele are" );
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]+" ");
			
		}

	}

}
