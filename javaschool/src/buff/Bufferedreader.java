package buff;

import java.io.*;

public class Bufferedreader {

	public static void main(String args[]) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter your name");
		String nm=br.readLine();
		System.out.println("Welcome "+nm);
		
	}

}
