package org.service.order;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DPK06_Impl {

    // Reverts a string by converting it to a List of Characters,
    // using Collections.reverse() to reverse the list, and then
    // joining the characters back into a string.
    public static String revert(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        List<Character> charList = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        Collections.reverse(charList);
        return charList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        DPK06_Impl solution = new DPK06_Impl();
        String input = "Hello";
        String reversedString = solution.revert(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString); // Output: olleH
    }
}
