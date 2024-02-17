package road_to_offer.q11;
//https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/description/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例1
        int[] stock1 = {4, 5, 8, 3, 4};
        System.out.println(solution.stockManagement(stock1)); // 预期输出: 3

        // 测试用例2
        int[] stock2 = {5, 7, 9, 1, 2};
        System.out.println(solution.stockManagement(stock2)); // 预期输出: 1
    }

    public int stockManagement(int[] stock) {
        int temp = stock[0];
        int len = stock.length;
        int low = 0;
        int high = len -1;
        while(low <= high){
            int pivot = low + (high - low) /2;
            if(stock[pivot] < stock[high]){
                high = pivot;
            }else if(stock[pivot] > stock[high]){
                low = pivot + 1;
            }else{
                high -= 1;
            }
        }
        return stock[low];
    }
}
