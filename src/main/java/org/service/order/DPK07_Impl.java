package org.service.order;

public class DPK07_Impl {

    // Reverts a string using a recursive approach.
    public static String revert(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) {
            return str;
        }
        return revert(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        DPK07_Impl solution = new DPK07_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
