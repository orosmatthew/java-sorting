
public class SorterTester {
	
	// generates an array given a length, minimum value, and maximum value
	public int[] generateIntArray(int length, int min, int max) {
		
		// create the array
		int[] array = new int[length];
		
		// loop through array adding random elements
		for (int i = 0; i < length; i++) {
			array[i] = (int) (Math.round(Math.random() * ((max - min) + 0.5)) + min);
		}
		
		return array;
		
	}
}
