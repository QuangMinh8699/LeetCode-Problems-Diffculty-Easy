package TwoSum;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Dùng vòng lặp 2 chiều để quét mảng
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // Nếu tìm thấy 2 element có tổng bằng target
                if (nums[i] + nums[j] == target) {

                    // Trả về một mảng mới chứa 2 vị trí của 2 element đó
                    return new int[] { i, j };
                }
            }
        }

        // Ném ngoại lệ khi không có kết quả
        throw new IllegalArgumentException("");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        solution.twoSum(intArray, 10);
    }
}