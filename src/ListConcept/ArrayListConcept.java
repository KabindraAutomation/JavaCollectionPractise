package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[] = new int [3]; // static array--> size is fix
		
		//dynamic arrya List
		//1.Can contan duplicate values/elements
		//2.Maintanins inseting order
		//3.Synchronized
		//4.allows randow access to fetch the element because it strores that values on the basis of indexs.
		
		//This concept is non generic where data type is not defined
		ArrayList hr= new ArrayList();
		hr.add("Tero"); //we are getting yellow currly line which is for warning --. it is non generic type, where array list is not define which type of data type
		hr.add(300);
		hr.add(12.22);
		hr.add('a');
		hr.add(true);
		
		//printing all the values from the array by using streanm();
		hr.stream().forEach(s->System.out.println(s));
		
		//non generic VS generic:
		
		// This concept is called generic in Java where data type is defined inside the <> bracket
		ArrayList<Integer> hr1= new ArrayList<Integer>();
		hr1.add(100);
		
		//ArrayList<E> hr2= new ArrayList<E>();
		
		//Employee Class objects:
		Employee emp1  = new Employee("Kabin", 27,"QA");
		Employee emp2 = new Employee("Navin", 28, "Dev");
		Employee emp3 = new Employee("John", 29, "Admin");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(emp1);
		ar4.add(emp2);
		ar4.add(emp3);
		
		//iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			
			
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
			
			System.out.println("*************************");
			
			//addAll()
			ArrayList<String> ar5 = new ArrayList<String>();
			ar5.add("test");
		
			ArrayList<String> ar6 = new ArrayList<String>();
			ar6.add("dev");
			ar6.add("Java");
			ar6.add("JavaScript");
			
			ar5.addAll(ar6);
			for (int i = 0; i<ar5.size(); i++) {
				
				System.out.println(ar5.get(i));
			}
			
			System.out.println("************ removelAll() *************");
			//removeAll()
			
			ar5.removeAll(ar6);
			for (int i = 0; i<ar5.size(); i++) {
				
				System.out.println(ar5.get(i));
			}
			
			//retainAll() --> intersection part or Common part then we can used retainAll() method
			
			ArrayList<String> ar7 = new ArrayList<String>();
			ar7.add("test");
			ar7.add("Selenium");
			ar7.add("QTP");
		
			ArrayList<String> ar8 = new ArrayList<String>();
			ar8.add("test");
			ar8.add("Java");
			ar8.add("JavaScript");
			
			System.out.println("************* retainall() ************");
			ar7.retainAll(ar8);
			for (int i = 0; i<ar7.size(); i++) {
				
				System.out.println(ar7.get(i));
			}
			
		}
		
	
	
		
	}

}
