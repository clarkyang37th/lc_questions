package leetcode.le75;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        return word1+word2;
    }
}

public class Le75 {
    public static void main(String[] args) {
        {
            String word1 = "abc", word2 = "pqr";
            String result = new Solution().mergeAlternately(word1, word2);
            System.out.println(result);
        }
        {
            String word1 = "ab", word2 = "pqrs";
            String result = new Solution().mergeAlternately(word1, word2);
            System.out.println(result);
        }
    }
}
