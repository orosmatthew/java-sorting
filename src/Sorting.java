// Main Class
public class Sorting {

	public static void main(String[] args) {
		
		SorterTester sorterTester = new SorterTester();
		
		// create random arrays
		int[] testArray1 = sorterTester.generateIntArray(10, -20, 20);
		int[] testArray2 = sorterTester.generateIntArray(10, -20, 20);
		int[] testArray3 = sorterTester.generateIntArray(10, -20, 20);
		
		// initialize sorters
		Sorter insertionSorter = new InsertionSorter();
		Sorter selectionSorter = new SelectionSorter();
		Sorter bubbleSorter = new BubbleSorter();
		
		// set all to verbose so they print their steps and result
		insertionSorter.setVerbose(true);
		selectionSorter.setVerbose(true);
		bubbleSorter.setVerbose(true);
		
		// set array names and sort the arrays
		insertionSorter.setArrayName("testArray1");
		insertionSorter.sort(testArray1);
		
		selectionSorter.setArrayName("testArray2");
		selectionSorter.sort(testArray2);
		
		bubbleSorter.setArrayName("testArray3");
		bubbleSorter.sort(testArray3);
		
	}
}
