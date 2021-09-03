
public class InsertionSorter implements Sorter {
	
	private boolean isVerbose = false;
	private String arrayName = "array";
	
	// sorts an array using insertion sort
	@Override
	public void sort(int[] array) {
		
		if (isVerbose) {
			System.out.println("=== INSERTION SORT ===");
			System.out.println(arrayName + " (before): " + array2string(array));
		}
		
		// loop through array starting on 2nd element
		for (int i = 1; i < array.length; i++) {
			
			// key is element that is going to be inserted
			int key = array[i];
			
			// start looping backwards through array starting on element previous of key
			int j = i - 1;
			while (j >= 0 && key < array[j]) {
				
				// keep moving element up array until location for key is found
				array[j + 1] = array[j];
				
				j--;
			}
			
			// place key in correct location
			array[j + 1] = key;
			
			if (isVerbose) {
				System.out.println("(step " + i + "): " + array2string(array));
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
