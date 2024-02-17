package leetcode.le841;

import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean [] vis;
    int num;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        vis = new boolean[n];
        dfs(rooms,0);
        return num == n;



    }
    public void dfs(List<List<Integer>> rooms, int roomNumber){
        vis[roomNumber] = true;
        num ++;
        for (int check : rooms.get(roomNumber)){
            if (!vis[check]){
                dfs(rooms, check);
            }
        }
    }
}

public class Le841 {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();

        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());

        rooms.get(0).add(1);
        rooms.get(1).add(2);
        rooms.get(2).add(3);

        boolean result = new leetcode.le841.Solution().canVisitAllRooms(rooms);
        System.out.println(result);

    }
}