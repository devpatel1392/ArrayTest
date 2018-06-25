package arraymanipulation;

public class ArrayManipulation {

	/** given a 1-D array return a 2-D array
	 * For example: int[] array = {1, 2, 3, 4, 5, 6}, numRows = 2
	 * return {{1, 2, 3}, {4, 5, 6}}
	 * if the array can't be evenly divided by numRows, then return null
	*/
	public static int[][] createTwoDArray( int[] array, int numRows){
		// implement
		int[][] array2D = new int[numRows][array.length/numRows];
		int num = 0;
		if(array.length % numRows != 0) {
                    array2D = null;
		}
		else {
                    for(int i=0; i<numRows; i++){
                        for(int j=0; j<(array.length/numRows); j++){
                            array2D[i][j] = array[num];
				num++;
				}
			}
		}
                
		return array2D;
	}


	/** int[row][column] array
	 * rotate row = indexOfRowToRotate once. If a row is composed of numbers:
	 * {1, 4, 9, 8}, then after one rotation it is {8, 1, 4, 9}
	 * If the indexOfRowToRotate is out of boundary, print error and do nothing
	 */
	public static void rotateRowOnce( int[][] array, int indexOfRowToRotate){
		// implement
		
		if(indexOfRowToRotate > array[0].length){
                    System.out.println("Error.");
		}
		else {
			int[] thing = new int[array[0].length];
			// this creates an array of the row
			for(int i =0; i<array[0].length; i++){
				thing[i] = array[indexOfRowToRotate][i];
			}
			int num = array[0].length - 1;
			// this changes the 2D array values 
			for (int i=0; i<(array[0].length); i++){
                            array[indexOfRowToRotate][i] = thing[num];
                            num++;
				if(num>array[0].length-1){
                                    num = 0;
				}
			}
		}
	}


	/**
	 * return the number of occurrence of the given integer in the array
	 */
	public static int frequency( int[][] array, int integer){
		// implement
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[0].length; j++) {
				if (array[i][j] == integer) {
					counter++;
				}
			}
		}
		return counter;
	}


	// swap the two rows of the 2D array and return the resulting array
	// If rowOne or rowTwo is out of boundary, or if rowOne is the same as rowTwo, print error and do nothing
	public static void swapRow( int[][] array, int rowOne, int rowTwo){
		// implement
		if(rowOne > array.length || rowOne < 0 || rowTwo > array.length || rowTwo < 0 || rowOne == rowTwo){
			System.out.println("error");
		
		}else{
			//swaps rows
			for(int i=0; i < array.length+1;i++){
				int temp = array[rowOne][i];
				array[rowOne][i] = array[rowTwo][i];
				array[rowTwo][i] = temp;
				}
			}
		}
	

	// may be helpful for debugging
	public static void display2DArray( int[][] array){
		if (array == null){
			System.out.println("error -- the array is null");
			return;
		}
		System.out.print("{");
		for (int i = 0; i < array.length; i++){
			System.out.print("{");
			for (int j = 0; j < array[0].length - 1; j++){
				System.out.print( array[i][j] + ", ");
			}
			System.out.print( array[i][array[0].length - 1] + "}");
			if (i != (array.length - 1)){
				System.out.print(",\n");
			}
		}
		System.out.print("}\n\n");
	}


	public static void display1DArray(int[] array){
		if (array == null){
                    System.out.println("Error: Array is null.");
                    return;
		}
                
		System.out.print("{");
                
		for (int i = 0; i < array.length - 1; i++){
                    System.out.print(array[i] + ",");
		}
                
		System.out.print(array[array.length - 1]);
		System.out.print("}\n\n");
	}
}