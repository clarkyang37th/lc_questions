package leetcode.le718;

public class Le718 {
    public static void main(String[] args) {
        // 示例 1
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        System.out.println("示例 1 的输出: " + new Solution().findLength(nums1, nums2));

        // 示例 2
        int[] nums1_2 = {0, 0, 0, 0, 0};
        int[] nums2_2 = {0, 0, 0, 0, 0};
        System.out.println("示例 2 的输出: " + new Solution().findLength(nums1_2, nums2_2));
    }
}

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = nums1[i] == nums2[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}

