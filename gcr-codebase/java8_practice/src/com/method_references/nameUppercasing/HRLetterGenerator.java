package com.method_references.nameUppercasing;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HRLetterGenerator {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("harsh raj", "anjali sharma", "amit verma");

        List<String> upperCaseNames = employees.stream()
            .map(String::toUpperCase) // Shorthand for s -> s.toUpperCase()
            .collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}