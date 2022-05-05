package loopdetection;

import java.util.Iterator;
import java.util.LinkedList;

public class LoopDetectionExercise {

	public static void main(String[] args) {
		/**
		 * To detect a loop, we can keep a list of visited nodes and compare with every next node in the list
		 * 
		 * OR
		 * 
		 * use Floyd's Cycle-Finding Algorithm:
		 * Two pointers traverse the list at different speeds
		 * If they ever point to the same node, there is a loop
		 * 
		 */
		
		// a looping linked list
		LinkedList<String> llist1 = new LinkedList<>();
		
		llist1.add("One");
		llist1.add("Two");
		llist1.add("Five");
		llist1.add("Seven");
		llist1.add("Nine");
		llist1.add(llist1.get(1));
		
		Boolean isLoop = false;
		
		Iterator<String> it1 = llist1.iterator();
		Iterator<String> it2 = llist1.iterator();
		
		while(it2.hasNext() && it1.hasNext()) {
			
			String a = it1.next();
			String b;
			it2.next();
			
			if(it2.hasNext()) {
				
				b = it2.next();
				
			} else {
				
				break;
				
			}
			
			if(a == b) {
				
				isLoop = true;
				break;
				
			}
		}
		
		System.out.println("List loops: " + isLoop);
		
	}

}
