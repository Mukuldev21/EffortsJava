package org.automation;

import java.util.function.Predicate;

public class PalindromeUsingPredicate {

    public static void main(String[] args){

        String str1 = "Level";


        Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(new StringBuilder(s)
                .reverse().toString());

        System.out.println(isPalindrome.test(str1) ? "It's a Palindrome" : "It's not a Palindrome");

    }
}
