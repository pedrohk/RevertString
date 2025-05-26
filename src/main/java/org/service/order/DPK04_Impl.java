package org.service.order;

public class DPK04_Impl {

    //Reverts a string using a for loop and string concatenation.
    public static String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


    public static void main(String[] args) {
        DPK04_Impl solution = new DPK04_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
