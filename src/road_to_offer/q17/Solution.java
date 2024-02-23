package road_to_offer.q17;

public class Solution {
    public int[] countNumbers(int n) {
        int sum = (int)Math.pow(10, n);
        int[] res = new int[sum - 1];
        for (int i = 1; i < sum; i++) {
            res[i - 1] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int cnt = 2; // 示例输入
        int[] result = solution.countNumbers(cnt); // 执行countNumbers方法

        System.out.print("[");
        // 打印结果数组
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
