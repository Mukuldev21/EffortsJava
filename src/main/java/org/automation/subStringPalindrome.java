package org.automation;

import java.util.HashSet;
import java.util.Set;

public class subStringPalindrome {

    //method to check palindrome
    public static boolean isPalindrome(String str){

        int left = 0, right = str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //Method to find all palindromic substring
    public static Set<String> findPalindromicSubstrings(String s){
        Set<String> palindromes = new HashSet<>();
        int n = s.length();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n;j++){
                String subStr = s.substring(i,j);
                if(subStr.length()>1 && isPalindrome(subStr)){
                    palindromes.add(subStr);
                }
            }
        }
        return palindromes;
    }

    public static void main(String[] args){

        String input = "Albsestetoomoo";
        Set<String> result = findPalindromicSubstrings(input);

        System.out.println("The Palindromic substrings are : " +result);
    }
}
