package com.day4_Sorting;
/*
 * 
5. ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data
 */
import java.util.Arrays;
import java.util.Scanner;

public class ExamCellMergeSort {

	public static void mergeSort(int[] scores, int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;

			// Sort first and second halves
			mergeSort(scores, l, m);
			mergeSort(scores, m + 1, r);

			// Merge the sorted halves
			merge(scores, l, m, r);
		}
	}

	private static void merge(int[] scores, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = scores[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = scores[m + 1 + j];

		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			// Sorting in Descending order for Ranks (Highest score first)
			if (L[i] >= R[j]) {
				scores[k] = L[i];
				i++;
			} else {
				scores[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1)
			scores[k++] = L[i++];
		while (j < n2)
			scores[k++] = R[j++];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the scores: ");
		int[] allCenterScores = new int [5];
		for(int i=0;i< 5;i++) {
			allCenterScores[i]=sc.nextInt();
		}

		System.out.println("Raw Scores from Centers: " + Arrays.toString(allCenterScores));

		mergeSort(allCenterScores, 0, allCenterScores.length - 1);

		System.out.println("State-Level Rank List (Highest First): " + Arrays.toString(allCenterScores));
	}
}
