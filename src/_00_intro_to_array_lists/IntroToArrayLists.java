package _00_intro_to_array_lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> arraylist=new ArrayList<String>();
		
		
		//2. Add five Strings to your list
		arraylist.add("a");
		arraylist.add("b");
		arraylist.add("c");
		arraylist.add("d");
		arraylist.add("e");
		//3. Print all the Strings using a standard for-loop
		
		for (int i = 0; i < arraylist.size(); i++) {
			String a = arraylist.get(i);
			System.out.println(a);
		}
		
		//4. Print all the Strings using a for-each loop
		
		for (String str : arraylist) {
			System.out.println(str);
		}
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
