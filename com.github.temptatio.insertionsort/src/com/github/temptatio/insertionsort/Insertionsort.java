package com.github.temptatio.insertionsort;

/**
 * Diese Klasse implementiert Insertion-Sort zum Sortieren eines Arrays
 *
 */
public class Insertionsort {

	/**
	 * Diese Methode sortiert ein double-Array
	 * 
	 * @param array
	 *            Das zu sortierende Array
	 */
	public static void sort(double[] array) {
		final int laenge = array.length;

		for (int i = 1; i < laenge; ++i) {
			for (int j = 0; j < i; ++j) {
				if (array[j] > array[i]) {
					double tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}

}
