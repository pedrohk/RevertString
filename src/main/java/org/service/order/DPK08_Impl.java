package org.service.order;

public class DPK08_Impl {

    // Reverts a string using Stream API.
    public static String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {
        DPK08_Impl solution = new DPK08_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
