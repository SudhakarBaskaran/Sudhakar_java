package com.GradedProject.Question3;

import java.util.Arrays;
import java.util.List;

public class Main {
	    public static void main(String[] args) {    
	    	 int[] numbers = {1,2,3,4,5};
	    	 
	    	 int oddSquareSum = Arrays.stream(numbers)
	    			 .filter(number -> number %2!=0)
	    			 .map(oddNumber -> oddNumber * oddNumber)
	    			 .sum();
	    	 System.out.println(oddSquareSum);
	     }
	}
