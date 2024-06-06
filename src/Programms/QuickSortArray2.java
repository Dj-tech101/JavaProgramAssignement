package Programms;

import java.util.Arrays;

public class QuickSortArray2 {

	//Approach 1
	
	
	
		public void quickSortBySwap() {

			
		   //input int arr[]={56,34,13,78,90,9,87,65,54,32};
			
			int arr[]= {17, 14, 15, 28, 6, 8, -6, 1, 3, 18};
			
			for (int i = 0; i < arr.length; i++) {
				
				for (int j = i; j < arr.length; j++) {
					
					if (arr[i]>arr[j]) {
						
						swap(arr, i, j);
					}
				}
				
			}
			
			System.out.println("sorted array is  "+Arrays.toString(arr));
			
			
			
			
		}
		
		//Approach 2
		
			public void quickSortByArrays() {

				
			   //input int arr[]={56,34,13,78,90,9,87,65,54,32};
				
				int arr[]= {17, 14, 15, 28, 6, 8, -6, 1, 3, 18};
				
				Arrays.sort(arr);
				
				System.out.println("sorted array is  "+Arrays.toString(arr));
				
				
				
				
			}
		
		public  static void swap(int [] arr,int i ,int j) {
			
			
			int c=0;
			
			c=arr[i];
			
		    arr[i]=arr[j];
		    arr[j]=c;
		    
		}
		
		public static void main(String[] args) {
			
			
			QuickSortArray2 app= new QuickSortArray2();
			
			 		//Approach 1
			
			app.quickSortBySwap();
			
			
					//Approach 2
				
			
			app.quickSortByArrays();
			
		}
		
}
