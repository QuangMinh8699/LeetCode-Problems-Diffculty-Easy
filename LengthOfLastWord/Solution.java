package LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {

        // trim(): Loại bỏ đi toàn bộ khoảng cách ở đầu và cuối string
        // substring(): Lấy một mảng nhỏ trong mảng to của s
        // lastIndexOf(): Vị trí cuối cùng của kí tự
        String lastWord = s.trim().substring(s.trim().lastIndexOf(" ") + 1);
        return lastWord.length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLastWord("   fly me   to   the moon  ");
    }
}
