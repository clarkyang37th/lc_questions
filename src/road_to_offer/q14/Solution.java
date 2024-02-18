package road_to_offer.q14;
//https://leetcode.cn/problems/jian-sheng-zi-lcof/
public class Solution {

    public int cuttingBamboo(int n) {
        if( n <= 2){
            return n;
        }
        if( n == 3){
            return 2;
        }
        int res = n / 3;
        int mod = n % 3;
        if( mod  == 0){
            return pow(3, res);
        }else if(mod == 1){
            return pow(3, res - 1) * 4;
        }else{ // mod == 2
            return pow(3, res) * 2;
        }
    }

    public int pow(int a, int b){
        int sum = 1;
        for(int i = 0; i < b; i++){
            sum *= a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int bamboo_len = 12; // 示例输入
        int result = solution.cuttingBamboo(bamboo_len); // 执行cuttingBamboo方法
        System.out.println("Output: " + result); // 打印结果
        // 预期结果: 81
    }
}
