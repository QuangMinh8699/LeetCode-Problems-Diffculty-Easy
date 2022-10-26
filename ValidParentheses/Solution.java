import java.util.Stack;

// target:
// input: "(){}[]", "({[]})" -> true
// input: "(}[", "([]}", "([)]" -> false

class Solution {
    public boolean isValid(String s) {

        // Nếu s không chia được cho 2 thì trả về false
        if (s.length() % 2 != 0)
            return false;

        // Tạo một stack (FILO - First in last out )
        Stack<Character> stack = new Stack<>();

        // Quét các phần tử trong mảng
        for (char c : s.toCharArray()) {

            // nếu phần tử là kí tự so sánh thì stack sẽ đẩy kí tự ngược lại
            if (c == '(') {
                stack.push(')');

                // tương tự
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');

                // nếu hết kí tự để so sánh hoặc kí tự tiếp theo khác với kí tự so sánh thì sẽ
                // trả về false
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        // nếu stack rỗng, trả về true còn không thì trả về false
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isValid("(]");
    }
}