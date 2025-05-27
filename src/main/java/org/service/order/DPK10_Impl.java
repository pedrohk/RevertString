package org.service.order;

public class DPK10_Impl {

    // Reverts a string using a while loop, similar to the for loop approach, but explicitly managing the index.
    public static String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        int i = charArray.length - 1;
        while (i >= 0) {
            reversed.append(charArray[i]);
            i--;
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        DPK10_Impl solution = new DPK10_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
