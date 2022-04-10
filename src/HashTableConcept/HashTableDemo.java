package HashTableConcept;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Tom", 100);
		marks.put("Leslie", 200);
		marks.put("Adam", 300);
		
		System.out.println(marks.get("Tom"));
		
		
		

	}

}
