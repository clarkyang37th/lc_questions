package road_to_offer.q15;
//https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
public class Solution {
    // 你需要将n视为无符号值
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res += 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例
        int[] testCases = {
                Integer.parseUnsignedInt("00000000000000000000000000001011", 2),
                Integer.parseUnsignedInt("00000000000000000000000010000000", 2),
                Integer.parseUnsignedInt("11111111111111111111111111111101", 2)
        };

        for (int testCase : testCases) {
            int result = solution.hammingWeight(testCase);
            System.out.println("Input: " + Integer.toUnsignedString(testCase));
            System.out.println("Output: " + result);
        }
    }
}

