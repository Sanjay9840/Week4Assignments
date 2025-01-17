package week4.day2HomeAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumberList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array
		int[] array = {3, 2, 11, 4, 6, 7};
		
		//Arrange the collection in ascending order
		Arrays.sort(array);
		
		//Created list interface to add the array elements to list
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<array.length;i++)
		{
			//add array elements to list one by one
			list.add(array[i]);
		}
		//Printing the second largest element from the last
		System.out.println("The second largest number is : "+list.get(array.length-2));

	}

}
