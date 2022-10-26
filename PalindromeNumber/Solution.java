package PalindromeNumber;

// Palindrome Integer: Số nguyên xuôi ngược đều giống nhau 

class Solution {

    // Plan 1:

    // public boolean isPalindrome(int x) {
    // String integer = Integer.toString(x);
    // Stack<Character> stack = new Stack<>();
    // for (int i = 0; i < integer.length(); i++) {
    // stack.push(integer.charAt(i));
    // }
    // String temp = "";
    // for (int i = 0; i < integer.length(); i++) {
    // temp += stack.lastElement();
    // stack.pop();
    // }
    // System.out.println(temp + " " + integer);
    // System.out.println(temp.compareTo(integer));
    // return temp.compareTo(integer) == 0 ? true : false;
    // }

    // Plan 2:
    public boolean isPalindrome(int x) {

        // Nếu x < 0 hoặc x là bội số của 10 thì trả về false
        // vd: -1, -2, 20, 50
        if (x < 0 || x % 10 == 0 && x != 0)
            return false;

        // Tạo ra nơi lưu trữ mới
        int newNumber = 0;
        while (x > newNumber) {
            // Nếu x > biến lưu trữ mới
            // Biến lưu trữ mới sẽ tăng thêm một đơn vị và cộng với chữ số cuối cùng của x
            newNumber = newNumber * 10 + x % 10;

            // x loại bỏ đi chữ số cuối cùng
            x /= 10;

            // Vd: 121 > 0 => newNumber = 0 * 10 + 121 % 10 = 1
            // 12 > 0 => newNumber = 1 * 10 + 12 % 10 = 12

            // số 121 được coi là palindrome number vì nếu tách làm đôi ta có thể thấy 12 =
            // 12
        }

        // trả về true of false nếu x = newNumber hoặc x = newNumber / 10
        // VD: 12 = 12 hoặc 1 = 1
        return x == newNumber || x == newNumber / 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome(1231);
    }
}
