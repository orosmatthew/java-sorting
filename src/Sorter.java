
public interface Sorter {
	
	// will sort an array by pass by reference
	void sort(int[] array);
	
	// used to set whether the sorting should print out steps and result
	void setVerbose(boolean isVerbose);
	
	// used to set the name of the array printed if isVerbose is true
	void setArrayName(String arrayName);
	
}
