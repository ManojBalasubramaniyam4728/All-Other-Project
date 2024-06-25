package Selenium_For_PE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;



public class list {
	public static void lists() {
		//list will maintain insertion order
		//list will have dupicate value
		//list will have home and hetro
		//list will allow null value
	List<Object> li=new ArrayList<>();
	   li.add("ggg");
	   li.add(1);
	   li.add('a');
	   li.add("ggg");
	   li.add(false);
	   li.add("");
	   System.out.println(li);
	}
	public static void arraylist() {
		// array list will maintain insertion order
		// array list will have dupicate value
		// array list will have home and hetro
		// array list will allow null value
		ArrayList<Object> li = new ArrayList<>();
		li.add("ggg");
		li.add(1);
		li.add('a');
		li.add("ggg");
		li.add(false);
		li.add("");
		System.out.println(li);
	}
	public static void linkedlist() {
		// linked list will maintain insertion order
		// linked list will have dupicate value
		// linked list will have home and hetro
		// linked list will allow null value
		LinkedList<Object> li = new LinkedList<>();
		li.add("ggg");
		li.add(1);
		li.add('a');
		li.add("ggg");
		li.add(false);
		li.add("");
		System.out.println(li);
	}
	public static void linkedHasset() {
		// linkedHasset will maintain insertion order
		// linkedHasset will not have dupicate value
		// linkedHasset will have home and hetro
		// linkedHasset will allow null value
		LinkedHashSet<Object> li = new LinkedHashSet();
		li.add("ggg");
		li.add(1);
		li.add('a');
		li.add("ggg");
		li.add(false);
		li.add("");
		System.out.println(li);
	}
	
	public static void hasSet() {
		// hasSet will not maintain insertion
		// hasSet will not have dupicate value
		// hasSet will have home and hetro
		// hasSet will allow null value
		HashSet<Object> li = new HashSet<>();
		li.add("ggg");
		li.add(1);
		li.add('a');
		li.add("ggg");
		li.add(false);
		li.add("");
		System.out.println(li);
	}
	
	public static void treeSet() {
		// treeSet will not maintain insertion order but we can pedecite it will be in asscending order
		// treeSet will not have dupicate value
		// treeSet will have only home
		// treeSet will allow null value
//		TreeSet<String> li=new TreeSet<String>();  
//		li.add("ggg");
//		li.add("ggg");
//		li.add("");
//		System.out.println(li);
	}
	
	public static void main(String[] args) {
		list.lists();
		list.arraylist();
		list.linkedlist();
		list.linkedHasset();
		list.hasSet();
	}
}