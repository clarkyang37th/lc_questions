package road_to_offer.q13;
//https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
public class Solution {
    public int m, n, k;
    public boolean[][] visited;

    public int wardrobeFinishing(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        visited = new boolean[m][n];
        return dfs(0, 0);
    }

    public int dfs(int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || checksum(i, j) > k) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1, j) + dfs(i, j + 1);
    }

    public int checksum(int i, int j) {
        int res = 0;
        while (i > 0) {
            res += i % 10;
            i = i / 10;
        }
        while (j > 0) {
            res += j % 10;
            j = j / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int m = 4; // Example input
        int n = 7; // Example input
        int k = 5; // Example input
        int result = solution.wardrobeFinishing(m, n, k);
        System.out.println("The number of accessible cells: " + result);
    }
}
