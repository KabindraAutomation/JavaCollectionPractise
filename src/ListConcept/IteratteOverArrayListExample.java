package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratteOverArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>tvShows = new ArrayList();
				tvShows.add("News");
		tvShows.add("Series");
		tvShows.add("Sport");
		tvShows.add("Cooking");
		
		System.out.println("*** Iterate using java 8 for for each and lamda **");
		tvShows.forEach(tvShow->System.out.println(tvShow));
		
		System.out.println("*** Iterate using an iterator() **");
		Iterator<String> tvShowIterator = tvShows.iterator();
		//********************************
		while(tvShowIterator.hasNext()) {
			
			String tvShow = tvShowIterator.next();
			System.out.println(tvShow);
			//******************************************
		}

	}

}
