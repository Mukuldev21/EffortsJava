package org.automation;

public class new12 {

    public void main(String[] args)
    {
        String s = "Aman";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equalsIgnoreCase(rev) ? "Its Palindrome" : "Its not a Palindrome");

    }
}
