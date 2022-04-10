package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		//Print:
		System.out.println("content of linkelist: "+ ll);
		//addFirst();
		ll.addFirst("Kabin");
		
		//addLast();
		ll.addLast("Automation");
		System.out.println("content of linkelist: "+ ll);
		
		//get:
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//Set:--> initiallly it have kabin value in 0th index, but after set now Tom values is in 0th index
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkelist: "+ ll);
		
		ll.remove(2);
		System.out.println("content of linkelist: "+ ll);
		System.out.println("*******************************************");
		//how to print all the values of linkedlist:
		//javaStream() latest one:
		//using for loop
		//using advance for loop
		//iterator
		//while loop
		
		
	    //using Stream();
		System.out.println("******************/using Stream()*************************");
		ll.stream().forEach(b->System.out.println(b));
		
		//using for loop
		System.out.println("******************/using for loop*************************");
		for ( int i = 0; i<ll.size(); i++) {
			
			System.out.println(ll.get(i));
		}
		//using Advance for loop
		System.out.println("******************/using for advance loop r*************************");
		for(String str : ll) {
			System.out.println(str);
		}
		
		//using iterator
		System.out.println("******************/using for Iterator*************************");
		Iterator<String> Lists= ll.iterator();
		while(Lists.hasNext()) {
			
			String Listname= Lists.next();
			System.out.println(Listname);
		}
		System.out.println("******************/using for while loop*************************");
		int j= 0;
		while(j<ll.size()) {
			
			System.out.println(ll.get(j));
			j++; 
		}
		

	}

}

