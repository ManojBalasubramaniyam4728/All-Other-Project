package Selenium_For_PE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Ordering;

public class AscendingOrderAndDscendingOrderVerification {

	public static void main(String[] args) {
		List<String> strings1=new ArrayList<>();
		strings1.add("ALFA INSURANCE");
		strings1.add("AT&T");
		strings1.add("Anheuser Busch");
		strings1.add("BC WEB WISE");
		strings1.add("DSW");
		strings1.add("Dharma Productions");		
		strings1.add("ER");
		strings1.add("Havas WorldWide India Pvt Ltd");
		strings1.add("I T Entertainment");
		strings1.add("LG");
		strings1.add("Love Talent Corp");
		strings1.add("Magic Johnson Entertainment Inc");
		strings1.add("NBA Entertainment");
		strings1.add("Nestle");
		strings1.add("Samsung Inc");
		strings1.add("Sociallyin");
		strings1.add("Tangerine Talent LLC");
		strings1.add("Test");
		strings1.add("Translation LLC");
		strings1.add("The Total Entertainment");
		strings1.add("Toei animation");
	    strings1.add("Trania");
	    strings1.add("bb1");
		
	    //first sorting in ascending order
	    Collections.sort(strings1);
		
	    // verifying List is in ascending order
		boolean sorted1 = Ordering.natural().isOrdered(strings1); // Returns true, as the list is ordered
		System.out.println(sorted1);
		
		//Making ascending order into Decendind order
		List<String> strings2=new ArrayList<>();
		for (int i = strings1.size()-1; i >=0; i--) {
			strings2.add(strings1.get(i));
		}
		System.out.println(strings2);
		
		//Verifying list is in Decendind order
		boolean sorted = Ordering.natural().reverse().isOrdered(strings2); // Returns true, as the list is ordered
		System.out.println(sorted);

	}

}
