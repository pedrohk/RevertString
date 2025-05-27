package org.service.order;

import java.util.Stack;

public class DPK09_Impl {

    // Reverts a string using a Stack.
    public static String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        DPK09_Impl solution = new DPK09_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
