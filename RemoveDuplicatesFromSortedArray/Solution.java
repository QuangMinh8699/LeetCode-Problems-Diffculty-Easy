package RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {

        // Khởi tạo biến temp có giá trị bằng
        // element đầu tiên của mảng
        int tmp = nums[0];

        // Khởi tạo biên k = 1
        int k = 1;

        // Sử dụng vòng lặp
        for (int i = 1; i < nums.length; i++) {

            // Nếu giá trị của element ở vị trí i
            // lớn hơn giá trị biến temp
            if (nums[i] > tmp) {

                // temp sẽ bằng giá trị element vị trí i
                tmp = nums[i];
                System.out.println(tmp);

                // Giá trị vị trí k bằng giá trị temp
                nums[k] = tmp;
                System.out.println(nums[k]);
                // K cộng thêm 1
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // int[] integerArray = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] integerArray = { 1, 1, 2 };
        solution.removeDuplicates(integerArray);
    }
}
