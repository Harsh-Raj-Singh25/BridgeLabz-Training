package com.Sorting.selectionSort;

import java.util.Arrays;

public class SelectionSortExamScores {

    public static void main(String[] args) {

        int[] examScores = {78, 45, 89, 62, 91, 54};

        System.out.println("Exam Scores before Sorting :");
        System.out.println(Arrays.toString(examScores));

        SelectionSort.sort(examScores);

        System.out.println("Exam Scores after Sorting (Ascending):");
        System.out.println(Arrays.toString(examScores));
    }
}