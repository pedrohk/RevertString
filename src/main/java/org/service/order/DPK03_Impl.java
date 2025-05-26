package org.service.order;

public class DPK03_Impl {

    //Reverts a string using a traditional for loop, iterating from the end
    // of the string and appending characters to a new StringBuilder.
    public static String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed.append(charArray[i]);
        }
        return reversed.toString();
    }


    public static void main(String[] args) {
        DPK03_Impl solution = new DPK03_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
