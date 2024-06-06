package Programms;

import java.util.Arrays;

public class LargestNumbersArray {

	//Approach 1
	
	public void FindThelargestNumber() {

		
	   //input int arr[]={56,34,13,78,90,9,87,65,54,32};
		
		
		int arr[]= {56,34,13,78,90,9,87,65,54,32};
		
		int max=arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>max) {
				max=arr[i];
			}
			
		}
		
		
		System.out.println("the largest number of array is "+max);
		
	}
	
	//Approach 2
	
		public void FindThelargestNumber2() {

			
		   //input int arr[]={56,34,13,78,90,9,87,65,54,32};
			
			int arr[]= {56,34,13,78,90,9,87,65,54,32};
			
			for (int i = 0; i < arr.length; i++) {
				
				for (int j = i; j < arr.length; j++) {
					
					if (arr[i]>arr[j]) {
						
						swap(arr, i, j);
					}
				}
				
			}
			
			System.out.println("the largest number of array is "+arr[arr.length-1]);
			
			
			
			
		}
		
		//Approach 3
		
			public void FindThelargestNumber3() {

				
			   //input int arr[]={56,34,13,78,90,9,87,65,54,32};
				
				int arr[]= {56,34,13,78,90,9,87,65,54,32};
				
				Arrays.sort(arr);
				
				System.out.println("the largest number of array is "+arr[arr.length-1]);
				
				
				
				
			}
		
		public  static void swap(int [] arr,int i ,int j) {
			
			
			int c=0;
			
			c=arr[i];
			
		    arr[i]=arr[j];
		    arr[j]=c;
		    
		}
		
		public static void main(String[] args) {
			
			
			LargestNumbersArray app= new LargestNumbersArray();
			
			 		//Approach 1
			
			//app.FindThelargestNumber();
			
			
					//Approach 2
				
			//app.FindThelargestNumber2();
			
					//Approach 3
			
			app.FindThelargestNumber3();
			
		}
		
}
