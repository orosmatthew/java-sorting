
public class SelectionSorter implements Sorter {
	
	private boolean isVerbose;
	private String arrayName;
	
	// sorts an array using selection sort
	@Override
	public void sort(int[] array) {
		
		if (isVerbose) {
			System.out.println("=== SELECTION SORT ===");
			System.out.println(arrayName + " (before): " + array2string(array));
		}
		
		// loop through array until 2nd last element
		for (int i = 0; i < array.length - 1; i++) {
			
			// assume minIndex is current element
			int minIndex = i;
			
			// loop through elements of array after i
			for (int j = i + 1; j < array.length; j++) {
				
				// if smaller element found, then set minIndex to its location
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			
			// swap current element with the newly found minimum element
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			
			if (isVerbose) {
				System.out.println("(step " + (i + 1) + "): " + array2string(array));
			}
		}
		
		if (isVerbose) {
			System.out.println(arrayName + " (after): " + array2string(array) + "\n");
		}
	}

	@Override
	public void setVerbose(boolean isVerbose) {
		this.isVerbose = isVerbose;
	}

	@Override
	public void setArrayName(String arrayName) {
		this.arrayName = arrayName;	
	}
	
	// returns a string which nicely represents an array
	private static String array2string(int[] array) {
		
		String string = "[";
		
		for (int i = 0; i < array.length - 1; i++) {
			string += array[i];
			string += ", ";
		}
		
		string += array[array.length - 1];
		string += "]";
		
		return string;
		
	}
}
