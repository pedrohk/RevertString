package org.service.order;

public class DPK05_Impl {

    //Reverts a string using StringBuffer's built-in reverse() method.
    public static String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            // pointers
            left++;
            right--;
        }
        return new String(charArray);
    }


    public static void main(String[] args) {
        DPK05_Impl solution = new DPK05_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
