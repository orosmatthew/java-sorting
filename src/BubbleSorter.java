
public class BubbleSorter implements Sorter {
	
	private boolean isVerbose = false;
	private String arrayName = "array";
	
	// sorts an array using bubble sort
	@Override
	public void sort(int[] array) {
		
		if (isVerbose) {
			System.out.println("=== BUBBLE SORT ===");
			System.out.println(arrayName + " (before): " + array2string(array));
		}
		
		boolean hasSwapped;
		int stepCount = 1;
		
		do {
			// assume no swaps until swap has occurred
			hasSwapped = false;
			
			// loop through array until 2nd last element
			for (int i = 0; i < array.length - 1; i++) {
				
				// compare current element with next element
				if (array[i] > array[i + 1]) {
					
					// if greater, then swap will occur
					hasSwapped = true;
					
					// swap elements
					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
			}
			
			if (isVerbose) {
				System.out.println("(step " + stepCount + "): " + array2string(array));
			}
			
			stepCount++;
		
		// keep looping until no swaps occur
		} while (hasSwapped == true);
		
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
