package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		
		String[] sports = {"tennis", "soccer", "football"};
		assertEquals(0, _00_LinearSearch.linearSearch(sports, "tennis"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		
		int [] numbers = { 1, 2, 3, 4};
		assertEquals(2, _01_BinarySearch.binarySearch(numbers, 0, 3, 3));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		
		int [] numbers = {1, 2, 3, 4, 5};
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(numbers, 4));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		
		int [] numbers = {1, 2, 3, 4, 5, 6};
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(numbers, 5));
	}
}
