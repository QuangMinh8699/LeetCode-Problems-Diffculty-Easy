package RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        // Tạo biến k có dạng integer bằng 0
        int k = 0;

        // Sử dụng vòng lặp
        for (int i = 0; i < nums.length; i++) {

            // Nếu giá trị có vị trí ở i khác giá trị var
            if (nums[i] != val) {

                // Giá trị có vị trí ở k bằng giá trị ở ví trí i
                nums[k] = nums[i];

                // k cộng thêm 1
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 2, 4, 3, 1 };
        int val = 2;
        solution.removeElement(nums, val);
    }
}
