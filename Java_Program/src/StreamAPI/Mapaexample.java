package StreamAPI;
import java.util.*;
import java.util.stream.*;
import java.util.stream.*;

public class Mapaexample {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(15);
		l1.add(10);
		l1.add(5);
		l1.add(30);
		l1.add(25);
		System.out.println(l1);
		List<Integer> l2=l1.stream().map(i->i+10).collect(Collectors.toList());
		l2.stream().forEach(i->System.out.println(i+" "));
		System.out.println("");
		l2.stream().forEach(System.out::println);
		
		
		

	}

}
