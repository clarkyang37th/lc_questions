package leetcode.le2788;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Le2788 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        List<String> words1 = Arrays.asList("one.two.three", "four.five", "six");
        char separator1 = '.';
        List<String> result1 = solution.splitWordsBySeparator(words1, separator1);
        System.out.println("Test case 1: " + result1);

        // Test case 2
        List<String> words2 = Arrays.asList("$easy$", "$problem$");
        char separator2 = '$';
        List<String> result2 = solution.splitWordsBySeparator(words2, separator2);
        System.out.println("Test case 2: " + result2);

        // Test case 3
        List<String> words3 = Arrays.asList("|||");
        char separator3 = '|';
        List<String> result3 = solution.splitWordsBySeparator(words3, separator3);
        System.out.println("Test case 3: " + result3);
    }
}

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            int length = word.length();
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                if (c == separator) {
                    if (sb.length() > 0) {
                        res.add(sb.toString());
                        sb.setLength(0);
                    }
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                res.add(sb.toString());
            }
        }
        return res;
    }
}
