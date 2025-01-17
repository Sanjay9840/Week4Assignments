package week4.day2HomeAssignments;

import java.util.LinkedHashSet;
import java.util.Set;


public class DemonstratingSetInterface6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// provided with a string variable
		String companyName = "google";
		
		//Create a Set to store unique characters
		Set<Character> uniqueChar = new LinkedHashSet<Character>();
		
		//Iterate through each character in the companyName string.
		for(int i=0; i<companyName.length();i++)
		{
			//Add each character into the Set
			uniqueChar.add(companyName.charAt(i));
		}
		//Print the unique characters from the string.
		System.out.println(uniqueChar);


	}

}
