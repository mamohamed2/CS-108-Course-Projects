import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import realtimeweb.simplebusiness.SimpleBusiness;
import realtimeweb.simplebusiness.domain.Business;
/**
 * 
 * @author Mohamed Mohamed
 *	CS 108-3
 *	12/6/18
 *	Program 8
 */
public class BusinessApplication implements BusinessInterface {
	public static void main(String[] args) {
		

		SimpleBusiness business = new SimpleBusiness("businessone.json");
		// Criteria
		String[] kinds = {"Chinese" , "Italian"};
		String[] cities = {"Atlanta, GA", "Denver, CO","Blacksburg, VA"};
		
		
		
		System.out.println("Enter a rating");
		Scanner scan = new Scanner(System.in);
		int rating = scan.nextInt();
		
		ArrayList<String> alphabeticplaces = new ArrayList<>(); // name of restaurant
		ArrayList<String> alphalocation = new ArrayList<>(); // location of restaurant
		ArrayList<String> foodtype = new ArrayList<>(); // types of food that restaurant serves
		ArrayList<Integer> ratings = new ArrayList<>(); // ratings of those restauranrs
		for (String city : cities) {
			for (String kind : kinds) {
				
				ArrayList<Business> businesses = business.search(kind, city);
				
				for (Business b : businesses) {
					
					if (b.getRating() == rating) { // if rating matches the input, it records
						// the details into each ArrayList
						alphabeticplaces.add(b.getName());
						alphalocation.add(city);
						foodtype.add(kind);
						ratings.add(rating);
						
					}
					else {
						continue;
					}
					
				}
				
			}
			
		}
		// After the enhanced for loops are done, the restaurants must be organized 
		// alphabetically, which is sortTable's job
		
		sortTable(alphalocation,foodtype,alphabeticplaces,ratings);
	}
	
	public static void sortTable(ArrayList<String> location, ArrayList<String> foodtype,
			ArrayList<String> places, ArrayList<Integer> ratings) {
		
		// A double for loop is used to compare the restaurant's strings 
		// of the first and the one after
		for (int i  = 0; i < places.size(); i++) {
			for (int j = i + 1; j < places.size(); j++) {
				if(places.get(i).compareTo(places.get(j)) > 0) { 
					// Essentially, if it's not in alphabetical order, I swap the 
					// restaurant's names back to alphabetical order
					// I don't just swap the places ArrayList, I swap all of them
					// to make sure all the information is correct and where it
					// needs to be
					Collections.swap(places, i, j);
					Collections.swap(ratings, i, j);
					Collections.swap(foodtype, i, j);
					Collections.swap(location, i, j);
				}
				
			}
			
		}
		// I have finished moving it back to order, now it's time to print the table :)
		
		
		printTable(location,foodtype,places,ratings);
		//Same arguments from sortTable are used, except now all the ArrayLists are back
		//in order
		
	}

	public static void printTable(ArrayList<String> location, ArrayList<String> foodtype, 
			ArrayList<String> places, ArrayList<Integer> rating) {
		
		System.out.printf("%-25s%-15s%-45s%-9s\n", "Place", "Food type", "Business name ", "Rating");
		//printf is used to space out the table to fit all the names 
		System.out.print("---------------          ");
		System.out.print("---------      ");
		System.out.print("--------------------------------              ");
		System.out.println("------");
		//in all honesty, I forgot how to organize the dashes so I just did it the hard way :(
		for (int i = 0; i < places.size(); i++) {
			//this for loop just prints the contents of the ArrayList in its organized form
			System.out.printf("%-25s%-15s%-45s%-9s\n", location.get(i), foodtype.get(i), places.get(i), rating.get(i) + " stars");		
			}
		
		
	}
	
	
		
		
	
}

