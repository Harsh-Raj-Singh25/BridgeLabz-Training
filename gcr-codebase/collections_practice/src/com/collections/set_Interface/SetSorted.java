package com.collections.set_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SetSorted {
    public static List<Integer> sortSet(Set<Integer> inputSet) {
        // 1. Create a List and pass the Set into the constructor
        List<Integer> list = new ArrayList<>(inputSet);

        // 2. Sort the list (Natural order: ascending)
        Collections.sort(list);
        
        return list;
    }

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        System.out.println("Sorted List: " + sortSet(numbers));
    }
}
