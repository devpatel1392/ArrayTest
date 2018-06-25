package arraytest;

public class ArrayTest {
	public static int[][] arrayTwoSmall = {{9, 0, 6, 9},
					       {4, 6, 0, 4},
					       {5, 1, 7, 2}};
	public static int[] arrayOneSmall = {7, 7, 5, 6, 0, 6, 9, 3, 2, 0, 4, 3};

	public static void main(String[] args) {
		ArrayManipulation.display1DArray(arrayOneSmall);
		ArrayManipulation.display2DArray( ArrayManipulation.createTwoDArray( arrayOneSmall, 3));
		ArrayManipulation.display2DArray( ArrayManipulation.createTwoDArray( arrayOneSmall, 4));
		ArrayManipulation.display2DArray( ArrayManipulation.createTwoDArray( arrayOneSmall, 5));


		ArrayManipulation.rotateRowOnce( arrayTwoSmall, 6);
		ArrayManipulation.display2DArray(arrayTwoSmall);
		ArrayManipulation.rotateRowOnce( arrayTwoSmall, 0);
		ArrayManipulation.display2DArray(arrayTwoSmall);
		ArrayManipulation.rotateRowOnce( arrayTwoSmall, 2);
		ArrayManipulation.display2DArray(arrayTwoSmall);


		ArrayManipulation.display2DArray( arrayTwoSmall );
		System.out.println("frequence ="+ArrayManipulation.frequency(arrayTwoSmall, 6));
		System.out.println("frequence ="+ArrayManipulation.frequency(arrayTwoSmall, -1));
		System.out.println("frequence ="+ArrayManipulation.frequency(arrayTwoSmall, 7));

		ArrayManipulation.swapRow( arrayTwoSmall, 1, 6);
		ArrayManipulation.swapRow( arrayTwoSmall, 1, 1);
		ArrayManipulation.swapRow( arrayTwoSmall, -1, -1);
		ArrayManipulation.display2DArray(arrayTwoSmall);
		ArrayManipulation.swapRow( arrayTwoSmall, 0, 2);
		ArrayManipulation.display2DArray(arrayTwoSmall);
		ArrayManipulation.swapRow( arrayTwoSmall, 0, 1);
		ArrayManipulation.display2DArray(arrayTwoSmall);

	}

}
