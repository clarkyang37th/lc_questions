package leetcode.le383;

public class Le383 {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println("示例 1 的输出: " + new leetcode.le383.Solution().canConstruct(ransomNote, magazine));

    }

}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()> magazine.length()){
            return false;
        }
        int[] cnt = new int[26];
        for(char c: magazine.toCharArray()){
            cnt[c - 'a'] ++;
        }
        for(char c: ransomNote.toCharArray()){
            cnt[c - 'a'] --;
            if(cnt[c-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
