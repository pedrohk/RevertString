package org.service.order;

public class DPK02_Impl {

    //Reverts a string using StringBuilder's built-in reverse() method.
    public static String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }


    public static void main(String[] args) {
        DPK02_Impl solution = new DPK02_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
