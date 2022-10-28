public class Solution {
    public int searchInsert(int[] nums, int target) {

        // Tạo biến k có giá trị bằng 0
        int k = 0;

        // Sử dụng vòng lặp
        for (int i = 0; i < nums.length; i++) {

            // Nếu trong mảng tìm thấy giá trị bằng targer
            if (nums[i] == target) {

                // Trả về ví trị giá trị đó
                return i;
            }

            // Nếu giá trị tại vị trí i nhỏ hơn target
            if (nums[i] < target)
                // k cộng thêm 1
                k++;
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 6 };
        int target = 2;

        Solution solution = new Solution();
        solution.searchInsert(nums, target);
    }
}
