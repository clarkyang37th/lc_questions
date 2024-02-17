package leetcode.le46;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Le46 {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4};
        Solution solution = new Solution();
        List<List<Integer>> result = solution.permute(testArray);

        // 打印结果
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }
        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(output, first, i);
            backtrack(n, output, res, first + 1);
            Collections.swap(output, first, i);
        }
    }
}
