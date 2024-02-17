package road_to_offer.q12;
//https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/description/
public class Solution {
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int m;
    int n;

    public static void main(String[] args) {
        char[][] grid = {
                {'a', 'b'},
                {'c', 'd'}
        };
        String target = "cdba";

        Solution solution = new Solution();
        boolean result = solution.wordPuzzle(grid, target);
        System.out.println("Can target \"" + target + "\" be found: " + result);
    }

    public boolean wordPuzzle(char[][] grid, String target) {
        m = grid.length;
        n = grid[0].length;
        int len = target.length();
        int[][] seen = new int[m][n];
        for(int i = 0; i < m; i++){
            for ( int j = 0; j < n ; j++){
                if (dfs(grid, i, j, seen, target, 0)){
                    return true;

                }

            }
        }
        return false;


    }
    public boolean dfs(char[][] grid, int i, int j, int[][] seen, String target, int k){

        if(grid[i][j] != target.charAt(k)){
            return false;
        }
        if(k == target.length()-1 ){
            return true;
        }
        seen[i][j] = 1;
        for(int[] direction : directions){
            int newi = i+ direction[0];
            int newj = j + direction[1];
            if(newi >= 0 && newi < m && newj >=0 && newj < n && seen[newi][newj] == 0){
                if(dfs(grid, newi, newj, seen, target, k+1)){
                    return true;
                }
                seen[i][j] = 0;


            }

        }

        return false;
    }
}
