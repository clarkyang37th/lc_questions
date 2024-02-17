package leetcode.le1679;
import java.util.TreeMap;

public class Le1679 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        int k1 = 5;
        int result1 = solution.maxOperations(nums1, k1);
        System.out.println("Test case 1 result: " + result1);

        // Test case 2
        int[] nums2 = {3, 1, 3, 4, 3};
        int k2 = 6;
        int result2 = solution.maxOperations(nums2, k2);
        System.out.println("Test case 2 result: " + result2);
    }

}


class Solution {
    public int maxOperations(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // 统计每个数字出现的次数
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        for (int num : map.keySet()) {
            if (map.containsKey(k - num)) {
                // 如果两个数字相同，需要特殊处理
                if (2 * num == k) {
                    max += map.get(num) / 2;
                } else {
                    int pairs = Math.min(map.get(num), map.get(k - num));
                    max += pairs;
                    // 更新配对元素的计数
                    map.put(k - num, map.get(k - num) - pairs);
                }
            }
        }
        return max;
    }
}