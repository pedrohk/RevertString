package org.service.order;

public class DPK01_Impl {

    //Reverts a string using StringBuilder's built-in append method.
    public String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        DPK01_Impl solution = new DPK01_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
