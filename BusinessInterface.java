import java.util.ArrayList;
/**
 * 
 * @author Mohamed Mohamed
 *	CS 108-3
 *	12/6/18
 *	Program 8
 */

public interface BusinessInterface {

	/**
	 * Sorts the restaurants alphabetically from 1-9 to A-Z
	 * While sorting the restaurants alphabetically, it makes sure that the city
	 * and food type does not get out of order
	 * @param location - location of the restaurant
	 * @param foodtype - what kind of food the restaurant serves
	 * @param places - name of that specified restaurant
	 * @param ratings - rating of that restaurant
	 */
	static void sortTable(ArrayList<String> location, ArrayList<String> foodtype,
			ArrayList<String> places, ArrayList<Integer> ratings) {
	}
	
	/**
	 * Prints the restaurants after being sorted alphabetically after
	 * sortTable does its job
	 * Uses the same parameters as sortTable
	 * @param location - location of the restaurant
	 * @param foodtype - what kind of food the restaurant serves
	 * @param places - name of that specified restaurant
	 * @param rating - rating of that restaurant
	 */
	
	static void printTable(ArrayList<String> location, ArrayList<String> foodtype, ArrayList<String> places, ArrayList<Integer> rating) {
	}
	
	
}
