package road_to_offer.q16;

public class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        long y = n;
        if (n < 0) {
            y = -y;
            x = 1 / x;
        }
        while (y > 0) {
            if (y % 2 == 1) {
                res *= x;
            }
            x *= x;
            y /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例1
        double x1 = 2.00000;
        int n1 = 10;
        System.out.println("x = " + x1 + ", n = " + n1 + ", output = " + solution.myPow(x1, n1));

        // 测试用例2
        double x2 = 2.10000;
        int n2 = 3;
        System.out.println("x = " + x2 + ", n = " + n2 + ", output = " + solution.myPow(x2, n2));
    }
}
