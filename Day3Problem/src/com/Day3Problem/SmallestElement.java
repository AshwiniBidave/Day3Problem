package com.Day3Problem;

public class SmallestElement {

	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 8, 9,75, 56};  
        //Initialize max with first element of array.  
        int min = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("smallest element present in given array: " + min);


	}

}
