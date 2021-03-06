package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	static boolean intArraySorted(int[] array) {
		for (int i = 1; i < array.length; i++) {

			if (array[i-1] > array[i]) {
				return false;
			}
		}
		return true;
	}

// 2. Write a static method called doubleArraySorted.
// This method takes in an array of doubles
// and it returns a boolean.
// The method returns true if the double
// array is in ascending order and false otherwise

	static boolean doubleArraySorted(double[] doubleArray) {

		for (int i = 1; i < doubleArray.length; i++) {


			if (doubleArray[i-1] > doubleArray[i]) {
				return false;
			}
		}
		return true;

	}

// 3. Write a static method called charArraySorted.
// This method takes in an array of characters
// and it returns a boolean.
// The method returns true if the character
// array is in alphabetical order and false otherwise
// (You can compare characters just like integers)

	static boolean charArraySorted(char[] arrayChar) {

		for (int i = 1; i < arrayChar.length; i++) {

			if (arrayChar[i-1] > arrayChar[i]) {
				return false;
			}
		}
		return true;
	}



// 4. Write a static method called stringArraySorted.
// This method takes in an array of Strings
// and it returns a boolean.
// The method returns true if the String
// array is in alphabetical order and false otherwise
// (Use the compareTo(String) method)

static boolean stringArraySorted(String[] arrayString) {

	for (int i = 1; i < arrayString.length; i++) {

		if (arrayString[i-1].compareTo(arrayString[i])>0){
			return false;
		}
	}
	return true;
}

}



