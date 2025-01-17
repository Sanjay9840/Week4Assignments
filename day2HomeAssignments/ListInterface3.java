package week4.day2HomeAssignments;

import java.util.ArrayList;
import java.util.List;

public class ListInterface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring an arrays 
		int arr1[] = {3, 2, 11, 4, 6, 7};
		int arr2[] = {1, 2, 8, 4, 9, 7};
		
		//Created list interface
		List<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				//comparing the values if value matches entered in if condition and added to list.
				if(arr1[i]==arr2[j])
				{
					//Equal value added to list from array.
					list.add(arr1[i]);
				}
			}
			
		}
		//printing the equal values
		System.out.println(list);
		
		
		

	}

}
