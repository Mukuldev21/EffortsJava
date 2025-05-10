package org.automation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PalindromeFilter {

    public static void main(String[] args){

        List<String> words = Arrays.asList("mapple","umbrella","level",
                "madam","tenet","world","cloud" );

        Predicate<String> isPalindrome = str -> str.equalsIgnoreCase(new StringBuilder(str)
                .reverse().toString());

        List<String> palindromes = words.stream().filter(isPalindrome)
                .collect(Collectors.toList());

        System.out.println("Palindrome: " + palindromes);

    }
}
