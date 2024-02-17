package leetcode.le1456;


import java.util.HashSet;
import java.util.Set;

public class Le1456 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String nums1 = "abciiidef";
        int k1 = 3;
        int result1 = solution.maxVowels(nums1, k1);
        System.out.println("Test case 1 result: " + result1);

        // Test case 2
        String nums2 = "aeiou";
        int k2 = 2;
        int result2 = solution.maxVowels(nums2, k2);
        System.out.println("Test case 2 result: " + result2);
    }

}
class Solution {
    public int maxVowels(String s, int k) {
        int len = s.length();
        int left = 0;
        int right = k -1;
        int maxcount = 0;
        int count = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i = 0; i<=right; i++){
            if(vowels.contains(s.charAt(i))) {
                count++;

            }
        }
        maxcount = Math.max(maxcount, count);
        System.out.println("maxcount =" + maxcount);
        while(right< len){
            if(vowels.contains(s.charAt(left))){
                count--;

            }
            left++;
            if(vowels.contains(s.charAt(right))){
                count ++;
            }
            right ++;
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;

    }
}