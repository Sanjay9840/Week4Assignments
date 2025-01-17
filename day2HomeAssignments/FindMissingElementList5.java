package week4.day2HomeAssignments;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FindMissingElementList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//- Declare an array 
		int array[] =  {1, 2, 3, 4, 10, 6, 8};
		
		//sort the elements in array
		Arrays.sort(array);
		
		//Creating the list interface
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<array.length-1;i++)
		{
			//checking the elements which is not in sequence
			int currentElement = array[i]+1;
			if(currentElement != array[i+1])
			{
				//if sequence are missed it will added to list
				list.add(currentElement);
			}
		}
		//printing the missing elements
		System.out.println("The numbers that are missing : "+list);

	}

}
