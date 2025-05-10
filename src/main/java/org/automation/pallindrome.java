package org.automation;

import java.util.function.Consumer;

public class pallindrome {

    public static void main(String[] args){

        String original = "Level";
        String reversed = new StringBuilder(original).reverse().toString();
        Consumer<Boolean> checkPalindrome = result ->
                System.out.println(result ? "It's a Palindrome" : "It's not a Palindrome");
        checkPalindrome.accept(original.equalsIgnoreCase(reversed));
    }
}
