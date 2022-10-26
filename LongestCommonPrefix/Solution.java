class Solution {
    public String longestCommonPrefix(String[] strs) {
        // lọc nếu chuỗi string rỗng thì return về ""
        if (strs.length == 0)
            return "";

        // Lấy element đầu tiên làm vật đo
        String prefix = strs[0];

        // dùng vòng lặp để check xem có chuỗi trùng nhau hay không
        for (int i = 1; i < strs.length; i++) {

            // kiểm tra xem prefix có trùng với element nào tiếp không
            while (strs[i].indexOf(prefix) != 0) {

                // nếu không trùng thì trừ dần các giá trị của prefix để kiểm tra lại một lần
                // nữa
                prefix = prefix.substring(0, prefix.length() - 1);

                // nếu prefix trừ hết giá trị thì trả về ""
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] arg1 = { "flower", "flow", "flight" };
        Solution solution = new Solution();
        solution.longestCommonPrefix(arg1);
    }
}