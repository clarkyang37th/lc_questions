package leetcode.le547;
class Solution {
    boolean[] visited;
    int cities;
    public int findCircleNum(int[][] isConnected) {
        cities = isConnected.length;
        visited = new boolean[cities];
        int provinces = 0;
        for (int i = 0; i< cities; i++){
            if (!visited[i]){
                dfs(isConnected, i);
                provinces ++;
            }
        }
        return provinces;


    }
    public void dfs(int [][]isConnected,int i){
        for (int j = 0; i < cities; j++){
            if(isConnected[i][i] == 1 && !visited[j]){
                visited[j] = true;
                dfs(isConnected, j);
            }
        }

    }
}
public class Le547 {

}
