/*Write a modified version of the selection sort algorithm that selects the largest
 * element each time and moves it to the end of the array, rather than selecting the 
 * smallest element and moving it to the front of the array. Will this algorithm be
 * faster than the standard selection sort? What will its complexity class be?
 */

//Implements a selection sort algorithm that selects the largest element and puts it at
//the end of the array. This algorithm will not be faster than the standard selection 
//sort. In fact, it will run in O(n^2) time, just like the standard selection sort. This
//is because just like in the standard selection sort, we have to go through every element
//of the array for each iteration in order to find the largest value to append.

public class SelectionSortAlgorithm {
	
	public static int[] selectionSort(int[] array) {
		if(array.length == 0) {
			return array;
		}
		
		for(int i = array.length - 1; i > 0; i--) {
			int largest = i;
			for(int j = i - 1; j >= 0; j--) {
				if(array[j] > array[largest]) {
					largest = j;
				}
			}
			
			swap(array, i, largest);
		}
		return array;
	}
	
	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	private static void printArr(int[] a) {
		for(Integer i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {2, 5, 3, 8, 7, 12, 27, 16};
		
		printArr(a);
		selectionSort(a);
		printArr(a);
	}
	

}
