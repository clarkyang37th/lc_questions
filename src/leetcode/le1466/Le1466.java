package leetcode.le1466;

import java.util.ArrayList;
import java.util.List;

public class Le1466 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 样例 1
        int n1 = 6;
        int[][] connections1 = {{0,1}, {1,3}, {2,3}, {4,0}, {4,5}};
        System.out.println("样例 1 结果: " + solution.minReorder(n1, connections1));

        // 样例 2
//        int n2 = 5;
//        int[][] connections2 = {{1,0}, {1,2}, {3,2}, {3,4}};
//        System.out.println("样例 2 结果: " + solution.minReorder(n2, connections2));

        // 样例 3
//        int n3 = 3;
//        int[][] connections3 = {{1,0}, {2,0}};
//        System.out.println("样例 3 结果: " + solution.minReorder(n3, connections3));
    }
}

class Solution {
    public int minReorder(int n, int[][] connections) {
        List<int[]>[] e = new List[n];
        for (int i = 0; i < n; i++) {
            e[i] = new ArrayList<int[]>();
        }
        for (int[] edge : connections) {
            e[edge[0]].add(new int[]{edge[1], 1});
            e[edge[1]].add(new int[]{edge[0], 0});
        }
        return dfs(0, -1, e);
    }

    public int dfs(int x, int parent, List<int[]>[] e) {
        int res = 0;
        for (int[] edge : e[x]) {
            if (edge[0] == parent) {
                continue;
            }
            res += edge[1] + dfs(edge[0], x, e);
        }
        return res;
    }
}

