package intersection;

import java.util.Iterator;
import java.util.LinkedList;

public class IntersectionExercise {

	public static void main(String[] args) {
		
		// two LinkedLists which intersect
		LinkedList<String> llist1 = new LinkedList<>();
		LinkedList<String> llist2 = new LinkedList<>();
		
		llist1.add("One");
		llist1.add("Three");
		llist1.add("Five");
		llist1.add("Seven");
		llist1.add("Nine");
		llist1.add("Eleven");

		llist2.add("Six");
		llist2.add("Seven");
		llist2.add("Nine");
		llist2.add("Eleven");
		
		/**
		 * If there is an intersection, the last n nodes will be the same for each.
		 * Compare each list (ignoring first node(s) of the longer list) to see if
		 * nodes toward the end are the same.
		 */
		int size1 = llist1.size();
		int size2 = llist2.size();
		int d = size1 - size2;

		String result;
		
		if(d < 0) {
			
			result = getIntersectingNode(Math.abs(d), llist2, llist1);
			
		} else {
			
			result = getIntersectingNode(Math.abs(d), llist1, llist2);
			
		}

		System.out.println(result);
	}
	
	public static String getIntersectingNode(int lengthDiff, LinkedList<String> l1, LinkedList<String> l2) {
		
		Iterator<String> it1 = l1.iterator();
		Iterator<String> it2 = l2.iterator();
		
		for(int i = 0; i < lengthDiff; i++) {
			
			if(it1.hasNext()) {

				it1.next();
				
			}
		}
		
		while(it1.hasNext() && it2.hasNext()) {
			
			String a = it1.next();
			String b = it2.next();
//			System.out.println("String a: " + a + " String b: " + b);	// TEST
			
			if(a == b) return a;
			
		}
		
		return "No intersection found";
	}

}
