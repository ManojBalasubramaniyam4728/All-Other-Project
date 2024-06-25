package Selenium_For_PE;



	import java.util.ArrayList;
	import java.util.Collections;

	public class ReverseArrayList {
	    public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<Integer> arrayList = new ArrayList<>();

	        // Add some elements to the ArrayList
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3);
	        arrayList.add(4);
	        arrayList.add(5);

	        // Reverse the ArrayList using Collections.reverse()
	        Collections.reverse(arrayList);

	        // Print the reversed ArrayList
	        for (int i = 0; i < arrayList.size(); i++) {
	            System.out.println(arrayList.get(i));
	        }
	    }
	}



