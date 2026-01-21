package com.day9_Sorting.MedWarehouseMergeSort;

public class MedWarehouseSort {

	public static void mergeSort(Medicine[] meds, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			mergeSort(meds, left, mid);
			mergeSort(meds, mid + 1, right);

			merge(meds, left, mid, right);
		}
	}

	private static void merge(Medicine[] meds, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		Medicine[] L = new Medicine[n1];
		Medicine[] R = new Medicine[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = meds[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = meds[mid + 1 + j];

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			// Ascending order: Earliest expiry first
			if (L[i].getExpiryDate() <= R[j].getExpiryDate()) {
				meds[k] = L[i];
				i++;
			} else {
				meds[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1)
			meds[k++] = L[i++];
		while (j < n2)
			meds[k++] = R[j++];
	}


}
