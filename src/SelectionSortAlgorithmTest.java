import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortAlgorithmTest {

	@Test
	public void testSelectionSort() {
		
		//Empty array test
		int[] a1 = new int[0];
		assertArrayEquals(SelectionSortAlgorithm.selectionSort(a1), new int[0]);
		
		//Negative array test
		int[] a2 = {-2, -5, -3, -7, -10, -9, - 12};
		assertArrayEquals(SelectionSortAlgorithm.selectionSort(a2), new int[] {-12, -10, -9, -7, -5, -3, -2});
	
		//Positive array test
		int[] a3 = {1, 5, 9, 6, 3, 7, 12, 10, 4};
		assertArrayEquals(SelectionSortAlgorithm.selectionSort(a3), new int[] {1, 3, 4, 5, 6, 7, 9, 10, 12});

		//Mixed array test
		int[] a4 = {3, 7, -3, -5, 9, -10};
		assertArrayEquals(SelectionSortAlgorithm.selectionSort(a4), new int[] {-10, -5, -3, 3, 7, 9});
		
	}

}
