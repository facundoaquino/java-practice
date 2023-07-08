package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
* Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
*
*
*
* */
public class commonCharacterCount {
    public static void main(String[] args) {
        int result = solution("aabcc", "adcaa");
        System.out.println("result = " + result);

    }
    public static int solution(String s1, String s2) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s2);

        for (char c : s1.toCharArray()) {
            int index = sb.indexOf(String.valueOf(c));
            if (index != -1) {
                count++;
                sb.deleteCharAt(index);
            }
        }

        return count;
    }
}
