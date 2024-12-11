package practice.qa;

import java.util.ArrayList;
import java.util.List;

public class CallByValueTest {

	public static void m1(List<Integer> list) {
		
		list.add(9);
		System.out.println("method m1 : " + list);
	}	

	public static void m2(List<Integer> list) {

		list = null; //making this list null won't affect original list variable that's why java is call by value.
		System.out.println("method m2 : " + list);
	}
	
	public static void m3(List<Integer> list) {

		list.add(5);
		System.out.println("method m3 : " + list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		
		m1(list);
		m2(list);
		m3(list);
		
		System.out.println("main method : " + list);
		
	}

}
