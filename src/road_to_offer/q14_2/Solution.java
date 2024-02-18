package road_to_offer.q14_2;
//https://leetcode.cn/problems/jian-sheng-zi-ii-lcof/
public class Solution {
    public int cuttingBamboo(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int p = 1000000007; // Modulo value to prevent overflow
        int res = n / 3;
        int mod = n % 3;
        if (mod == 0) {
            return (int)pow(3, res);
        } else if (mod == 1) {
            return (int)(pow(3, res - 1) * 4 % p);
        } else { // mod == 2
            return (int)(pow(3, res) * 2 % p);
        }
    }

    public long pow(int a, int n) {
        long res = 1;
        int p = 1000000007;
        for (int i = 0; i < n; i++) {
            res = (res * a) % p;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int bamboo_len = 12; // Given input
        int result = solution.cuttingBamboo(bamboo_len); // Execute cuttingBamboo method
        System.out.println("Output: " + result); // Print the result
        // Expected result: 81
    }
}
